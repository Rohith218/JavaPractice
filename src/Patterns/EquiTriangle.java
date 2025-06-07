package Patterns;

public class EquiTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		equi(5);
	}
	public static void equi(int n)
	{
		for(int i =0;i<n;i++) {
			for(int k =0;k<n-i-1;k++) {
				System.out.print(" ");
			}
			for(int j = 0;j<2*i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
