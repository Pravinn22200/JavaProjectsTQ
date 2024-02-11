package com.array.Theory;

public class CountChar {

	static int findNoChars(String s)
	{
		int count=0;
		char ch[]=s.toCharArray();
		for(char c: ch)
		{
			count++;
		}
		return count;
	}
	static void findVowelConsonants(String s )
	{
		int vcount = 0;
		int ccount=0;
		
		s=s.toLowerCase();
		char ch[] = s.toCharArray();
		for(char c: ch)
		{
			if(c==' '|c=='.')
				continue;
			if(c=='A'|c=='E'|c=='I'|c=='O'|c=='U'|c=='a'|c=='e'|c=='i'|c=='o'|c=='u')
			{
				vcount++;
			}
			else
			{
				ccount++;
			}
		}
		System.out.println("No of Vowels  : "+vcount );
		System.out.println("No of Consonants : "+ccount);
	}
	public static void main(String[] args) {
		String str = "java";
		findVowelConsonants(str);
	}

}
