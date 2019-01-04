package com.Test01;

class U_Class {
	String nic_name; // 값을 비교하는 메소드

	public U_Class() {
	}

	public U_Class(String nic_name) {
		this.nic_name = nic_name;

	}
	// 주소 이외의 비교를 할 때 재정의 후 사용한다.
	/*
	 * @Override // 기존 method에 덮어 씌우는 용도 public boolean equals(Object obj) { //
	 * U_Class u4가 들어온다. U_Class res = (U_Class) obj; if
	 * (this.nic_name.equals(res.nic_name)) { return true; } return false; }
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nic_name == null) ? 0 : nic_name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		// 1. 객체의 주소를 비교한다. 2. null인지 확인(참조값)
		// 3. 클래스가 주소 및 속성을 비교한다. (type)
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		U_Class other = (U_Class) obj;
		if (nic_name == null) {
			if (other.nic_name != null)
				return false;
		} else if (!nic_name.equals(other.nic_name))
			return false;
		return true;
	}
}

public class MTest01 {
	public static void main(String[] args) {

		U_Class u3 = new U_Class("야옹이");
		U_Class u4 = new U_Class("야옹이");

		System.out.println("값 비교 : " + (u3.equals(u4)));
		System.out.println("야옹".equals("야옹"));

		/*
		 * U_Class u1 = new U_Class(); U_Class u2 = new U_Class();
		 * 
		 * System.out.println("주소 비교 : " +(u1 == u2)); System.out.println("주소 비교 : "
		 * +(u1.equals(u2))); // ==, .equals 같다.
		 */

	}
}
