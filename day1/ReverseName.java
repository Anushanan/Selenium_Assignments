package Weak3.day1;

public class ReverseName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name =" Anusha";
		int length= name.length();
		
		char[] ch=name.toCharArray();
		
		
		for(int i=length-1; i>=0;i--)
		{
			System.out.println(ch[i]);
		}
		
		}

}
