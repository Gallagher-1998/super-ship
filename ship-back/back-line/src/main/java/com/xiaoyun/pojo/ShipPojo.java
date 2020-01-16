package com.xiaoyun.pojo;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;

import java.util.Set;

@Data
public class ShipPojo {

    private int shipId;
    private int shipUid;//使用者id,我们称之为"船长"
    private int shipRundays;//航行天数
    private int shipIntervaldays;//间歇期天数
    private byte shipStatus;//船当前状态  可用不可用
    private int targetTons;//目标容量,吨位数
    private double shipPrice;//单价,元/吨
    private SeaRoutePojo seaRoutePojo;//归属的航线

    private Set<ShipVoyPojo> shipVoys;//对应的船次

    //两张表存在关联关系,不管有无外键,尽量重写一方的toString方法,避免重复引用,死循环堆栈溢出
    //mybatis框架只需要重写toString,hashcode不需要重写
    //lombok动态生成的toString会被我们重写的覆盖,而使用我们的


    @Override//移除seaRoute
    public String toString() {
        return "ShipPojo{" +
                "shipId=" + shipId +
                ", shipUid=" + shipUid +
                ", shipRundays=" + shipRundays +
                ", shipIntervaldays=" + shipIntervaldays +
                ", shipStatus=" + shipStatus +
                ", targetTons=" + targetTons +
                ", shipPrice=" + shipPrice +
                ", shipVoys=" + shipVoys +
                '}';
    }
}
