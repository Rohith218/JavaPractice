package Math;

public class addStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		numasd("6913259244");
		addStrings1("149","134");
	}
	public static int numcon(String a) {
		int b =0;
		for(int i=0;i<a.length();i++) {
			b = b*10 + (a.charAt(i) - '0');
		}
		System.out.println(b);
		return b;
	}
	public String addStrings2(String num1, String num2) {
        long a = numcon(num1);
        long b = numcon(num2);
        return a + b + "";
    }
	public static String addStrings1(String num1, String num2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        int carry = 0;
        int i = num1.length()-1;
        int j = num2.length()-1;
        while(i>=0||j>=0||carry!=0) {
        	int n1 = (i>=0)? num1.charAt(i) -'0':0;
        	int n2 = (j>=0)? num2.charAt(j) -'0':0;
        	int sum = n1 + n2 + carry;
        	System.out.println(n1+"     "+n2 +"   "+sum%10);
        	carry = sum/10;
        	s1.append(sum%10+"");
        	i--;
        	j--;
        }
//        for(int m = s1.length()-1;m>=0;m++) {
//        	s2.append(s1.charAt(i));
//        }
        System.out.println(s1.reverse());
        return s1.reverse().toString();
    }

}
