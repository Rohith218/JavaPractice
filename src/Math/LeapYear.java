package Math;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leapYear(1928);
	}
	public static boolean leapYear(int a) {
		if(a%4 ==0 ) {
			if(a%100==0) {
				return a%400==0;
			}
			return true;
		}else {
			return false;
		}
	}
}
