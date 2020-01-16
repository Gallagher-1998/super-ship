package com.xiaoyun.mapper;

import com.xiaoyun.pojo.ShipVoyHistoryPojo;
import com.xiaoyun.pojo.ShipVoyPojo;

import java.util.List;

public interface ShipVoyMapper {

    ShipVoyPojo getByNumber(int svNumber);//根据船次名称直接搜索
    List<ShipVoyPojo> getByShipId(int shipId);//根据船id
    List<ShipVoyPojo> getByStatus(byte svStatus);//根据状态
    ShipVoyPojo getByShipIdMax(int shipId);//根据船id获取该船最后出航船次
    ShipVoyPojo save(ShipVoyPojo shipVoyPojo);//保存新船次
    ShipVoyHistoryPojo saveHistory(ShipVoyHistoryPojo shipVoyHistoryPojo);//转移数据到历史记录

}
