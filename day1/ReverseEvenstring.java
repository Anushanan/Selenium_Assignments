package Weak3.day1;

public class ReverseEvenstring {

	public static void main(String[] args) {
		
		
		
		String input="Testleaf is located in chennai";
        String[] split = input.split(" ");//ctrl+2+l
        for (int i = 0; i < split.length; i++) {
            if(i%2!=0) {
                char[] charArray = split[i].toCharArray();
                for (int j =charArray.length-1; j >=0 ; j--) {
                    
                    System.out.print(charArray[j]);
                }
            }
            else {
                System.out.print(split[i]);
            }
            System.out.print(" ");
        }

		// TODO Auto-generated method stub

	}

}
