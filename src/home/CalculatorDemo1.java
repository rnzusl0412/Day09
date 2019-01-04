package home;

class Calculator {
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}

	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}

}

// Calculator 기능을 Sub가 확장하고 있다.
// SubstractionableCalculator 는 f 로 표현해도 무관
class SubstractionableCalculator extends Calculator {
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

class MultipleableCalculator extends Calculator {
	public void multiple() {
		System.out.println(this.left * this.right);
	}
}

public class CalculatorDemo1 {
	public static void main(String[] args) {
		SubstractionableCalculator c1 = new SubstractionableCalculator();
		MultipleableCalculator c2 = new MultipleableCalculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		c1.substract();
		c2.setOprands(20, 50);
		c2.multiple();

	}
}