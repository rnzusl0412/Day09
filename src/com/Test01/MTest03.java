package com.Test01;
public class MTest03 {

	public static void main(String[] args) {
		// case1 : ��ü�� ����� ���� a=100 b=50 ���� �����ϰڴ�.
		BB b1 = new BB(); // new BB() -> new AA() AA() -> BB() ��ü������ ������ �����Ѵ�.
		b1.setA(100);
		b1.setB(50);
		System.out.println(" a = " + b1.getA() + ",  b = " + b1.getB());
		System.out.println("Sum(a,b) = " + b1.getSum());

		// case2 : �ʱⰪ 200 300�� ���� a,b�� �����ϸ鼭 ���� �����ϰڴ�.
		BB b2 = new BB(200, 300);
		System.out.println(" a = " + b2.getA() + ",  b = " + b2.getB());
		System.out.println("Sum(a,b) = " + b2.getSum());

		// case3 : ���� f�� �����ϴ� F��� Ŭ������ ������.
		FF f1 = new FF(300, 200, 50); // (300+200)-50
		System.out.println(" a = " + b2.getA() + ", b = " + b2.getB() + ", c = " + f1.f);
		System.out.println("Res(a,b,c) = " + f1.getRes()); // 450�� ��µȴ�.

		
	}
}
