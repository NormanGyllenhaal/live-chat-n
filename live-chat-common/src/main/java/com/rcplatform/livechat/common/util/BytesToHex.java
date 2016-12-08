package com.rcplatform.livechat.common.util;

/**
 * Created by yang peng on 2016/8/31.
 /**
 * 字节码转化十六进制
 *
 */
public class BytesToHex {

    public static String byte2hex(byte[] resultBytes){
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < resultBytes.length; i++){
            if(Integer.toHexString(0xFF & resultBytes[i]).length() == 1){
                builder.append("0").append(Integer.toHexString(0xFF & resultBytes[i]));
            }else{
                builder.append(Integer.toHexString(0xFF & resultBytes[i]));
            }
        }
        return builder.toString();
    }


    public static byte[] hex2byte(String h) {
        byte[] ret = new byte[h.length()/2];
        for(int i=0; i<ret.length; i++){
            ret[i] = Integer.decode("#"+h.substring(2*i, 2*i+2)).byteValue();
        }
        return ret;
    }


    public static void main(String[] args) {
        System.out.println(Integer.toHexString(0xFF & 15));
    }
}