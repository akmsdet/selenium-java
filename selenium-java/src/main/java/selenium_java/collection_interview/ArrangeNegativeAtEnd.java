package selenium_java.collection_interview;

public class ArrangeNegativeAtEnd {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int arr[] = { 3, -3, 45, 2, -19, -7, 56, 45,0 };
	int len = arr.length, counter = 0;
	int temp[] = new int[len];

	for (int i = 0; i < arr.length; i++) {
	    if (arr[i] > 0 || arr[i] == 0) {
		temp[counter++] = arr[i];
	    }
	}
	
	for (int i = 0; i < arr.length; i++) {
	    if (arr[i] < 0 ) {
		temp[counter++] = arr[i];
	    }
	}
	
	for(int i:temp) {
	    System.out.print(i + " ");
	}
	
    }

}
