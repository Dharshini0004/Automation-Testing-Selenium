package sample;

public class ReverseNameString {

	public static void main(String[] args) {
		String name = "Dharshini";
		char[] charArray = name.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
	}
}
