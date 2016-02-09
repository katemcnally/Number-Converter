import java.io.PrintWriter;
import java.util.Scanner;

/*
 * converter when starting with hexadecimal number
 */

public class Hexadecimal {
	
	/*
	 * constructor for PrintWriter
	 */
	
	private PrintWriter pw;
	public Hexadecimal(PrintWriter pw){
		this.pw = pw;
	}
	
	/*
	 * converts hexadecimal to decimal
	 */
	
	public int hexToDec(){
		System.out.println("What is the number?");
		pw.println("What is the number?");
		Scanner myScan = new Scanner(System.in);
		String hexa = myScan.nextLine();
		pw.println(hexa);
		String hexindex = "0123456789ABCDEF";
		hexa= hexa.toUpperCase();
		int decimal = 0;
		for(int i = 0; i<hexa.length(); i++){
			char digit = hexa.charAt(i);
			int value = hexindex.indexOf(digit);
			decimal = 16*decimal + value;
		}
		System.out.println("The converted number is:");
		pw.println("The converted number is:");
		System.out.println(decimal);
		pw.println(decimal);
		pw.println();

		return decimal;
	}
	
	/*
	 * converts hexadecimal to binary
	 */
	
	public void hexToBin(){
		System.out.println("What is the number?");
		pw.println("What is the number?");
		Scanner myScan = new Scanner(System.in);
		String hexa = myScan.nextLine();
		pw.println(hexa);
		System.out.println("The converted number is:");
		pw.println("The converted number is:");
		String binary = "";
		for (int i = 0; i<hexa.length(); i++){
			switch(hexa.charAt(i)){
				case'0':
					binary += "0000"; break;
				case '1':
					binary += "0001"; break;
				case '2':
					binary += "0010"; break;
				case '3':
					binary += "0011"; break;
				case '4': 
					binary += "0100"; break;
				case '5': 
					binary += "0101"; break;
				case '6':
					binary += "0110"; break;
				case '7':
					binary += "0111"; break;
				case '8':
					binary += "1000"; break;
				case '9':
					binary += "1001"; break;
				case 'A':
					binary += "1010"; break;
				case 'B':
					binary += "1011"; break;
				case 'C':
					binary += "1100"; break;
				case 'D':
					binary += "1101"; break;
				case 'E':
					binary += "1110"; break;
				case 'F':
					binary += "1111"; break;
			}
		}
		System.out.print(binary);
		pw.print(binary);
		System.out.println("");
		pw.println("");
		pw.println();

	}

}
