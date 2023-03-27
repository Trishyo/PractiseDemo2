package Array;

public class DescendingOrder {

	public static void main(String[] args) {
		int arr[] = { 65, 90, 83, 77, 35, 8, 18 };
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

				System.out.println("The Elements of sorted array in descending order : ");
				for (int x = 0; x < arr.length; x++) {
					System.out.print(arr[x] + " ");
				}
			}
		}
