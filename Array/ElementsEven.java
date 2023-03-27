package Array;

public class ElementsEven {

	public static void main(String[] args) {
		int arr[] = new int[] {10,42,19,76,21,65};
		System.out.println("The Elements present on even indexes are : ");
		for (int i = 1; i<=arr.length; i=i+2) {
			System.out.println(arr[i]);
		}

	}

}
