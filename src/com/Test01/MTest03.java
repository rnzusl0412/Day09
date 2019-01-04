package com.Test01;
public class MTest03 {

	public static void main(String[] args) {
		// case1 : 객체를 빈방을 만들어서 a=100 b=50 합을 리턴하겠다.
		BB b1 = new BB(); // new BB() -> new AA() AA() -> BB() 객체생성은 선조가 먼저한다.
		b1.setA(100);
		b1.setB(50);
		System.out.println(" a = " + b1.getA() + ",  b = " + b1.getB());
		System.out.println("Sum(a,b) = " + b1.getSum());

		// case2 : 초기값 200 300을 각각 a,b에 대입하면서 합을 리턴하겠다.
		BB b2 = new BB(200, 300);
		System.out.println(" a = " + b2.getA() + ",  b = " + b2.getB());
		System.out.println("Sum(a,b) = " + b2.getSum());

		// case3 : 변수 f를 관리하는 F라는 클래스를 만들어보자.
		FF f1 = new FF(300, 200, 50); // (300+200)-50
		System.out.println(" a = " + b2.getA() + ", b = " + b2.getB() + ", c = " + f1.f);
		System.out.println("Res(a,b,c) = " + f1.getRes()); // 450이 출력된다.

		
	}
}
