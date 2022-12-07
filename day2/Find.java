package week1.day2;

import java.util.Arrays;

public class Find {

	public static void main(String[] args) {
		
		int [] digits = {22,3981,-19,82,0,45,37};
		
		Arrays.sort(digits);
		
		int length = digits.length;
		int min = digits[0];
		int max = digits[0];
		
		
		for (int i=0; i<length; i++)
		{
		if(digits[i]<min)			
		{
			min=digits[i];
			
		}
		
		
		
		if(digits[i]>max)
		{
			max=digits[i-1];
		}
		
		// TODO Auto-generated method stub

	}
		System.out.println("minimum number is");System.out.println(min);
		System.out.println("second largest number is");System.out.println(max);
		
	}
}

	
	

