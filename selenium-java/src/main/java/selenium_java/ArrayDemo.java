/**
 * 
 */
package selenium_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author anil.k.mishra
 *
 */
public class ArrayDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

	int[] arr = new int[5];
	arr[0] = 10;
	arr[1] = 1;
	arr[2] = 23;
	arr[3] = 3;
	arr[4] = 45;

	int[] arr1 = {121,21,32,14,51};

	for(int i=0;i<arr.length;i++) {
	    System.out.println("arr"+ i +"-- "+ arr[i]);
	}

	for(int i=0;i<arr1.length;i++) {
	    System.out.println("arr1"+ i +"-- "+ arr1[i]);
	}

	ArrayList<String> names= new ArrayList();
	names.add("Anil");
	names.add("Kumar");
	names.add("Mishra");
	names.add("Parantap");
	System.out.println("ArrayList Size is:"+ names.size() + names.get(3));
	System.out.println("ArrayList contains:"+ names.contains("Kumar"));

	//ArrayList<Integer> aa= new ArrayList(arr);

	Arrays.sort(arr);
	for (int i = 0; i < arr.length; i++) 
	{
	    System.out.println(arr[i]);
	}
	List<int[]> nums = Arrays.asList(arr);
	for(int[] i:nums) {
	System.out.println(nums.get(0));
	}
    }

}
