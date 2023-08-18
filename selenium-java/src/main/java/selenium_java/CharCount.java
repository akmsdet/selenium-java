package selenium_java;

import java.util.HashMap;
import java.util.Scanner;

public class CharCount {
    public static void main(String arg[]) {

	String sen = "My Name is Anil and I live in India";
	System.out.println("Actual Sentence: \t" + sen);
	String[] arrSen = sen.split(" ");
	String rev = "";
	for (int i = arrSen.length - 1; i >= 0; i--) {
	    rev += arrSen[i] + " ";
	}
	System.out.println(rev);
	System.out.println(new StringBuilder(sen).reverse());

	HashMap<Character, Integer> charCount = new HashMap<>();
	for (int i = 0; i < sen.length(); i++) {
	    if (charCount.containsKey(Character.toLowerCase(sen.charAt(i)))) {
		charCount.put(Character.toLowerCase(sen.charAt(i)), charCount.get(Character.toLowerCase(sen.charAt(i))) + 1);
		// charCount.put(sen.charAt(i), charCount.get(sen.charAt(i)) + 1);

	    } else
		charCount.put(Character.toLowerCase(sen.charAt(i)), 1);
	}

	if (charCount.containsKey(' ')) {
	    charCount.remove(' ');
	    System.out.println("Yes");
	}
	System.out.println(charCount);

	
	
	
	
	HashMap<Character, Integer> chCount = new HashMap<>();
	for (int i = 0; i < sen.length(); i++) {
	    chCount.put(Character.toLowerCase(sen.charAt(i)), chCount.getOrDefault(Character.toLowerCase(sen.charAt(i)), 0) + 1);
	    chCount.remove(' ');
	}
	System.out.println(chCount);


	HashMap<String, Integer> chCnt = new HashMap<>();
	System.out.println("How Many values you want to inset into HashMap ? :  ");
	Scanner sc = new Scanner(System.in);
	int hLen = sc.nextInt();
	for (int i = 0; i < hLen; i++) {
	    System.out.println("inset into HashMap Key? :  value?: ");
	    chCnt.put(sc.next(), sc.nextInt());
	}

	System.out.println(chCnt);
    }

}
