package selenium_java;

import java.util.Scanner;;

public class Sorting {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int arr[] = new int[5];
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter 5 array elements: ");
	for (int i = 0; i < arr.length; i++) {
	    arr[i] = scanner.nextInt();
	}

	System.out.println("Array Elements are: ");
	for (int i = 0; i < arr.length; i++) {
	    System.out.println(arr[i]);
	}

	for (int i = 0; i < arr.length; i++) {
	    for (int j = i; j < arr.length; j++) {
		if (arr[i] > arr[j]) {
		    int temp = arr[i];
		    arr[i] = arr[j];
		    arr[j] = temp;
		}
	    }
	}

	System.out.println("After sorting Array Elements are: ");
	for (int i = 0; i < arr.length; i++) {
	    System.out.println(arr[i]);
	}
    }

}
