package com.xiaoyun.utils;

public class StringUtils {

    //手机号正则
   public static final String REG_MOBILE
           = "^[1](([3|5|8][\\d])|([4][5,6,7,8,9])|([6][5,6])|([7][3,4,5,6,7,8])|([9][8,9]))[\\d]{8}$";
   //简单密码正则,标点符号只支持"-,_,.,@,!,#"
   public static final String REG_PASSWORD ="[0-9a-zA-Z\\-\\_\\.\\@\\!\\#]{6,20}";
   //简单邮箱正则
   public static final String REG_MAIL = "[\\w\\-]+@[a-zA-Z0-9]+(\\.[A-Za-z]{2,5}){1,2}";
   //简单固定电话正则
   public static final String REG_FIXEDPHONE = "0\\d{2,3}-\\d{7,9}";
    public static boolean isNull(String str){
        return null == str || "".equals(str);
    }
    public static boolean isMobile(String str){
        return str.matches(REG_MOBILE);
    }
    public static boolean isPassword(String str){
        return str.matches(REG_PASSWORD);
    }
    public static boolean isMail(String str){
        return str.matches(REG_MAIL);
    }
    public static boolean isFixedPhone(String str){
        return str.matches(REG_FIXEDPHONE);
    }

}
