package javaproblems;

public class NeonNo {

	public static void main(String[] args) {
	int n=9,sum=0,sq=n*n;
	while(sq>0) {
		
		int rem=sq%10;
		sum=sum+rem;
		sq=sq/10;
	}
if(sum==n) {
	System.out.println("neon no");
}
else {
	System.out.println("not a neon no");
}
	}

}
