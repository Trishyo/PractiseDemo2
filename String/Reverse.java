package String;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your String : ");
		String s = sc.nextLine();
		sc.close();
		String reverse = " ";
		
		/* for (int i = 0; i < s.length(); i ++) {
			char c = s.charAt(i);
			reverse = c + reverse;
		}
		*/
		
		
		for (int i = s.length()-1; i >= 0; i-- ) {
			reverse = reverse + s.charAt(i);
		}
		System.out.println("The reverse string is : " + reverse);

	}
	

} 
