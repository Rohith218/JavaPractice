package Math;

public class Prime_Arrangements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numPrimeArrangements(100);
	}

	public static int numPrimeArrangements(int n) {
		int a = 1;
		if(n==1) {
			return 1;
		}else {
			for(int i = 2;i<=n;i++) {
				if(isPrime(i)==true) {
					a++;
				}
			}
		}
		int b = fact(a)/(fact(n-a));
		System.out.println(b);
		return b;
	}
	public static boolean isPrime(int n) {
	    if (n <= 1) return false;
	    for (int i = 2; i * i <= n; i++) {
	        if (n % i == 0) return false;
	    }
	    return true;
	}
	public static int fact(int n) {
		int a =2;
		if(n!=0) {
			for(int i = 3;i<=n;i++) {
				a = a*i;
			}
		}
		return a;
	}

}
