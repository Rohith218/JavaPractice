package Arrays;

import java.util.Arrays;

public class PassByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b = 32;
		change(b);
		System.out.println(b);
		int[] a = {1,2,3,4,5,6};
		System.out.println(Arrays.toString(a));
		arrayChange(a);
		System.out.println(Arrays.toString(a));
		
	}
	static void change(int a) {
		a =24;
	}
	static void arrayChange(int[] nums) {
		nums[0] =100;
	}
}
