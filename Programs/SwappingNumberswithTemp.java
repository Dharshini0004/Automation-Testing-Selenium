package week2.day1;

public class SwappingNumberswithTemp {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int temp;
		System.out.println("before Swapping value of a:" + a);
		System.out.println("before Swapping value of b:" + b);
		System.out.println("-----------------------------------");
		temp = 10;
		a = b;
		b = temp;
		System.out.println("after Swapping value of a:" + a);
		System.out.println("after Swapping value of b:" + b);

	}

}
/*before Swapping value of a:10
before Swapping value of b:20
-----------------------------------
after Swapping value of a:20
after Swapping value of b:10*/
