package com.itdr.utils;

import java.math.BigDecimal;

/**
 * ClassName: BigDecimalUtil
 * 日期: 2020/2/21 14:17
 *
 * @author Air张
 * @since JDK 1.8
 */
public class BigDecimalUtil {

    /**
     * 加法运算
     */
    public static BigDecimal add(double d1, double d2) {

        BigDecimal bigDecimal = new BigDecimal(Double.toString(d1));
        BigDecimal bigDecimal1 = new BigDecimal(Double.toString(d2));
        return bigDecimal.add(bigDecimal1);
    }

    /**
     * 减法法运算
     */
    public static BigDecimal sub(double d1, double d2) {

        BigDecimal bigDecimal = new BigDecimal(String.valueOf(d1));
        BigDecimal bigDecimal1 = new BigDecimal(String.valueOf(d2));
        return bigDecimal.subtract(bigDecimal1);
    }

    /**
     * 乘法运算
     */
    public static BigDecimal mul(double d1, double d2) {

        BigDecimal bigDecimal = new BigDecimal(String.valueOf(d1));
        BigDecimal bigDecimal1 = new BigDecimal(String.valueOf(d2));
        return bigDecimal.multiply(bigDecimal1);
    }


    /**
     * 除法运算,保留两位小数，四舍五入
     */
    public static BigDecimal div(double d1, double d2) {

        BigDecimal bigDecimal = new BigDecimal(String.valueOf(d1));
        BigDecimal bigDecimal1 = new BigDecimal(String.valueOf(d2));
        return bigDecimal.divide(bigDecimal1, 2, BigDecimal.ROUND_HALF_UP);
    }

}

