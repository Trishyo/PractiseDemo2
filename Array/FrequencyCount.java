package Array;

public class FrequencyCount {

	public static void main(String[] args) {
		int arr[] = { 10, 5, 10, 15, 10, 5 };
		int n = arr.length;
		countFreq(arr, n);
	}

	public static void countFreq(int arr[], int k) { //Creating Parameterized Method
		boolean visited[] = new boolean[k]; //Creating visited object to store count

		for (int i = 0; i < k; i++) {

			// Skip this element if already processed
			if (visited[i] == true)
				continue;

			// Count frequency
			int count = 1;
			for (int j = i + 1; j < k; j++) {
				if (arr[i] == arr[j]) {
					visited[j] = true;
					count++;
				}
			}
			System.out.println(arr[i] + " " + count);
		}
	}

}
