import java.util.Scanner;

public class First {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first number: ");
		String firstNumber = ("00" + in.nextLine());
		System.out.print("Enter seconf number: ");
		String secondNumber = ("00" +in.nextLine());

		int memory = 0;
		String sum = "";
		do {
			memory = Character.getNumericValue((firstNumber.charAt(firstNumber.length()-1))) 
					+ Character.getNumericValue((secondNumber.charAt(secondNumber.length()-1)))
					+ (memory / 10);
			
			sum = Integer.toString(memory % 10) + sum;
			System.out.println(sum);
			
			firstNumber = firstNumber.substring(0, firstNumber.length()-1);
			secondNumber = secondNumber.substring(0, secondNumber.length()-1);

		}while ((firstNumber.length() > 0) && (secondNumber.length() > 0));
		
		System.out.println("Sum is: " + firstNumber + secondNumber + sum);

	}
}