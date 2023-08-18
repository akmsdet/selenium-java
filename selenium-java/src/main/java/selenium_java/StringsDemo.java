package selenium_java;

public class StringsDemo {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	String names = "Anil kumar mishra";
	String[] splitString = names.split(" ");
	System.out.println(splitString[1]);

	for (int s = 0; s < splitString.length; s++) {
	    System.out.println(splitString[s]);
	}
	String[] splitString1 = names.split("kumar");
	System.out.println(splitString1[1].trim());

	for (int i = 0; i < names.length(); i++) {
	    System.out.print(names.charAt(i));
	}
	/* reverse */
	System.out.println();
	for (int i = names.length() - 1; i >= 0; i--) {
	    System.out.print(names.charAt(i));
	}

    }

}
