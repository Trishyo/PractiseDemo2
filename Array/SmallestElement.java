package Array;

public class SmallestElement {

	public static void main(String[] args) {
		int arr[] = new int [] {12,17,64,9,53,46};
		int min = arr[0];
		for (int i = 0; i<arr.length; i++) {
			if (arr[i]< min)
				min = arr[i];
		}
		System.out.println("The Smallest Element in the Array is : " + min);

	}

}
