package Array;

public class ElementsOdd {

	public static void main(String[] args) {
		int arr [] = new int [] {18,35,67,93,547,382,58,72};
		System.out.println("The Elements present on odd indexes are : ");
		for (int i = 0; i<=arr.length-1; i=i+2) {
			System.out.println(arr[i]);
		}

	}

}
