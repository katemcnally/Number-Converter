import java.io.PrintWriter;
import java.util.Scanner;

/*
 * converter when starting with binary number
 */

public class Binary {
	
	/*
	 * constructor for PrintWriter
	 */
	
	private PrintWriter pw;
	public Binary(PrintWriter pw){
		this.pw = pw;
	}
	
	/*
	 * converts from binary to decimal
	 */
	
	public void binToDec(){
		System.out.println("What is the number?");
		pw.println("What is the number?");
		Scanner myScan = new Scanner(System.in);
		String binary = myScan.nextLine();
		pw.println(binary);
		String reverse = "";
		int decimal = 0;
		int n = 0;
		for(int i = binary.length()-1; i>=0; i--){
			reverse = reverse + binary.charAt(i);
		}
		for(int k = 0; k<reverse.length(); k++){
			if(reverse.charAt(k) == '1'){
				n += Math.pow(2, k);
			}
		}
		System.out.println("The converted number is:");
		pw.println("The converted number is:");
		System.out.println(n);
		pw.println(n);
		pw.println();

	}

	/*
	 * converts from binary to hexadecimal
	 */
	
	public void binToHex(){
		System.out.println("What is the number?");
		pw.println("What is the number?");
		Scanner myScan = new Scanner(System.in);
		String binary = myScan.nextLine();
		pw.println(binary);
		String hex = "0x";
		for(int i = 0; i<binary.length(); i+=4){
			if (binary.substring(i, i+4).equals("0000")){
				hex+="0";
			}
			else if(binary.substring(i, i+4).equals("0001")){
				hex+="1";
			}
			else if(binary.substring(i, i+4).equals("0100")){
				hex+="2";
			}
			else if(binary.substring(i, i+4).equals("0011")){
				hex+="3";
			}
			else if(binary.substring(i, i+4).equals("0100")){
				hex+="4";
			}
			else if(binary.substring(i, i+4).equals("0101")){
				hex+="5";
			}
			else if(binary.substring(i, i+4).equals("0110")){
				hex+="6";
			}
			else if(binary.substring(i, i+4).equals("0111")){
				hex+="7";
			}
			else if(binary.substring(i, i+4).equals("1000")){
				hex+="8";
			}
			else if(binary.substring(i, i+4).equals("1001")){
				hex+="9";
			}
			else if(binary.substring(i, i+4).equals("1010")){
				hex+="A";
			}
			else if(binary.substring(i, i+4).equals("1011")){
				hex+="B";
			}
			else if(binary.substring(i, i+4).equals("1100")){
				hex+="C";
			}
			else if(binary.substring(i, i+4).equals("1101")){
				hex+="D";
			}
			else if(binary.substring(i, i+4).equals("1110")){
				hex+="E";
			}
			else if(binary.substring(i, i+4).equals("1111")){
				hex+="F";
			}	
		}
		System.out.println("The converted number is:");
		pw.println("The converted number is:");
		System.out.println(hex);
		pw.println(hex);
		pw.println();

	
}
}
