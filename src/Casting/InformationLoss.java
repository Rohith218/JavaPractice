package Casting;

public class InformationLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Explicit Casting Information Loss
		
		byte b = (byte) 123456;    //Out Of Range Assignment
		int a = (int) 3.14;        //truncation
		System.out.println(a);
		
		
		//Implicit Casting Information Loss
		
		int x = 123456782;
		float y = x;
		int z = (int) y;
		System.out.println(z);
		
	}

}
