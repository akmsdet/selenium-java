package selenium_java;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class SortHashMap {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	HashMap<String, Integer> data = new HashMap<>();
	data.put("Bin", 24);
	data.put("Parantaap", 17);
	data.put("Anil", 30);
	data.put("Kumar", 23);
	
	List<Entry<String, Integer>> list = new ArrayList<>(data.entrySet());
	List<Entry<String, Integer>> list1 = new ArrayList<>(data.entrySet());
	
	Collections.sort(list, new Comparator<Entry<String, Integer>>(){
	    
	@Override
	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
	    // TODO Auto-generated method stub
	    return o1.getValue()-o2.getValue();
	}
	});
 
	System.out.println(list);
	
	Collections.sort(list1,(o1, o2)->o2.getValue().compareTo(o1.getValue()));
	System.out.println(list1);
	
	LinkedHashMap<String, Integer> sorted=
	data.entrySet().stream().sorted((e1,e2)->{
	    return e1.getValue()-e2.getValue();
	}).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
	System.out.println(sorted);
	
	Stream<Entry<String, Integer>> s=data.entrySet().stream().sorted((o1,o2)->{
	    return o1.getValue()-o2.getValue();
	});
	s.forEach(n->System.out.println(n));
    
    }

}
