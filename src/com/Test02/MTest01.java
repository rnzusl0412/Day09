package com.Test02;

public class MTest01 {

	public static void main(String[] args) {
		// DD의 객체로 getA()를 호출 (protected인 경우 다른 패키지에서는 호출 불가)
		DD d1 = new DD();
		d1.setA(100);
		d1.setD(2);
		System.out.println(d1.getA() + " : " + d1.getD() + " : " + d1.getRes());
	}

}
