package week1.Day1;

public class Calculator {

	public void subract() {

		System.out.println(20 - 10);
	}

	public void subract(int a) {
		System.out.println(a - 10);
	}

	public void subract(int a, float b) {
		System.out.println(a - b);
	}

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		obj.subract();
		obj.subract(10);
		obj.subract(100, 55.5f);
	}

}
