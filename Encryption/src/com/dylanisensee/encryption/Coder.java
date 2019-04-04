package com.dylanisensee.encryption;

public class Coder {
	private final int KEY = 5; 
	public static void main(String[] args) {
		Coder test = new Coder();

		String toEncrypt = test.encrypt("this string will be encrypted and decrytped.");
		System.out.println(toEncrypt);
		
		String decrypted = test.decrypt(toEncrypt);
		System.out.println(decrypted);
	}
	
	private int[] convertToAscii(String s) {
		int[] letterArr = new int[s.length()];
		
		for(int i = 0; i < s.length(); i++) {
			char[] charArray = s.toCharArray();
			letterArr[i] = charArray[i];
		}
		return letterArr;
	}
	
	private String convertToString(int[] asciiArr) {
		String str = "";
		
		for(int i = 0; i < asciiArr.length; i++) {
			char letter = (char)asciiArr[i];
			str += letter;
		}
		return str;
	}
	
	public String encrypt(String stringToEncrypt) {
		int[] asciiStringArr = convertToAscii(stringToEncrypt);
		for(int i = 0; i < asciiStringArr.length; i++) {
			asciiStringArr[i] += KEY;
		}
		String encryptedStr = convertToString(asciiStringArr);
		return encryptedStr;
	}
	
	public String decrypt(String encryptedString) {
		int[] decryptChar = convertToAscii(encryptedString);
		
		for(int i = 0; i < decryptChar.length; i++) {
			decryptChar[i] -= KEY;
		}
		String decryptedStr = convertToString(decryptChar);
		return decryptedStr;
	}
}

