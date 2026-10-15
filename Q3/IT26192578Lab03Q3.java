
import java.util.Scanner;
public class IT26192578Lab03Q3{
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount of cash : ");
		int amount = input.nextInt();
		
		int notes;
		notes = amount/5000;
		System.out.println("5000 Notes " + notes);
		amount %= 5000;
		
		notes = amount/1000;
		System.out.println("1000 Notes" + notes);
		amount %= 1000;
		
		notes = amount/500;
		System.out.println("500 Notes" + notes);
		amount %= 500;
		
		notes = amount/200;
		System.out.println("200 Notes" + notes);
		
		notes = amount/100;
		System.out.println("100 Notes" + notes);
		amount %= 100;
		
		notes = amount/50;
		System.out.println("50 Notes" + notes);
		amount %= 50;
		
		notes = amount/20;
		System.out.println("20 Notes" + notes);
		amount %= 20;
		
		notes = amount/10;
		System.out.println("10 Notes" + notes);
		amount %= 10;
		
		notes = amount/5;
		System.out.println("5 Notes" + notes);
		amount %= 5;
		
		notes = amount/2;
		System.out.println("2 Notes" + notes);
		amount %= 2;
		
		notes = amount/1;
		System.out.println("1 Notes" + notes);
		
		input.close();
		
	}
	
}
		
		
		
		
	