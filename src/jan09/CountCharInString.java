package jan09;

public class CountCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1 = "Great responsibility";  
        int count;  
          
        //Converts given string into character array  
        char text[] = string1.toCharArray();  
          
        System.out.println("Duplicate characters in a given string: ");  
        //Counts each character present in the string  
        for(int i = 0; i <text.length; i++) {  
            count = 1;  
            for(int j = i+1; j <text.length; j++) {  
                if(text[i] == text[j] && text[i] != ' ') {  
                    count++;  
                    //Set text[j] to 0 to avoid printing visited character  
                    text[j] = '0';  
                }  
            }  
            //A character is considered as duplicate if count is greater than 1  
            if(count > 1 && text[i] != '0')  
                System.out.println(text[i]+"-->"+count);  
        }  
    }  
		
	}

