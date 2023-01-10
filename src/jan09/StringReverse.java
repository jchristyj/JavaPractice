package jan09;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String a=s.nextLine();
		//String a="Selenium";
		String reversedString="";
		for(int i=a.length()-1;i>=0;i--) {
			
			//System.out.println(a.charAt(i));
			reversedString=reversedString+a.charAt(i);
			//System.out.println(a.getBytes());
			}
		System.out.println("The reversed string is "+reversedString);
		
	}

}
