package javaproblems;

public class Zshape{

	public static void main(String[] args) {
		System.out.println("--- butterfly---");


		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==n) {
					System.out.print("1 ");
				}
				else {
					System.out.print("2 ");
				}
			}
			System.out.println();
		
		} 
		}

}

