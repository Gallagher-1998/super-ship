package com.xiaoyun.service.impl;

import com.xiaoyun.mapper.ShipMapper;
import com.xiaoyun.pojo.ShipPojo;
import com.xiaoyun.service.IShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ShipServiceImpl implements IShipService {
    @Autowired
    ShipMapper shipMapper;
    @Override
    public List<ShipPojo> getByseaName(int routeId) {
        return shipMapper.getByseaName(routeId);
    }

    @Override
    public ShipPojo getByUserId(int userId) {

        return shipMapper.getByUserId(userId);
    }

    @Override
    public boolean save(ShipPojo shipPojo) {

        return shipMapper.save(shipPojo)>0;
    }

    @Override
    public boolean deleteShip(int shipId) {

        return shipMapper.deleteShip(shipId);
    }

    @Override
    public boolean updateShip(ShipPojo shipPojo) {

        return shipMapper.updateShip(shipPojo);
    }

    @Override
    public ShipPojo getByShipId(int shipId) {
        return shipMapper.getByShipId(shipId);
    }

}
