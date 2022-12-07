package week1.day2;

import java.util.Arrays;

public class AssinmntmissingElementInanArray {
	
	

	public static void main(String[] args) {
		int [] digits= {1,2,3,4,7,6,8};
		
		Arrays.sort(digits);
		int length=digits.length;
				
	for(int i=1; i<length;i++)
	{ 
		if(i!=digits[i-1])
		{
			System.out.println(" Missing Number is"+i);
			break;
					
		
		}
		
			
			
		
		
		
	}
		
	
		// TODO Auto-generated method stub
	

	}

}
