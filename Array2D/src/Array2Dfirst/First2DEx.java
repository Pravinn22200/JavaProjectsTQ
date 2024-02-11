package Array2Dfirst;

public class First2DEx {

	public static void main(String[] args) {

		int rows = 3;
		int cols = 3;
		int[][] arr1 = new int[rows][cols];
		int no=1;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				arr1[i][j] = no;
				no++;
			}
		}
		System.out.println("--------------------------------------");
		
		for(int i=0;i<rows;i++)
		{
			for(int a : arr1[i])
			{
				System.out.print(a+" ");
			}
			System.out.println("");
		}
		System.out.println("--------------------------------------");

		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

}
