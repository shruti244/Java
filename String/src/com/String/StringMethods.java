package com.String;

public class StringMethods {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder();
		s.append("hii");
		s.append("hello");
		s.append("hiee");
		System.out.println(s);
		s.insert(1, "Hemlo");
		s.replace(3,6,"hhh");
		s.delete(4, 6);
		System.out.println(s);
		s.reverse();
		System.out.println(s);
		

	}

}
