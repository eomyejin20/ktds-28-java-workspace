package exam.string;

public class ArrayMethod {
	
	public static void printArrayValue(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
	
	public static void main(String[] args) {
		printArrayValue(new int[3]);
		printArrayValue(new int[] {1,2,4,});
		//printArrayValue({1,2,4,});
		
	}

}
