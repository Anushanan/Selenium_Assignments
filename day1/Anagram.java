package Weak3.day1;

import java.util.Arrays;

import net.bytebuddy.implementation.bytecode.collection.ArrayLength;

public class Anagram {

	public static void main(String[] args) {
		String text1="stops";
				String text2="posts";
				int len1=text1.length();
				int len2=text2.length();
				
				
				if(len1==len2)
				{
					char[] chtext1=text1.toCharArray();
					char[] chtext2=text2.toCharArray();
					Arrays.sort(chtext1);
					Arrays.sort(chtext2);
					
					System.out.println(chtext1);
					System.out.println(chtext2);
				}
		
		
		// TODO Auto-generated method stub

	}

}



	