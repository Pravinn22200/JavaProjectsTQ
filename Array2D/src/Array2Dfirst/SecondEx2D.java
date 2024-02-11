package Array2Dfirst;

public class SecondEx2D {

	public static void main(String[] args) {

		int arr[][]= {{1,1},{1,2},{1,3}};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int a : arr[i])
			{
				System.out.print(a+" ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
