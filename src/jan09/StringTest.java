package jan09;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String name="jancy";
		String fullName=name.concat("Christy");
		System.out.println(name);
		System.out.println(fullName);
		String s1="jo";
		String s2="jo";
		String s3="JO";
		//equals
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		//equalsignorecase doesnot care for case
		System.out.println(s1.equalsIgnoreCase(s3));
		//==operator
		System.out.println(s1==s3);
		String s=30+4+"Jo"+(40+40);
		System.out.println(s);	*/
		
		/*String s="Selenium";
		System.out.println(s.charAt(7));
		System.out.println(s.charAt(6));
		System.out.println(s.charAt(5));
		System.out.println(s.charAt(4));
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(0));*/
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String a=s.nextLine();
		System.out.println("Entered String is"+a);
		//String a="Selenium";
		String reversedString="";
		for(int i=a.length()-1;i>=0;i--) {
			
			//System.out.println(a.charAt(i));
			reversedString=reversedString+a.charAt(i);
			//System.out.println(a.getBytes());
			}
		System.out.println(reversedString);
		


	}

}
