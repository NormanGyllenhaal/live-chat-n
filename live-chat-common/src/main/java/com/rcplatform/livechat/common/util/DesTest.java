package com.rcplatform.livechat.common.util;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;


/**
 * Created by yang peng on 2016/8/31.
 */
public class DesTest {


    private static final String key = "rc2016!@";



    /**
     * 生成密钥
     * @throws Exception
     */
    public static byte[] initKey() throws Exception{
        //密钥生成器
        KeyGenerator keyGen = KeyGenerator.getInstance("DES");
        //初始化密钥生成器
        keyGen.init(56);
        //生成密钥
        SecretKey secretKey = keyGen.generateKey();
        return secretKey.getEncoded();
    }

    /**
     * 加密
     * @throws Exception
     */
    public static byte[] encryptDES(byte[] data, byte[] key) throws Exception{
        //获得密钥
        SecretKey secretKey = new SecretKeySpec(key, "DES");
        //Cipher完成加密
        Cipher cipher = Cipher.getInstance("DES");
        //初始化cipher
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        //加密
        byte[] encrypt = cipher.doFinal(data);

        return encrypt;
    }

    /**
     * 解密
     */
    public static byte[] decryptDES(byte[] data, byte[] key) throws Exception{
        //恢复密钥
        SecretKey secretKey = new SecretKeySpec(key, "DES");
        //Cipher完成解密
        Cipher cipher = Cipher.getInstance("DES");
        //初始化cipher
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        //解密
        byte[] plain = cipher.doFinal(data);

        return plain;
    }


    public static String encrypt(String str) throws Exception {
        byte[] desReult = encryptDES(str.getBytes(), key.getBytes());
        return BytesToHex.byte2hex(desReult);
    }


    public static String decrypt(String str) throws Exception{
        byte[] plain = decryptDES(BytesToHex.hex2byte(str), key.getBytes());
        return new String(plain);
    }



    public static void main(String[] args) throws Exception {
        //待加密原文
        String data = "hi, welcome to my git area!";
       /* byte[] desKey = initKey();
        System.out.println("DES Key : " + BytesToHex.fromBytesToHex(desKey));
        byte[] desReult = encryptDES(DATA.getBytes(), desKey);
        System.out.println(DATA + "DES 加密 =====>>>>>>> " + BytesToHex.fromBytesToHex(desReult));
        byte[] plain = decryptDES(desReult, desKey);
        System.out.println(DATA + "DES 解密 =====>>>>>>> " + new String(plain));*/
        String encrypt = encrypt(data);


    }
}
