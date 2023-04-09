package power;

public class Topower {

	public static void main(String[] args) {
		int[] arr = toPower(6,8);
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static int[] toPower(int size, int power) {
		int[] result = new int[size]; // create an array of size "size"
		for (int i = 0; i < size; i++) {
			result[i] = (int) Math.pow(i, power); // raise each index to the value of "power"
		}
		return result; // return the array
	}
}
