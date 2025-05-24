package Arrays;

import java.util.Arrays;

public class distributeCandies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] c = distributeCandies1(10,3);
		System.out.println(Arrays.toString(c));
	}
	public static int[] distributeCandies1(int candies, int num_people) {
        int[] a = new int[num_people];
        int b = candies;
        int i = 0;
        int ini = 1;
        while(b>=0){
        	if(b>ini) {
        		a[i] = a[i]+ini;
        		b = b - ini;
        	}else {
        		a[i] = a[i] +b;
        		b = b-ini;
        	}
            ini++;
            i++;
            i = (i>=a.length)?0:i+1;
        }
        return a;
    }
}
