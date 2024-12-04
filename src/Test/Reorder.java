package Test;

public class Reorder {
	// Online Java Compiler
	// Use this editor to write, compile and run your Java code online

	// class Main {
	public static void main(String[] args) {
		int[] Input = { 0, 2, 5, 0, 0, 9, 6, 1, 0, 9 };
		// int[] output = new int[Input.length];
		int in = 0;
		for (int i : Input) {
			if (i > 0) {
				System.out.print(i + ",");
				// output[in]=i;
				in++;
			}
		}
		// System.out.println(Input);
		for (int i = in; i < Input.length; i++) {
			System.out.print("0");
			if (i < Input.length - 1)
				System.out.print(",");
			// output[i]=0;
		}
		// System.out.println(output);
		// Output =[2,5,9,6,1,9,0,0,0,0]
	}
	// }//
	//
}
