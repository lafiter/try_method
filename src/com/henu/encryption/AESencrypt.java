package com.henu.encryption;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class AESencrypt {

	 
	public static void main(String[] args) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
		String content = "test";  
		String password = "12345678";  
		//����   
		System.out.println("����ǰ��" + content);  
		byte[] encryptResult = encrypt(content, password);  
		//����   
		byte[] decryptResult = decrypt(encryptResult,password);  
		System.out.println("���ܺ�" + new String(decryptResult)); 
	}
	public static byte[] encrypt(String content,String password) throws NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException, UnsupportedEncodingException{
		//��ȡ���ܷ���AES
		KeyGenerator kg = KeyGenerator.getInstance("AES");
		//��ʼ��
		kg.init(128, new SecureRandom(password.getBytes()));
		//��ȡkey
		SecretKey sk = kg.generateKey();
		//�����ַ�
		byte[] enCodeFormat = sk.getEncoded();
		SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");  
        Cipher cipher = Cipher.getInstance("AES");// ����������   
        byte[] byteContent = content.getBytes("utf-8");  
        cipher.init(Cipher.ENCRYPT_MODE, key);// ��ʼ��   
        byte[] result = cipher.doFinal(byteContent);  
        return result; // ����   
	}
	public static byte[] decrypt(byte[] content, String password) {  
        try {  
                 KeyGenerator kgen = KeyGenerator.getInstance("AES");  
                 kgen.init(128, new SecureRandom(password.getBytes()));  
                 SecretKey secretKey = kgen.generateKey();  
                 byte[] enCodeFormat = secretKey.getEncoded();  
                 SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");              
                 Cipher cipher = Cipher.getInstance("AES");// ����������   
                cipher.init(Cipher.DECRYPT_MODE, key);// ��ʼ��   
                byte[] result = cipher.doFinal(content);  
                return result; // ����   
        } catch (NoSuchAlgorithmException e) {  
                e.printStackTrace();  
        } catch (NoSuchPaddingException e) {  
                e.printStackTrace();  
        } catch (InvalidKeyException e) {  
                e.printStackTrace();  
        } catch (IllegalBlockSizeException e) {  
                e.printStackTrace();  
        } catch (BadPaddingException e) {  
                e.printStackTrace();  
        }  
        return null;  
}
}
