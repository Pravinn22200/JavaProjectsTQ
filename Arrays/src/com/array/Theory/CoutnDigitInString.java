package com.array.Theory;

public class CoutnDigitInString {

	static int findCount(String s) {
		int count = 0;
		char ch[] = s.toCharArray();

		for (char c : ch) {
			if (c >= 48 && c <= 57) {
				count++;
			}
		}
		return count;
	}

	static int findCount2(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		
		String str = "Java123Program89am05";
		System.out.println(str);
		System.out.println("Digit count 2 : "+findCount2(str));
		System.out.println("Digit count 1 : "+findCount(str));
	}
}
