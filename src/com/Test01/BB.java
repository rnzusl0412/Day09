package com.Test01;

public class BB extends AA {

	private int b;

	public BB() {
		super(); // this() �� super() �� �� �ϳ��� �� �� �ִ�.
	}

	public BB(int b) {
		super();
		this.b = b;
	}

	public BB(int a, int b) {
		super(a);
		this.b = b;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getSum() {
		// int Sum = a+b; //x
		// int Sum = this.getA()+b; //o �ι� ȣ��
		// int Sum = this.getA()+this.getB(); //o ������ ���� �� �ڵ�
		// int Sum = super.getA()+b; // o
		int Sum = getA() + getB();
		return Sum;
	}
}
