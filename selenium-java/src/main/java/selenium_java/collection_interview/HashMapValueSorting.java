package selenium_java.collection_interview;

import java.util.Map;
import java.util.HashMap;
import java.util.*;

public class HashMapValueSorting {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Map<String, Integer> empData = new HashMap<>();
	empData.put("AK", 10891229);
	empData.put("Anil", 10891220);
	empData.put("AKM", 10891227);
	empData.put("Ast", 10891237);

	Set<Map.Entry<String, Integer>> entrySets = empData.entrySet();
	List<Map.Entry<String, Integer>> lis = new ArrayList<>(entrySets);

	//Collections.sort(lis,(o1,o2)->o1.getValue().compareTo(o2.getValue()));
	
	Collections.sort(lis, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
    }

}
