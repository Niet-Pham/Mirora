/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watch.util;

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 *
 * @author Đức Huy
 */
public class MD5Library {
    public static String md5(String str){
		String result = "";
		      MessageDigest digest;
		try {
			digest = MessageDigest.getInstance("MD5");
			digest.update(str.getBytes());
			                 BigInteger bigInteger = new BigInteger(1,digest.digest());
			result = bigInteger.toString(16);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
