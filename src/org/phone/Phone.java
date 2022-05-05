package org.phone;

public class Phone {

	private void phoneInfo() {
		System.out.println("Mobile");

	}
	private void phoneInfo(int a) {
		System.out.println("Mobile");

	}
	private void phoneInfo(int a,String s,float f) {
		System.out.println("\tMobile="+a +s +f );

	}
	private void phoneInfo(String s, char c,float f, int a) {
		System.out.println("\nMobile="+s +c +f +a);

	}
	public static void main(String[] args) {
		Phone p=new Phone();
		p.phoneInfo();
		p.phoneInfo(0);
		p.phoneInfo(56,  "oppo", 87.362f);
		p.phoneInfo("Redmi", '\u0000',  22.56f,  56);
		
		
		
		
	}
}
