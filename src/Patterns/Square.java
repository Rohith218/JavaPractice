package Patterns;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		squareBorder(5);
	}
	public static void square(int n) {
		for(int i =0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void squareBorder(int n) {
		for(int i =0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0||i==n-1||j==0||j==n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}


}
