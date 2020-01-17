package com.xiaoyun.config;


import com.xiaoyun.pojo.ShipPojo;
import com.xiaoyun.pojo.ShipVoyPojo;
import com.xiaoyun.service.IShipService;
import com.xiaoyun.service.IShipVoyService;
import com.xiaoyun.service.impl.ShipVoyServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

//未完工,核心类,用于自动化转移表中旧数据,动态生成新数据,类似高铁车次,这样用户可以连续查询多条船次记录

@Transactional
@Configuration      //1.主要用于标记配置类，兼备Component的效果。
@EnableScheduling   // 2.开启定时任务
public class CopyDataConfig {

    @Autowired
    IShipVoyService shipVoyService;

    @Autowired
    IShipService shipService;
    @Scheduled(cron = "0/60 * * * * ?")
    //或直接指定时间间隔，例如：5秒
    //@Scheduled(fixedRate=5000)
    private void configureTasks(){
        List<ShipVoyPojo> list = shipVoyService.getByStatus((byte)-1);
//        try {
//            shipVoyService.batchsaveHistory(list);
//        } catch (Exception e) {
//            System.out.println("转移历史记录失败");
//            e.printStackTrace();
//        }

        for(ShipVoyPojo svp:list){
            int shipId = svp.getSvShipId();
            ShipPojo shipPojo = shipService.getByShipId(shipId);
            ShipVoyPojo shipVoyPojo = shipVoyService.getByShipIdMax(shipId);
            ShipVoyPojo shipVoyPojo1 = new ShipVoyPojo();
            Date date0 = shipVoyPojo.getReachTime();
            long datestramp = date0.getTime();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            datestramp += shipPojo.getShipRundays()*86400000;
            Date startdate = new Date(datestramp);//启航日期
            String startdatestr = sdf.format(startdate);
            int svNumber = 0;
            String startdatestrnew = startdatestr.replaceAll("-","");
            svNumber += Integer.parseInt(startdatestrnew.substring(0,8));
            datestramp += shipPojo.getShipIntervaldays()*86400000;
            Date reachdate = new Date(datestramp);//到港日期
            shipVoyPojo1.setSvShipId(shipId);
            shipVoyPojo1.setSvNumber(svNumber);
            shipVoyPojo1.setStartTime(startdate);
            shipVoyPojo1.setReachTime(reachdate);
            shipVoyPojo1.setSvStatus((byte)1);
            boolean f = shipVoyService.save(shipVoyPojo1);
            if(!f){
                break;
            }
        }

    }

}
