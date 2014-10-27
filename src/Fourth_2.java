import java.util.Scanner;

public class Fourth_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please, input array size: ");
		int size = Integer.parseInt(in.nextLine());

		int[] mas = new int[size];
		int[] mas2 = new int[size];
		int beginning = 0;
		int end = size;

		for (int i = 1; i < size + 1; i++) {
			System.out.print("Please, input " + i + " element of the array: ");
			mas[i - 1] = Integer.parseInt(in.nextLine());
			if (mas[i - 1] < 0) {
				mas2[beginning] = mas[i - 1];
				beginning++;
			} else {
				mas2[end - 1] = mas[i - 1];
				end = end - 1;
			}
		}
		System.out.print("New array will be the following: ");
		for (int j : mas2) {
			System.out.print(j + " ");
		}
	}
}