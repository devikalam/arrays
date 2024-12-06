package javaproblems;

public class VowelsPresentInGivenString {

	public static void main(String[] args) {
		String s="devi123";
		int c=0;boolean flag=false;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				flag=true;
			}
		}
		if(flag==true) {
			System.out.println("vowels present in the string");
		}
		else {
			System.out.println("vowels not present in the string");
		}
	}

}
