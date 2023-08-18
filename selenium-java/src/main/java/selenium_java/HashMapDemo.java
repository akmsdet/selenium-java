package selenium_java;

import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class HashMapDemo {
    public static void main(String ar[]) {
	HashSet<String> name = new HashSet<>();
	name.add("anil");
	name.add("kumar");
	System.out.println(name);
	
	HashMap<String, Integer> stud = new HashMap<>();
	stud.put("A4", 01);
	stud.put("A1", 03);
	stud.put("A3", 02);
	stud.put("A2", 04);
	
	TreeMap<String, Integer> sorted = new TreeMap<>();
	sorted.putAll(stud);

	for (Map.Entry<String, Integer> entry : sorted.entrySet()) {
	    // for(Entry <String, Integer> val: stud.entrySet()){
	    System.out.println(entry.getKey() + " " + entry.getValue());
	}

    }

}
