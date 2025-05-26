package Math;

public class myPow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myPow1(2.00000,-2147483648));
	}
	public static double myPow1(double x, int n) {
        double val = 1.00000;
        long a = n;
        if(n>0){
            val = positivePow( x,  a);
        }else if(n<0){
        	if((-(n)>=Integer.MAX_VALUE)) {
        		val = 0.00000;
        	}else {
        		val = positivePow( 1/x,  -a);
        	}
        }
        return val;
    }
    public static double positivePow(double x, long n) {
        double val = 1;
        while(n>0){
            val= val*x;
//            System.out.println(val);
            n--;
        }
        return val;
    }
//    public static double negPow(double x, int n) {
//        return 1/positivePow( x,  n) ;
//    }
}
