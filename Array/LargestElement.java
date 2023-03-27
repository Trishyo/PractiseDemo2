package Array;

public class LargestElement {

	public static void main(String[] args) {
		int arr[] = new int [] {25,36,92,57,78,103,48};
		int max = arr[0];
		for (int i = 0; i<arr.length; i++) {
			if (arr[i]>max)
				max = arr[i];
		}
		System.out.println("The Largest Element is : " + max);
	}

}
