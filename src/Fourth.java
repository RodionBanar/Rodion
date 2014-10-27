import java.util.Scanner;
import java.util.ArrayList;

public class Fourth {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please, input array size: ");
		int size = Integer.parseInt(in.nextLine());

		int[] mas = new int[size];
		ArrayList<Integer> mas2 = new ArrayList<Integer>(size);

		for (int i = 1; i < size + 1; i++) {
			System.out.print("Please, input " + i + " element of the array: ");
			mas[i - 1] = Integer.parseInt(in.nextLine());
			if (mas[i - 1] < 0) {
				mas2.add(0, mas[i - 1]);
			} else {
				mas2.add(mas[i - 1]);
			}
		}
		System.out.print("New array will be the following: ");
		for (int j : mas2) {
			System.out.print(j + " ");
		}
	}
}