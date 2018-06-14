package com.ldh.javacore.signature;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created on 2018/6/14.
 */
public class Signature {
    /**
     * MessageDigests
     *
     * @param content
     * @param signType
     * @return
     */
    public static String MessageDigests(String content, String signType) {
        try {
            MessageDigest alg = MessageDigest.getInstance(signType);
            alg.update(content.getBytes());
            byte[] hash = alg.digest();
            alg.reset();
            StringBuilder hexString = new StringBuilder();
            for (byte message : hash) {
                String shaHex = Integer.toHexString(message & 0xFF);
                if (shaHex.length() < 2)
                    hexString.append(0);
                hexString.append(shaHex);
            }
            return hexString.toString().toLowerCase();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static void main(String[] args) {
        String signContent = "我已认真阅读并同意遵守上述承诺。";
        String signBack = MessageDigests(signContent, "SHA-1");
        System.out.println(signBack);
    }
}
