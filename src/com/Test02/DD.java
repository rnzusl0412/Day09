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

	public int getRes() { // getA() ȣ���� �� �ִ� ������?
							// �ٸ���Ű���� ������ ��ӽ� ���������ڰ� public�̱� �����̴�.
		return getA() ^ getD(); // getA()�� ���������ڰ� public�̱� �����̴�.
	}
}
