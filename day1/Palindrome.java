package Weak3.day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String name="madam";
String rev="";
int length= name.length();
	
	char[] ch=name.toCharArray();
	
	
	for(int i=length-1; i>=0;i--)
	{
		rev=rev+ch[i];
		
	}
	System.out.println(rev);
 if( name.equals(rev))

		 System.out.println("This is Palindrome");
	
	
 else
	 System.out.println("This is not  Palindrome");
	}
}
