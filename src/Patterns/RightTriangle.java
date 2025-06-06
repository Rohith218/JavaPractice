package Patterns;

public class RightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printRight(5);
	}
	public static void printRight(int n)
	{
		for(int i =0;i<n;i++) {
			for(int j = 0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
