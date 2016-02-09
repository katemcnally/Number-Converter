import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 
 * @author Kate McNally
 * ID: 011047098
 * Project Title: Review Lab
 * Description: Simulated Decimal, Binary, and Hexadecimal Converter 
 * Date: June 24, 2015
 * Begin the project through the driver class
 * Instructions: Follow directions in the output terminal
 *
 */

public class Driver {

	public static void main(String[] args) throws IOException{

		int choice;
		
		PrintWriter pw = new PrintWriter (new FileWriter ("csis.txt"));
		Decimal dec = new Decimal(pw);
		Binary bin = new Binary(pw);
		Hexadecimal hex = new Hexadecimal(pw);
		Menu menu = new Menu(pw);
		
		do{
			menu.display();
			choice = menu.getSelection();
			switch (choice){
			case 1: dec.decToBin(); break;
			case 2: dec.decToHex(); break;
			case 3: bin.binToDec(); break;
			case 4: bin.binToHex(); break;
			case 5: hex.hexToDec(); break;
			case 6: hex.hexToBin(); break;
			}
		}while(choice!=7);
		pw.close();

	}

}
