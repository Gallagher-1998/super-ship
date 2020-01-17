package com.xiaoyun.web;

import com.xiaoyun.msg.ResultMsg;
import com.xiaoyun.pojo.SeaRoutePojo;
import com.xiaoyun.pojo.ShipPojo;
import com.xiaoyun.service.ISeaRouteService;
import com.xiaoyun.service.IShipService;
import com.xiaoyun.service.IShipVoyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LineController {
    @Autowired
    ISeaRouteService seaRouteService;
    @Autowired
    IShipService shipService;
    @Autowired
    IShipVoyService shipVoyService;
    @ResponseBody
    @RequestMapping("getinfo")
    public ResultMsg getinfo(){
       System.out.println("请求成功了");
        SeaRoutePojo seaRoutePojo0 = new SeaRoutePojo();
        seaRoutePojo0.setRouteName("东海快航");
        seaRoutePojo0.setStartStation("上海");
        seaRoutePojo0.setReachStation("东京");
        boolean f = seaRouteService.save(seaRoutePojo0);
        System.out.println(f);
       return new ResultMsg();
    }
}
