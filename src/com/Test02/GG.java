package com.Test02;

import com.Test01.FF;

public class GG extends FF{
	private int g;

	public GG() {
		super();
	}

	public GG(int a, int b, int c, int d) {
		super(a, b, c);
		this.g = d;
	}

	public int getG() {
		return g;
	}

	public void setG(int d) {
		this.g = d;
	}
	
	public int getGGG() {
		int Z = getRes()/getG();
		return Z;
	}

}
