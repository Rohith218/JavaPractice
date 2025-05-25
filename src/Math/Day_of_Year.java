package Math;

import java.util.Arrays;

public class Day_of_Year {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dayOfYear("2019-02-10");
	}


	public static int dayOfYear(String date) {
		String[] str = date.split("-");
		int[]  daysInMonths = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//		System.out.println(Arrays.toString(str));
//		System.out.println(leapYear(Integer.parseInt(str[0])));
		daysInMonths[1] = (leapYear(Integer.parseInt(str[0])))?29:28;
		int days = 0;
		if(str[1]=="02") {
			days = Integer.parseInt(str[2]);
		}else {
			for(int i=0;i<Integer.parseInt(str[1])-1;i++) {
				days = days + daysInMonths[i];
			}
			days += Integer.parseInt(str[2]);
		}
//		System.out.println(days);
		return days;

	}
	public static boolean leapYear(int a) {
		return (a%4 == 0 &&(a%100!=0 || a%400==0));
	}

}
