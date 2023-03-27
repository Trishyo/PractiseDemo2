package String;
import java.util.*;

public class StringDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your String : ");
		String s = sc.nextLine();
		sc.close();
		for (int i = 0; i<s.length(); i++) {
			char c = s.charAt(i);
			System.out.print(c);
		}
		

	}

}
