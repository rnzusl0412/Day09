package com.Test03;

class ATest {
	public void Prn() {
		System.out.println("AA'Prn()");
	}
}

class BTest extends ATest {
	// ������ ���� Prn() �޼ҵ带 ȣ���ؼ� �ļ��� �ּҷ� ���Ǹ� �ٽ� �� ��. : ������
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
		BTest b1 = new BTest(); // b1. �� super ���� this �� ã�ư���.
		b1.Prn(); // A�� ���� B�� ����.

		ATest a1 = new ATest();
		a1.Prn();

		ATest a2 = new BTest();
		a2.Prn();

		BTest b2 = new BTest();
		b2.Disp();

	}
}
