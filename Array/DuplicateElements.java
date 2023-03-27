package Array;

public class DuplicateElements {

	public static void main(String[] args) {
		int arr[] = new int [] {2,5,3,2,7,5,8,3,8,6};
		
		System.out.println("The Elements which have duplicates are : ");
		for (int i = 0; i< arr.length-1; i++) {
			for (int j = i+1; j< arr.length-1; j=j+1) {
				if (arr[i] == arr[j]) //&& (i!=j))
				System.out.println(arr[j]);
			}
		}

	}

}
