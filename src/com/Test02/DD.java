package com.Test02;

import com.Test01.AA;

public class DD extends AA {
	private int d;

	public DD() {
	}

	public DD(int d) {
		this.d = d;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public int getRes() { // getA() 호출할 수 있는 이유는?
							// 다른패키지의 선조를 상속시 접근제한자가 public이기 때문이다.
		return getA() ^ getD(); // getA()의 접근제한자가 public이기 때문이다.
	}
}
