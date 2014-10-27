import java.util.Scanner;

public class Fifth {

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.print("Enter number: ");
			int number = Integer.parseInt(in.nextLine());
			
			recurse(number);
		}

		static void recurse(int nature)
		{
			if (nature == 0)
			{
				return;
			}
			System.out.print(nature % 10);
			recurse(nature / 10);
		}

}