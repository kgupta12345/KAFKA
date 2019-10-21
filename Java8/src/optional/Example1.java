package optional;

import java.util.Optional;

public class Example1 {
	public static void main(String[] args) {
	    String str0 = "RAHUL";  
        String lowercaseString0 = str0.toLowerCase();  
        System.out.println(lowercaseString0);  
        
	    /*String str1 = "";  
        String lowercaseString1 = str1.toLowerCase();  
        System.out.println(lowercaseString1);  
        
        String str2 = null;  
        String lowercaseString2 = str2.toLowerCase();  
        System.out.println(lowercaseString2);*/ 
        
        String str1 = "";
        Optional<String> checknull1 = Optional.ofNullable(str1);
		if (checknull1.isPresent()) {
			String lowercaseString1 = str1.toLowerCase();
			System.out.println(lowercaseString1);
		} else {
			System.out.println("str1 is absent");
		}
         
        
		String str2 = null;
		Optional<String> checknull2 = Optional.ofNullable(str2);
		if (checknull2.isPresent()) {
			String lowercaseString2 = str2.toLowerCase();
			System.out.println(lowercaseString2);
		} else {
			System.out.println("str2 is absent");
		}
		
		
	     /* String str1 = "";
	        Optional<String> checknull = Optional.ofNullable(str1);
	        System.out.println(checknull);*/
        
	}
}
