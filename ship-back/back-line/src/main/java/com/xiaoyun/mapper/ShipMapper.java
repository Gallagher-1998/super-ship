package com.xiaoyun.mapper;

import com.xiaoyun.pojo.ShipPojo;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface ShipMapper {

    List<ShipPojo> getByseaName(int routeId);//根据航线id查询船列表
    ShipPojo getByUserId(int userId);//根据使用者id查询船
    int save(ShipPojo shipPojo);//新增船
    boolean deleteShip(int shipId);//根据船id删除
    boolean updateShip(ShipPojo shipPojo);//更新船信息
    ShipPojo getByShipId(int shipId);//根据船id查询船



}
