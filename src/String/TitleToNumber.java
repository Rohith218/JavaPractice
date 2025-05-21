package String;

public class TitleToNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(titleToNumber("ZZ"));
	}
	public static int titleToNumber(String columnTitle) {
        int n = columnTitle.length();
        int num= 0;
        for(int i =n-1;i>=0;i--){
        	int temp = 0;
        	if(columnTitle.charAt(i)>='A'&&columnTitle.charAt(i)<= 'Z') {
        		temp = columnTitle.charAt(i)-'A'+1;
        	}
        	num = num + temp * (int)Math.pow(26, n-i-1);
        }
        return num;
    }

}
