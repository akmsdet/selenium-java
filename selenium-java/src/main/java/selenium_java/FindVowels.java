package selenium_java;

public class FindVowels {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	String name = "Anil kumar mishra";
	for (int i = 0; i < name.length(); i++) {
	    if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'
		    || name.charAt(i) == 'u') {
		System.out.println(name.charAt(i));
	    }
	}
    }

}
