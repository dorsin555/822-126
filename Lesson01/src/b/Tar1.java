package b;

import java.util.Scanner;

public class Tar1 {
	
	// �� ����� ��� ������ ������ �� �����
	public static void main(String[] args) {
		// ��� ����
		String torKelet = "13 19 1 7";
		// create a scanner connected to the input queue
		Scanner sc = new Scanner(torKelet);
		// get the 2 numbers
		int x = sc.nextInt();
		int y = sc.nextInt();
		// calculate sum
		int sum = x + y;
		// print the result
		System.out.println(sum);
		sc.close();
	}

}
