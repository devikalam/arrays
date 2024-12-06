package javaproblems;

public class BoxPattern {

	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				//if(i+j==n+1|| j-i==n-1 || i==3 && j>=2 &&j<=6) {
				if(i==1 || i==n || i==3 || i==2 && j==1 || i==4 ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
