package com.Test01;

public class AA {
	private int a;

	public AA() {
	}

	public AA(int a) {
		super();
		this.a = a;
	}

	// protected 상속될 경우 후손에게만 public
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

}
