import java.util.Scanner;

public class Second_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please, input arithmetic expression: ");
		String equation = in.nextLine();

		int counter = 0;
		int place = 0;
		for (int i = 0; i < equation.length(); i++) {
			if (equation.charAt(i) == '(') {
				counter++;
				} else if (equation.charAt(i) == ')') {
					counter--;
			}
			if (counter < 0) {
				place = i + 1; 
				break;
			}
		}
		
		if (counter < 0) {
			System.out.println("Expression is wrong. First position of the wrong right bracket is: "+ place);
		} else if (counter == 0) {
			System.out.println("Expression is correct");
		} else if (counter > 0) {
			System.out.println("Expression is wrong. We have " + counter + " wrong left bracket(s).");
		}

		}
}