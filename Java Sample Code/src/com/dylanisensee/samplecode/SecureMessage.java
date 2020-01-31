package com.dylanisensee.samplecode;

public class SecureMessage extends Message{
	
	public static void main(String[] args) {
		
		SecureMessage test = new SecureMessage("you", "me", "sampleMessage");
		
		test.send();
	}
	
	public SecureMessage(String recipient, String sender, String msg) {
		super(recipient, sender, msg);
	}
	
	@Override
	public void send() {
		Coder test = new Coder();
		String encryptedMsg = test.encrypt(getMsg());
		super.send();
	}
}
