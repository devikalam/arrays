package javaproblems;

public class PrimeFactorex {

	public static void main(String[] args) {
		int[]a= {2,12,13,10};
int ele=130;boolean flag=false;
for(int i=0;i<a.length;i++) {
	if(ele==a[i]) {
		flag=true;
		break;
	}
	
}
if(flag==true) {
	System.out.println("ele found");
}
else {
	System.out.println("not found");
}
	}

}
