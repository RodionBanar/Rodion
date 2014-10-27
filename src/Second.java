import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please, input arithmetic expression: ");
		String equation = in.nextLine();

		int counter = 0;
		//go:{
		for (int i = 0; i < equation.length(); i++) {
			if (equation.charAt(i) == '(') {
				counter++;
				} else if (equation.charAt(i) == ')') {
					counter--;
			}
			if (counter < 0) {
				System.out.println("Expression is wrong. First position of the wrong right bracket is: "+ (i+1));
				return;
			}
		}
		
		if (counter == 0) {
			System.out.println("Expression is correct");
			} else if (counter > 0) {
				System.out.println("Expression is wrong. We have " + counter + " wrong left bracket(s).");
		}
	}
}