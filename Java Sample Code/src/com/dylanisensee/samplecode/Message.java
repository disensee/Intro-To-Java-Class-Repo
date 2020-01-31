package com.dylanisensee.samplecode;

public class Message {
	private String recipient;
	private String sender;
	private String msg;
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public void send() {
		System.out.println("Sending message...");
	}
	
	public Message(String recipient, String sender, String msg) {
		this.recipient = recipient;
		this.sender = sender;
		this.msg = msg;
	}
	
	//public Message(){}
}
