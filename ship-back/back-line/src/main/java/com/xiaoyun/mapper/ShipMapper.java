package com.xiaoyun.mapper;

import com.xiaoyun.pojo.ShipPojo;

import java.util.List;

public interface ShipMapper {

    List<ShipPojo> getByseaName(int routeId);//根据航线id查询船列表
    ShipPojo getByUserId(int userId);//根据使用者id查询船
    ShipPojo save(ShipPojo shipPojo);//新增船
    boolean deleteShip(int shipId);//根据船id删除
    boolean updateShip(ShipPojo shipPojo);




}
