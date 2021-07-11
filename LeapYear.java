public class LeapYear {    
public static void main(String[] args) {    
        int year=2020;
	boolean isleap = true;
	boolean isnotleap = false;    
	
    if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){  
        System.out.println(isleap);  
    }  
    else{  
        System.out.println(isnotleap);  
    }  
}    
} 
