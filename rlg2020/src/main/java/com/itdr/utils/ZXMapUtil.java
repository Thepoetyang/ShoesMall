package com.itdr.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * ClassName: ZXMapUtil
 * 日期: 2020/2/25 14:53
 *
 * @author Air张
 * @since JDK 1.8
 */
public class ZXMapUtil {
    private static Map m = new HashMap();
    static {
        m.put("A","优秀");
        m.put("B","良好");
        m.put("C","一般");
        m.put("D","合格");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <3 ; i++) {
            String key = sc.next();
            String value = getValue(key);
            System.out.println(value);
        }
    }

    public static String getValue(String key){
        String o = (String) m.get(key);
        return o;
    }
}
