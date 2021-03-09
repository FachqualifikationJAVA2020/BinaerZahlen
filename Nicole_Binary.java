import java.util.Scanner;
public class Nicole_Binary {
	public static void main(String[] args) {
		int decimal = 1;
		int result = 0;
		
		System.out.println("Bitte binären Wert eingeben: ");
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		scan.close();
		
		for(int i = input.length() -1; i >= 0; i--) {
			char c = input.charAt(i);
			if(c == '1') {
				result += decimal;
				decimal += decimal;
			} else {
				decimal += decimal;
			}
		}
		
		System.out.println(input + " entspricht " + result);
		
	}
}
