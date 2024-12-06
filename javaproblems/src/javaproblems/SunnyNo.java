package javaproblems;

public class SunnyNo {

	public static void main(String[] args) {
		int n=14;
		int n1=n+1;
		boolean flag=false;
		for(int i=1;i<=n1/2;i++) {
			if(i*i==n1) {
				flag=true;
				break;
			}
		}
		if(flag==true) {
			System.out.println(" sunny no");
		}
		else {
			System.out.println("not a sunny no" );
		}
	

	}

}
