package com.xiaoyun.service.impl;

import com.xiaoyun.mapper.SeaRouteMapper;
import com.xiaoyun.pojo.SeaRoutePojo;
import com.xiaoyun.service.ISeaRouteService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SeaRouteServiceImpl implements ISeaRouteService {

    @Autowired
    SeaRouteMapper seaRouteMapper;
    @Override
    public boolean save(SeaRoutePojo seaRoutePojo) {
        return seaRouteMapper.save(seaRoutePojo)>0;
    }

    @Override
    public SeaRoutePojo getRouteByName(String routeName) {

        return seaRouteMapper.getRouteByName(routeName);
    }

    @Override
    public SeaRoutePojo getRouteByStation(SeaRoutePojo seaRoutePojo) {

        return seaRouteMapper.getRouteByStation(seaRoutePojo);
    }

    @Override
    public List<SeaRoutePojo> getlist() {

        return seaRouteMapper.getlist();
    }

    @Override
    public boolean deleteRoute(int routeId) {

        return seaRouteMapper.deleteRoute(routeId);
    }

    @Override
    public boolean updateRoute(SeaRoutePojo seaRoutePojo) {

        return seaRouteMapper.updateRoute(seaRoutePojo);
    }
}
