package week2.day1;

public class Factorial {

	public static void main(String[] args) {
		int num =5;
		int fact = 1;
		for (int i = num; i>= 1; i--) {
			fact = i * fact;
		}
		System.out.println("the factorial for number "+ num + " " + "is :" + fact);
	}
}
//the factorial for number 5 is :120