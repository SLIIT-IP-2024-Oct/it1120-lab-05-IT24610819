import java.util.Scanner;
   public class IT24610819Lab5Q3 {
        public static void main (String [] args) {
	       Scanner input = new Scanner(System.in);
		   
		   final double ROOM_CHARGE_PER_DAY = 48000.0;
		   final int DISCOUNT_3_TO_4_DAYS = 10;
		   final int DISCOUNT_5_OR_MORE_DAYS = 20;
		   
		   System.out.print("Enter Start Date (1-31): ");
		   int startDate = input.nextInt();
		   System.out.print("Enter End Date (1-31): ");
		   int endDate = input.nextInt();
		   
		   if(startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
			   System.out.print("Error: Days must be between 1 and 31");
			   System.exit(0);
		    }
		    if (startDate >= endDate) {
			   System.out.print("Error: Start Date must be less than End Date");
			   System.exit(0);
		    }  
            System.out.println();		
            System.out.println("Room_Charge_per_day: Rs. " + ROOM_CHARGE_PER_DAY);			
		    int daysReserved = endDate - startDate;
			System.out.println("Number of Days Reserved: " + daysReserved);
			double discountRate = 0; 
			if (daysReserved >= 3 && daysReserved <= 4) {
			discountRate = DISCOUNT_3_TO_4_DAYS;
			}
			else if(daysReserved >= 5) {
			discountRate = DISCOUNT_5_OR_MORE_DAYS;	
			}
			double totalRoomCharge = daysReserved * ROOM_CHARGE_PER_DAY;
            double discountAmount = (totalRoomCharge * discountRate) / 100;
            double totalAmountToPay = totalRoomCharge - discountAmount;
            System.out.println("Total Amount to be paid: " + totalAmountToPay);
		    
		}
   }