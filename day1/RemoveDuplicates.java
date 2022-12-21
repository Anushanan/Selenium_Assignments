package Weak3.day1;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		
		//char[] ch=text.toCharArray();
		String[] split = text.split(" ");
		for (int i = 0; i < split.length; i++) 
		{
			for (int j=0;j<split.length;j++)
			{
				if (split[i].equals(split[j])) {
					split[j] = "";
				}
			}
		}
				for (int k = 0; k < split.length; k++) {
					System.out.print(split[k] + " ");

		       
	
		       
		    		}}}
		


