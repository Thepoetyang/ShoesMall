package com.itdr.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5加密工具类
 * */
public class MD5Util {

  // 全局数组
  private final static String[] strDigits = { "0", "1", "2", "3", "4", "5",
          "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };

  public MD5Util() {
  }

  // 返回形式为数字跟字符串
  private static String byteToArrayString(byte bByte) {
    int iRet = bByte;
    // System.out.println("iRet="+iRet);
    if (iRet < 0) {
      iRet += 256;
    }
    int iD1 = iRet / 16;
    int iD2 = iRet % 16;
    return strDigits[iD1] + strDigits[iD2];
  }

  // 返回形式只为数字
  private static String byteToNum(byte bByte) {
    int iRet = bByte;
    System.out.println("iRet1=" + iRet);
    if (iRet < 0) {
      iRet += 256;
    }
    return String.valueOf(iRet);
  }

  // 转换字节数组为16进制字串
  private static String byteToString(byte[] bByte) {
    StringBuffer sBuffer = new StringBuffer();
    for (int i = 0; i < bByte.length; i++) {
      sBuffer.append(byteToArrayString(bByte[i]));
    }
    return sBuffer.toString();
  }
  /**
   * 加密
   *
   * */
  public static String getMD5Code(String strObj) {
    String resultString = null;
    try {
      //加盐值的MD5
      resultString = new String(strObj+"businesssdafaqj23ou89ZXcj@#$@#$#@KJdjklj;D../dSF.,");
      MessageDigest md = MessageDigest.getInstance("MD5");
      // md.digest() 该函数返回值为存放哈希值结果的byte数组
      resultString = byteToString(md.digest(strObj.getBytes()));
    } catch (NoSuchAlgorithmException ex) {
      ex.printStackTrace();
    }
    return resultString;
  }

  public static void main(String[] args) {
    System.out.println(getMD5Code("123456"));
  }

}