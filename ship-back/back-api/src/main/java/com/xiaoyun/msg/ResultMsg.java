package com.xiaoyun.msg;


public class ResultMsg {

   private int code = 0x00000000;//这个值是1,默认成功
   private String description = "操作成功";//默认成功

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
