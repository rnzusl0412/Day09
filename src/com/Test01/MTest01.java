package com.Test01;

class U_Class {
	String nic_name; // ���� ���ϴ� �޼ҵ�

	public U_Class() {
	}

	public U_Class(String nic_name) {
		this.nic_name = nic_name;

	}
	// �ּ� �̿��� �񱳸� �� �� ������ �� ����Ѵ�.
	/*
	 * @Override // ���� method�� ���� ����� �뵵 public boolean equals(Object obj) { //
	 * U_Class u4�� ���´�. U_Class res = (U_Class) obj; if
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
		// 1. ��ü�� �ּҸ� ���Ѵ�. 2. null���� Ȯ��(������)
		// 3. Ŭ������ �ּ� �� �Ӽ��� ���Ѵ�. (type)
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

		U_Class u3 = new U_Class("�߿���");
		U_Class u4 = new U_Class("�߿���");

		System.out.println("�� �� : " + (u3.equals(u4)));
		System.out.println("�߿�".equals("�߿�"));

		/*
		 * U_Class u1 = new U_Class(); U_Class u2 = new U_Class();
		 * 
		 * System.out.println("�ּ� �� : " +(u1 == u2)); System.out.println("�ּ� �� : "
		 * +(u1.equals(u2))); // ==, .equals ����.
		 */

	}
}
