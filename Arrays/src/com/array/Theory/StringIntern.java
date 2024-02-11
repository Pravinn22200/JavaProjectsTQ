package com.array.Theory;

public class StringIntern {

	public static void main(String[] args) {
		String s1="java";
		String s2 = "java";
		
		//compare reference to object
		System.out.println(s1==s2);
		
		//compare content
		System.out.println(s1.equals(s2));
		
		System.out.println("--------------------");
		
		String s3 =  new String("java");
		s3=s3.intern();
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
		String str2="java";
		str2=str2.concat("Pragrams");//here object is created in heap which after store in scp
		System.out.println(str2.hashCode());
		
		String str3 ="javaPrograms";
		System.out.println(str3.hashCode());
		System.out.println("-------------");
		
		str2=str2.intern();
		System.out.println(str2==str3);
		System.out.println(str2.equals(str3));
		
		
		
	}
}
