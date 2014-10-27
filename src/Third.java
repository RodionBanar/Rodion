import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please, input number: ");
		String number = in.nextLine();

		String unique = "";

		for (int i = 0; i < number.length(); i++) {
			if (unique.indexOf(number.charAt(i)) < 0){
				unique = unique + number.charAt(i);
			}
		}
		
			System.out.print(unique.length() + " unique digits in this number.");
	}
}