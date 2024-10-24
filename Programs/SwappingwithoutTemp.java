package week2.day1;

public class SwappingwithoutTemp {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("before Swapping value of a:" + a);
		System.out.println("before Swapping value of b:" + b);
		System.out.println("-----------------------------------");
		b = b - a; //20-10=10 //b=10
		a = a + b; //10+10=20//a=20
		System.out.println("after Swapping value of a:" + a);
		System.out.println("after Swapping value of b:" + b);

	}

}
/*before Swapping value of a:10
before Swapping value of b:20
-----------------------------------
after Swapping value of a:20
after Swapping value of b:10 */
