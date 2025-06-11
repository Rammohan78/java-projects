package app;

public class ConstantTimeExample {
	
	public static void printfirstElement(int[] arr) {
		if (arr.length>0) {
			System.out.println("first element is:"+arr[0]);
		}
		else {
			System.out.println("Array is empty");
		}
	}

	public static void main(String[] args) {
		int [] numbers= {7,20,30,40,50,6,44,78,89,67,48};
		printfirstElement(numbers);
	}

}
