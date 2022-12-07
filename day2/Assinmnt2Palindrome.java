package week1.day2;

public class Assinmnt2Palindrome {	
	

	public static void main(String[] args) {
		int num=3343;
		int reverse=0;
		
			int temp=num;
		
   while(num!=0 )
		{
			int  remain=num%10;
			reverse=reverse*10+remain;
			num=num/10;
							
		}
		
		if(temp==reverse)
		{
			System.out.println(reverse+"The number is  Palindrome");
		}
		else
		{
			System.out.println(reverse+"The number is not  Palindrome");
		}
		// TODO Auto-generated method stub
		

	}

}
