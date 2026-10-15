import java.util.Scanner;
public class IT26102578Lab03Q1A{
	public static void main (String[]args){
		
		double kgPrice , quantity , totAmount;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of a kilogram of rice : ");
		kgPrice = input.nextDouble();
		
		System.out.print("Enter the number of kilograms of rice you want to buy :");
		quantity = input.nextDouble();
		
		totAmount = kgPrice * quantity;
		
		System.out.println();
		System.out.println("The total amount is : " + totAmount);
		
	}
	
}

		
		