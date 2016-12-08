package com.rcplatform.livechat.common.util;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * base64 加解密
 * Created by yang peng on 2016/8/31.
 */
public class Base64Test {


    public static String base64Encode(String content) {
        try {
            byte data[] = content.getBytes("UTF-8");
            String encoded = new BASE64Encoder().encode(data);
            encoded = encoded.replaceAll("\n", "");
            return encoded;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String base64Decode(String content) {
        BASE64Decoder decoder = new BASE64Decoder();
        try {
            byte data[] = decoder.decodeBuffer(content);
            return new String(data, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
