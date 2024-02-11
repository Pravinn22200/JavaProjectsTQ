package Array2Dfirst;

import java.util.Scanner;

public class SumOfRows {

	public static void sumOfRows(int[][] ar) {
		
		for (int i = 0; i < ar.length; i++) {
			int sum=0;
			for (int j = 0; j < ar[i].length; j++) {
				
				System.out.print(ar[i][j] + " ");
				sum += ar[i][j];
			}
			System.out.println("Sum : "+sum);
		}
		
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows : ");
		int rows = sc.nextInt();

		System.out.println("Enter cols : ");
		int cols = sc.nextInt();

		int arr[][] = new int[rows][cols];

		System.out.println("---------------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the values of rows " + (i + 1) + " : ");
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		sumOfRows(arr);
	}

}
