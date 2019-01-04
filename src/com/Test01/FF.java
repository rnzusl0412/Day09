package com.Test01;

public class FF extends BB {
	public int f;

	public FF() {
		super();
	}

	public FF(int a, int b, int c) {
		super(a, b);
		this.f = c;
	}

	public int getF() {
		return f;
	}

	public void setF(int f) {
		this.f = f;
	}

	public int getRes() {
		int f = getSum() - getF();
		return f;
	}

}
