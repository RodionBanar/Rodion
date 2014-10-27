import java.util.Scanner;

public class Third_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please, input number: ");
		String number = in.nextLine();

		int[] unique = new int [10];
		int sum = 0;

		for (int i = 0; i < number.length(); i++) {
			int element = Character.getNumericValue(number.charAt(i));
			if (unique[element] == 0){
				sum++;
				unique[element]++;
			}
		}
			System.out.print(sum + " unique digits in this number.");
	}
}