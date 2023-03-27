package Array;
//import java.util.Scanner;
public class AscendingOrder {

	public static void main(String[] args) {
		int arr[] = new int[] { 6, 1, 11, 14, 19 };
		/*Scanner sc = new Scanner(System.in);
        int n;    //Array Size Declaration
        System.out.println("Enter the number of elements :");
        n=sc.nextInt();    //Array Size Initialization
        
        int arr[] = new int[n];    //Array Declaration
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<n;i++)     //Array Initialization
        {
            arr[i]=sc.nextInt();
        }
        sc.close();*/
		int temp = 0;

		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i + 1; j < arr.length-1; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
			
				System.out.println("The Elements of sorted array in ascending order : ");
				for (int x = 0; x < arr.length; x++) {
					System.out.print(arr[x] + " ");
				}
			}
		}

