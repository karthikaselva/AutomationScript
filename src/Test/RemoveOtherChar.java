package Test;

public class RemoveOtherChar {
	// class Main {
	public static void main(String[] args) {
		String t = "ja232@##^%*va425@^$script";
		char[] arr = t.toCharArray();
		for (char c : arr) {
			if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				System.out.print(c);
			}
		}
	}
	// }
}
