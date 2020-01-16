package com.xiaoyun.pojo;

import lombok.Data;

import java.util.Set;

@Data
public class SeaRoutePojo {

    private int routeId;
    private String routeName;//航线名称
    private String startStation;//起始港
    private String reachStation;//终点港
    private Set<ShipPojo> ships;//该条航线下面有几条船航行
}
