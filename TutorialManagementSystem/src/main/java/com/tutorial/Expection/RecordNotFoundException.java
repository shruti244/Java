package com.tutorial.Expection;

public class RecordNotFoundException extends RuntimeException{
	
	public RecordNotFoundException(String msg){
		//super();
		System.out.println(msg);
	}

}

