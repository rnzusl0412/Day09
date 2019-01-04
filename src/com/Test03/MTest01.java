package com.Test03;

class ATest {
	public void Prn() {
		System.out.println("AA'Prn()");
	}
}

class BTest extends ATest {
	// 선조가 가진 Prn() 메소드를 호출해서 후손의 주소로 정의를 다시 한 것. : 재정의
	@Override
	public void Prn() {
		super.Prn();
		System.out.println("BB'Prn()");
		System.out.println("==============================");
	}

	public void Disp() {
		System.out.println("BB'Disp()");
	}
}

public class MTest01 {
	public static void main(String[] args) {
		BTest b1 = new BTest(); // b1. 은 super 보다 this 를 찾아간다.
		b1.Prn(); // A를 가고 B를 간다.

		ATest a1 = new ATest();
		a1.Prn();

		ATest a2 = new BTest();
		a2.Prn();

		BTest b2 = new BTest();
		b2.Disp();

	}
}
