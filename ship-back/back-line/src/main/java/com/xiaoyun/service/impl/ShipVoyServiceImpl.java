package com.xiaoyun.service.impl;

import com.xiaoyun.mapper.ShipVoyMapper;
import com.xiaoyun.pojo.ShipVoyHistoryPojo;
import com.xiaoyun.pojo.ShipVoyPojo;
import com.xiaoyun.service.IShipVoyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class ShipVoyServiceImpl implements IShipVoyService {

    @Autowired
    ShipVoyMapper shipVoyMapper;
    @Override
    public ShipVoyPojo getByNumber(int svNumber) {
        return shipVoyMapper.getByNumber(svNumber);
    }

    @Override
    public List<ShipVoyPojo> getByShipId(int shipId) {

        return shipVoyMapper.getByShipId(shipId);
    }

    @Override
    public List<ShipVoyPojo> getByStatus(byte svStatus) {

        return shipVoyMapper.getByStatus(svStatus);
    }

    @Override
    public ShipVoyPojo getByShipIdMax(int shipId) {

        return shipVoyMapper.getByShipIdMax(shipId);
    }

    @Override
    public boolean save(ShipVoyPojo shipVoyPojo) {

        return shipVoyMapper.save(shipVoyPojo)>0;
    }

    @Override
    public boolean saveHistory(ShipVoyHistoryPojo shipVoyHistoryPojo) {

        return shipVoyMapper.saveHistory(shipVoyHistoryPojo)>0;
    }

    @Override
    public ShipVoyPojo deleteById(int svId) {

        return shipVoyMapper.deleteById(svId);
    }

    @Override
    public List<ShipVoyHistoryPojo> converterPojo(List<ShipVoyPojo> list) {
        List<ShipVoyHistoryPojo> list1 = new ArrayList<>();
        for(ShipVoyPojo shipVoyPojo:list){
               ShipVoyHistoryPojo shipVoyHistoryPojo = new ShipVoyHistoryPojo();
               shipVoyHistoryPojo.setSvShipId(shipVoyPojo.getSvShipId());
               shipVoyHistoryPojo.setSvNumber(shipVoyPojo.getSvNumber());
               shipVoyHistoryPojo.setStartTime(shipVoyPojo.getStartTime());
               shipVoyHistoryPojo.setReachTime(shipVoyPojo.getReachTime());
               shipVoyHistoryPojo.setSvStatus(shipVoyPojo.getSvStatus());
               list1.add(shipVoyHistoryPojo);
        }
        return list1;
    }

    @Override
    public void batchsaveHistory(List<ShipVoyPojo> shipVoyPojos) {
        List<ShipVoyHistoryPojo> list = converterPojo(shipVoyPojos);
        shipVoyMapper.batchsaveHistory(list);
    }


}
