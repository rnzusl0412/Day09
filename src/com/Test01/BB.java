package com.Test01;

public class BB extends AA {

	private int b;

	public BB() {
		super(); // this() 와 super() 둘 중 하나만 쓸 수 있다.
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
		// int Sum = this.getA()+b; //o 두번 호출
		// int Sum = this.getA()+this.getB(); //o 있으나 마나 한 코드
		// int Sum = super.getA()+b; // o
		int Sum = getA() + getB();
		return Sum;
	}
}
