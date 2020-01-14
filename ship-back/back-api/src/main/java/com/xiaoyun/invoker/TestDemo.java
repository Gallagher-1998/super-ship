package com.xiaoyun.invoker;


import com.xiaoyun.utils.StringUtils;

public class TestDemo {//测试工具类
public static void main(String[] args){
    /*String str1 = "19990122 11:22";
    String str2 = "1999/01/22 11:22";
    String str3 = "1999-01-22 11:22";
    DateConverterUtils dateConverterUtils = new DateConverterUtils();
    Date date1 = dateConverterUtils.convert(str1);
    Date date2 = dateConverterUtils.convert(str2);
    Date date3 = dateConverterUtils.convert(str3);
    System.out.println(date1);
    System.out.println(date2);
    System.out.println(date3);*/
    /*
    String str1 = "18666555447";
    String str2 = "11566555552";
    String str3 = "1893333333";
    boolean f1 = StringUtils.isMobile(str1);
    boolean f2 = StringUtils.isMobile(str2);
    boolean f3 = StringUtils.isMobile(str3);
    System.out.println(f1);
    System.out.println(f2);
    System.out.println(f3);
    */
    /*
    String str1 = "sven123@qq.com";
    String str2 = "sven123@mail.com.cn";
    String str3 = "@333ytfyg";
    boolean f1 = StringUtils.isMail(str1);
    boolean f2 = StringUtils.isMail(str2);
    boolean f3 = StringUtils.isMail(str3);
    System.out.println(f1);
    System.out.println(f2);
    System.out.println(f3);
    */
    String str1 = "025-8788778";
    String str2 = "0512-99445578";
    String str3 = "05151-89992231";
    boolean f1 = StringUtils.isFixedPhone(str1);
    boolean f2 = StringUtils.isFixedPhone(str2);
    boolean f3 = StringUtils.isFixedPhone(str3);
    System.out.println(f1);
    System.out.println(f2);
    System.out.println(f3);
}

}
