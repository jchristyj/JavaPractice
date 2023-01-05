package jan3;
import java.util.Scanner;

public class Loops {
public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		//while loop
	/*	int value = 0;
		while (value < 5) {
			System.out.println("hello "+value);
			value++;
		}
		//for loop
for(int i=1;i<=value;i++)
{
	System.out.println("welcome");
	
}*/
	
	//do while
	Scanner s=new Scanner(System.in);
	 
	int value=0;
	do
	{
	 System.out.println("Enter the num:");
     value=s.nextInt();
	}
	while(value!=5);
	System.out.println("Got 5!");
	}

}
