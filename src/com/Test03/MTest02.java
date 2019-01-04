package com.Test03;

class My {
	public void MyPrn() {
		System.out.println("My' MyPrn()");
	}
}

public class MTest02 {
	public static void Disp(My m) { // My m = new My(); m.MyPrn()
		m.MyPrn();
	}

	public static void main(String[] args) {
		Disp(new My() {

			@Override
			public void MyPrn() {
				System.out.println("³»²¨´Ù.");
			}
		});
	}
}
