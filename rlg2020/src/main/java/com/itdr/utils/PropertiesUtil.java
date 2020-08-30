package com.itdr.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * ClassName: PropertiesUtil
 * 日期: 2020/2/20 11:12
 *
 * @author Air张
 * @since JDK 1.8
 */
public class PropertiesUtil {
    private static Properties p;
    static {
        InputStream in = PropertiesUtil.class.getClassLoader().getResourceAsStream("initparam.properties");
        p = new Properties();
        try {
            p.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getValue(String key){
        String s = p.getProperty(key);
        return s;
    }

    public static void main(String[] args) {
        System.out.println(getValue("ImageHost"));
    }
}
