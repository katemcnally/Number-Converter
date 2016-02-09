import java.io.PrintWriter;
import java.util.Scanner;

/*
 * class for printing menu and user input for menu selection
 */

public class Menu {
	
	/*
	 * constructor for PrintWriter
	 */
	
	private PrintWriter pw;
	public Menu(PrintWriter pw){
		this.pw = pw;
	}
	
	/*
	 * Prints out the menu
	 */
	
	public void display(){
		System.out.println("Choose an operation:");
		pw.println("Choose an operation:");
		System.out.println("1. Decimal to Binary");
		pw.println("1. Decimal to Binary");
		System.out.println("2. Decimal to Hexadecimal");
		pw.println("2. Decimal to Hexadecimal");
		System.out.println("3. Binary to Decimal");
		pw.println("3. Binary to Decimal");
		System.out.println("4. Binary to Hexadecimal");
		pw.println("4. Binary to Hexadecimal");
		System.out.println("5. Hexadecimal to Decimal");
		pw.println("5. Hexadecimal to Decimal");
		System.out.println("6. Hexadecimal to Binary");
		pw.println("6. Hexadecimal to Binary");
		pw.println();

	}
	
	/*
	 * Receives user's selection
	 */
	
	public int getSelection(){
		Scanner myScan = new Scanner(System.in);
		int choice = myScan.nextInt();
		pw.println(choice);
		pw.println();

		return choice;
	}

}
