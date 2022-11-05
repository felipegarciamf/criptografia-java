package br.com.criptografia;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class GeradorDeChave {

	
	public static SecretKey geradorDechave(String tipoDeChave) {
		
		 KeyGenerator keygenerator = null;
		try {
			keygenerator = KeyGenerator.getInstance(tipoDeChave);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return keygenerator.generateKey();
	}
	
	static String transformaByteEmString(byte[] textoencriptado) throws UnsupportedEncodingException {
		String msgDecode  = new String(textoencriptado, "UTF-8");
		return msgDecode;
	}
	
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		
		SecretKey geradorDechave = geradorDechave("AES");
		
		byte[] encoded = geradorDechave.getEncoded();
		
		
		String transformaByteEmString = transformaByteEmString(encoded);
		
		System.out.println(transformaByteEmString);
	}
	
}
