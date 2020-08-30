package com.itdr.utils;

/**
 * ClassName: DateUtil
 * 日期: 2020/2/27 18:31
 *
 * @author Air张
 * @since JDK 1.8
 */
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;

public class DateUtil {

    public   static  final String STANDARD_FORMAT="yyyy-MM-dd HH:mm:ss";

    /**
     * Date-->string
     * */

    public static  String  dateToStr(Date date,String formate){

        DateTime dateTime=new DateTime(date);
        return dateTime.toString(formate);
    }
    public static  String  dateToStr(Date date){

        DateTime dateTime=new DateTime(date);
        return dateTime.toString(STANDARD_FORMAT);
    }

    /**
     * string-->Date
     * */
    public static  Date  strToDate(String str){
        DateTimeFormatter dateTimeFormatter= DateTimeFormat.forPattern(STANDARD_FORMAT);
        DateTime dateTime=dateTimeFormatter.parseDateTime(str);
        return dateTime.toDate();
    }
    public static  Date  strToDate(String str,String format){
        DateTimeFormatter dateTimeFormatter= DateTimeFormat.forPattern(format);
        DateTime dateTime=dateTimeFormatter.parseDateTime(str);
        return dateTime.toDate();
    }


}
