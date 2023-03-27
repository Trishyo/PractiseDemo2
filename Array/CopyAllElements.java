package Array;

public class CopyAllElements {

	public static void main(String[] args) {
		int arr[] = { 12, 48, 56, 92 };
		int brr[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++)
			brr[i] = arr[i];

		System.out.println("The original array is: ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

		System.out.println("\n\nContents of the copied array is");
		for (int i = 0; i < brr.length; i++)
			System.out.print(brr[i] + " ");
	}

}