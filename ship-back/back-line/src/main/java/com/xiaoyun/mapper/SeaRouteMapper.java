package com.xiaoyun.mapper;

import com.xiaoyun.pojo.SeaRoutePojo;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public interface SeaRouteMapper {

    int save(SeaRoutePojo seaRoutePojo);//添加航线方法
    SeaRoutePojo getRouteByName(String routeName);//根据姓名查询
    SeaRoutePojo getRouteByStation(SeaRoutePojo seaRoutePojo);//根据港口查询
    List<SeaRoutePojo> getlist();//获取航线集合
    boolean deleteRoute(int routeId);//删除航线
    boolean updateRoute(SeaRoutePojo seaRoutePojo);//更新航线


}
