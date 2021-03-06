package com.xiaoyun.pojo;

import lombok.Data;

import java.util.Date;

//这是一个船次历史记录类 我们会将过期的船次信息置于历史记录表中
@Data
public class ShipVoyHistoryPojo {

    private int svId;
    private int svShipId;//归属船id
    private int svNumber;//船次号,区别于自增主键
    private byte svStatus;//船次状态:-1为过期(航行完) 0为正在航行中  1为待航行
    private Date startTime;//启航时间,我们精确到分钟
    private Date reachTime;//终点时间,我们精确到分钟
    private ShipPojo shipPojo;//归属于哪条船

    //两张表存在关联关系,不管有无外键,尽量重写一方的toString方法,避免重复引用,死循环堆栈溢出
    //mybatis框架只需要重写toString,hashcode不需要重写
    //lombok动态生成的toString会被我们重写的覆盖,而使用我们的


    @Override
    public String toString() {
        return "ShipVoyHistoryPojo{" +
                "svId=" + svId +
                ", svShipId=" + svShipId +
                ", svNumber=" + svNumber +
                ", svStatus=" + svStatus +
                ", startTime=" + startTime +
                ", reachTime=" + reachTime +
                '}';
    }
}
