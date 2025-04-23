public class Arrays {
	// type[] identifier = new type[size]
	// type identifier[] = new type[size]



	public static void main(String... args) {
		String[] arrayString = new String[10];
		String[] arrayStringAnother = {"HELLO", "THERE"};
		int[][] intArray = new int[3][3];

		arrayString[8] = "hello";

		System.out.println(java.util.Arrays.toString(arrayString));
	}
}
