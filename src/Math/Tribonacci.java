package Math;

public class Tribonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(tribonacci(35));
	}
	public static int tribonacci1(int n) {
        if(n==0){
            return 0;
        }else if(n==1||n==2){
            return 1;
        }
        return tribonacci1(n-1) + tribonacci1(n-2) + tribonacci1(n-3);
    }
	public static  int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        int[] dp = new int[n+2];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        for(int i =3;i<=n;i++) {
        	dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        return dp[n];
	}

}
