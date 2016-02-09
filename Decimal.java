import java.io.PrintWriter;
import java.util.Scanner;

/*
 * converter when starting with decimal number
 */

public class Decimal {
	
	/*
	 * constructor for PrintWriter
	 */
	
	private PrintWriter pw;
	public Decimal(PrintWriter pw){
		this.pw = pw;
	}
	
	/*
	 * converts from decimal to binary
	 */
	
	public void decToBin(){
		System.out.println("What is the number?");
		pw.println("What is the number?");
		Scanner myScan = new Scanner(System.in);
		int decimal = myScan.nextInt();
		pw.println(decimal);
		System.out.println("The converted number is:");
		pw.println("The converted number is:");
		int bin[] = new int[100];
		int index = 0;
		while(decimal>0){
			bin[index++] = decimal%2;
			decimal = decimal/2;
		}
		for(int i = index-1; i >= 0; i--){
			System.out.print(bin[i]);
			pw.print(bin[i]);
		}
		System.out.println("");
		pw.println("");
		pw.println();
	}
	
	/*
	 * converts from decimal to hexadecimal
	 */
	
	public String decToHex(){
		System.out.println("What is the number?");
		pw.println("What is the number?");
		Scanner myScan = new Scanner(System.in);
		int decimal = myScan.nextInt();
		pw.println(decimal);
		System.out.println("The converted number is:");
		pw.println("The converted number is:");
		if (decimal == 0){
			System.out.println("0");
			pw.println("0");
		}
		String Hex = "";
		char hexa[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		while(decimal>0){
			int rem = decimal%16;
			Hex = hexa[rem]+Hex;
			decimal = decimal/16;
			
		}
		
		System.out.println(Hex);
		pw.println(Hex);
		pw.println();
		return Hex;
	}

}
