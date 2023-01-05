package jan3;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        System.out.println("Enter the command");
        String text=s.nextLine();
        switch(text) {
        
        case "start":
        System.out.println("System started");
        break;
        
        case "stop":
        System.out.println("System stopped");
        break;
        
        default:
        System.out.println("not defined");
        break; 	
               
        }
        
		
	}

}
