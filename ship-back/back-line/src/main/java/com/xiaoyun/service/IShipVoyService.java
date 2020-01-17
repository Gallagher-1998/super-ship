package com.xiaoyun.service;

import com.xiaoyun.pojo.ShipVoyHistoryPojo;
import com.xiaoyun.pojo.ShipVoyPojo;

import java.util.List;

public interface IShipVoyService {
    ShipVoyPojo getByNumber(int svNumber);//根据船次名称直接搜索
    List<ShipVoyPojo> getByShipId(int shipId);//根据船id
    List<ShipVoyPojo> getByStatus(byte svStatus);//根据状态
    ShipVoyPojo getByShipIdMax(int shipId);//根据船id获取该船最后出航船次
    boolean save(ShipVoyPojo shipVoyPojo);//保存新船次
    boolean saveHistory(ShipVoyHistoryPojo shipVoyHistoryPojo);//转移数据到历史记录
    ShipVoyPojo deleteById(int svId);//移除船次
    List<ShipVoyHistoryPojo> converterPojo(List<ShipVoyPojo> list);
    void batchsaveHistory(List<ShipVoyPojo> shipVoyPojos);
}
