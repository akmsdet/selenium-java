package selenium_java.collection_interview;

import java.util.ArrayList;
import java.util.List;

public class ArrangeNegativeEndUsingDS {
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int arr[] = { 3, -3, 45, 2, -19, -7, 56, 45, 0 };

	List<Integer> allnums = new ArrayList<>();
	List<Integer> negativeNums = new ArrayList<>();
	for (int i : arr) {
	    if (i > 0 || i == 0) {
		allnums.add(i);
	    } else {
		negativeNums.add(i);
	    }
	}

	allnums.addAll(negativeNums);
	System.out.print(allnums);

    }
}
