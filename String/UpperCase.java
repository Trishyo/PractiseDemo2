package String;

import java.util.Scanner;

public class UpperCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your String : ");
		String s = sc.nextLine();
		sc.close();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isUpperCase(c))
				System.out.println(c);
		}
	}

}
