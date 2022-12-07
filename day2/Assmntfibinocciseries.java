package week1.day2;

public class Assmntfibinocciseries {

	public static void main(String[] args) {
		int range=8;
		int firstnum=0;
		int secnumber=1;
		int sum=0;
		
		System.out.println("The Fibonacci series are");
		System.out.println(firstnum);
		
		for(int i=0; i<range;i++)
		{
			sum=firstnum+secnumber;
				firstnum=secnumber;
				secnumber=firstnum;
				secnumber=sum;
				System.out.println(sum);
		}
		
		
		// TODO Auto-generated method stub

	}

}
