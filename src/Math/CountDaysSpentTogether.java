package Math;

import java.util.Arrays;

public class CountDaysSpentTogether {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "08-15";
		intnumDays(s);
		countDaysTogether("09-01","10-19","06-19","10-20");
	}

	public static int countDaysTogether(String arriveAlice, String leaveAlice,
			String arriveBob, String leaveBob) {
		int a = intnumDays(arriveAlice);
		int b = intnumDays(leaveAlice);
		int c = intnumDays(arriveBob);
		int d = intnumDays(leaveBob);
		int res = Math.min(b, d) - Math.max(a, c);
		if(res<0) {
			return 0;
		}else {
			res+=1;
		}
		System.out.println(res);
		return res;
	}

	public static int intnumDays(String s){
        int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int num =0;
        String[] sa = s.split("-");
        int month = Integer.parseInt(sa[0]);
        int day = Integer.parseInt(sa[1]);
        int sum  = 0;
        for(int i=0;i< month-1;i++) {
        	sum+=a[i];
        }
        num = sum + day;
        return num;
	}
        

}
