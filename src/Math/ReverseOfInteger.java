package Math;

public class ReverseOfInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(-217483412));
	}

	public static int reverse(int x) {
		int a = 0;
		int b = x;
		int c = 0;
		boolean flag = false;
		if (x < 0) {
			flag = true;
			x = -x;
		}
		while (x > 0) {
			c++;
			int temp = x % 10;
			if (a > (Integer.MAX_VALUE - temp) / 10) { // once overflow occured directly it'll directly pops the error so checking before one step
				return 0;
			}
			x = x / 10;
			a = a * 10 + temp;
		}
		if (flag == true) {
			a = -a;
		}
		return a;
	}

}
