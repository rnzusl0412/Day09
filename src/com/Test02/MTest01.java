package com.Test02;

public class MTest01 {

	public static void main(String[] args) {
		// DD�� ��ü�� getA()�� ȣ�� (protected�� ��� �ٸ� ��Ű�������� ȣ�� �Ұ�)
		DD d1 = new DD();
		d1.setA(100);
		d1.setD(2);
		System.out.println(d1.getA() + " : " + d1.getD() + " : " + d1.getRes());
	}

}
