package selenium_java;

public class MethodsDemo {

    public int sum(int num1, int num2) {
	return num1 + num2;
    }

    public float sum(float num1, float num2) {
	return num1 + num2;
    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	MethodsDemo md = new MethodsDemo();
	CommonMaths cm = new CommonMaths();
	System.out.println(md.sum(10, 4));
	System.out.println(md.sum(10.3f, 4.8f));
	System.out.print(cm.areaOfCircle(5));
    }

}
