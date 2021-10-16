package testpractice;

import java.util.Scanner;

public class HexaDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rem;
		String hex = "";
char hexChars[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		while (n > 0) {
			rem = n % 16;
			hex = hexChars[rem] + hex;
			n = n / 16;
		}
		System.out.println(hex);
	}
}
