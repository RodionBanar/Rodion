import java.util.Scanner;

public class    First_2 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first number: ");
		String first = in.nextLine();
		System.out.print("Enter seconf number: ");
		String second = in.nextLine();
		
		int maximum = Math.max(first.length(), second.length()) + 1;
		int[] firstNumber = new int [maximum];
		int[] secondNumber = new int [maximum];
		int[] sum = new int [maximum];
		
/*		for (int i = 0; i < maximum; i++) {
			firstNumber [i] = (i < first.length()) ? Character.getNumericValue(first.charAt(first.length() - i - 1)) : 0;
			secondNumber [i] = (i < second.length()) ? Character.getNumericValue(second.charAt(second.length() - i - 1)) : 0;
		}*/
		
		int memory = 0; 
		for (int i = 0; i < maximum; i++) { 
			firstNumber [i] = (i < first.length()) ? Character.getNumericValue(first.charAt(first.length() - i - 1)) : 0;
			secondNumber [i] = (i < second.length()) ? Character.getNumericValue(second.charAt(second.length() - i - 1)) : 0;
			memory = (firstNumber[i] + secondNumber[i]) + (memory / 10);
			sum [i] = memory % 10;
		//System.out.println(sum[i]);
		}
		
		for (int i = 0; i < maximum; i++) {
			System.out.print(sum[maximum - i - 1]);}
		
		System.out.println();
//		System.out.println(Integer.parseInt(first) + Integer.parseInt(second));
	}
}
		
		
		
		
		/*		
		
		
		
		for (int i = 0; i < firstNumber.length; i++) {
			System.out.println(firstNumber[i]);}
		
/*		
 * 
 * System.out.println(firstNumber[i] + "/" + secondNumber[i]);
 
		
		mas[1] = array(first);
		mas[2] = array(second);
		
		
		for (int i = 0; i < mas[1].length; i++) {
			System.out.println(mas[1][i-1]);
		}
		
		/*
		
		
		int[] sum = new int [Math.max(firstNumber.length, secondNumber.length) + 1];
		int memory = 0;
		
		for (int i = 0; i < Math.min(firstNumber.length, secondNumber.length); i++) { 
			System.out.println(firstNumber[i] + "/" + secondNumber[i]);
			sum [i] = (firstNumber[i] + secondNumber[i]) % 10 + memory;
			memory = (firstNumber[i] + secondNumber[i]) / 10;
			System.out.println(sum[i]);
		}
		
		int left = 0;
		
		
		if (firstNumber.length > secondNumber.length) {
			left = firstNumber.length - secondNumber.length;
			
		}
		System.out.println(sum.length);
		
		
		
		
		
	//	for (int i = 0; i < firstNumber.length; i++) {
		//System.out.println(firstNumber[i]);
		
		//}
				
/*				;
		System.out.print("Enter seconf number: ");
		read = in.nextLine();
		int[] secondNumber = array (read);
		
		if (firstNumber.length > secondNumber.length) {
			int[] sum = firstNumber 
		}
		int[] sum = 
		

		
		
		int memory = 0;
		String sum = "";
		do {
			memory = Character.getNumericValue((firstNumber.charAt(firstNumber.length()-1))) 
					+ Character.getNumericValue((secondNumber.charAt(secondNumber.length()-1)))
					+ (memory / 10);
			
			sum = Integer.toString(memory % 10) + sum;
	
			firstNumber = firstNumber.substring(0, firstNumber.length()-1);
			secondNumber = secondNumber.substring(0, secondNumber.length()-1);

		}while ((firstNumber.length() > 0) && (secondNumber.length() > 0));
		
		System.out.println("Sum is: " + firstNumber + secondNumber + sum);*/