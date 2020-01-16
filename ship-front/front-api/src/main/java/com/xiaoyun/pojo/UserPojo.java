package com.xiaoyun.pojo;

import lombok.Data;
import java.io.Serializable;

@Data
public class UserPojo implements Serializable {
    private int vid;
    private String vName;
    private String vPass;
    private String vEmail;
    private String vRw;
    private String realName;
    private String vAddress;
    private String vCode;
    private String vTel;
    private String vMob;

    private String vRpass;

}
