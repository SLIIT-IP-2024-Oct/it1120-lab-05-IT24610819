import java.util.Scanner;
  public class IT24610819Lab5Q1 {
        public static void main (String [] args) {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the first integer: ");
			int num1 = input.nextInt();
			System.out.print("Enter the second integer: ");
			int num2 = input.nextInt();
			System.out.print("Enter the third integer: ");
			int num3 = input.nextInt();
			System.out.println();
			System.out.println("User entered number are : " + num1 + " " + num2 + " " + num3);
			 
			int largest = num1;
			int smallest = num1;
			
			if (num2 > largest) {
				largest = num2;
			}
			if (num3 > largest) {
				largest = num3;
            }
			System.out.println("The largest number is: " + largest);
			System.out.println("The smallest number is: " + smallest);	
			input.close();
		}
    }