package com.xiaoyun.utils;



import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverterUtils implements Converter<String,Date> {

    private static final String REG_DATE1 = "^\\d{4}-\\d{2}-\\d{2}\\s\\d{2}:\\d{2}$";
    private static final String REG_DATE2 = "^\\d{4}/\\d{2}/\\d{2}\\s\\d{2}:\\d{2}$";
    private static final String REG_DATE3 = "^\\d{4}\\d{2}\\d{2}\\s\\d{2}:\\d{2}$";

    private SimpleDateFormat getSimpleDateFormat(String source){
        SimpleDateFormat sdf = null;
        if(source.matches(REG_DATE1)){
            sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        }else if (source.matches(REG_DATE2)){
            sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm");
        }else if (source.matches(REG_DATE3)){
            sdf = new SimpleDateFormat("yyyyMMdd hh:mm");
        }
        return sdf;
    }
    @Override
    public Date convert(String source) {
        SimpleDateFormat sdf = getSimpleDateFormat(source);
        Date date = null;
        try {
            date = sdf.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
