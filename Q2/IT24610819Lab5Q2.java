import java.util.Scanner;
     public class IT24610819Lab5Q2 {
		 public static void main (String [] args) {
			 Scanner input = new Scanner(System.in);
			 System.out.print("Enter the number of new members introduced: ");
			 int numOfNew_mem = input.nextInt();
			 
			 if(numOfNew_mem < 0){
				 System.out.print("Input must be a number 0 or greater");
			}
			else {
			 
			 switch(numOfNew_mem) {
				 case 0:
				 System.out.print("No Prize");
			     break;
				 
				 case 1:
				  System.out.print("Prize is a : Pen");
				  break;
				  
				  case 2:
				  System.out.print("Prize is a : Umbrella");
				  break;
				  
				  case 3:
				  System.out.print("Prize is a : Bag");
				  break;
				  
				  case 4:
				  System.out.print("Prize is a : Travelling Chair");
				  break;
				  
				  default:  
            if (numOfNew_mem >= 5) {
                 System.out.print("Prize is a : Headphone");
			}
                break;
			}		
	    }	
    }
}	