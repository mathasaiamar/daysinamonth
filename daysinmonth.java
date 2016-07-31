
import java.util.Scanner;

public class daysinmonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month;
		 
	   
	    System.out.print("Enter month number(1-12): ");
	    Scanner s = new Scanner(System.in);
	    month = s.nextInt();
	    switch(month)
	    {
	        case 1:
	        case 3:
	        case 5:
	        case 7:
	        case 8:
	        case 10:
	        case 12: System.out.println("no.of days are: 31");
	            break;
	        case 4:
	        case 6:
	        case 9:
	        case 11: System.out.println("no.of days are: 30 ");
	            break;
	        case 2: System.out.println("no.of days are: 28/29");
	            break;
	        default: System.out.println("Invalid input! Please enter month number between 1-12");
	 
	    }
	    
	}

}
 