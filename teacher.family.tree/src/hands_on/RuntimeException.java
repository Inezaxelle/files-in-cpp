package hands_on;
public class RuntimeException {
	public static void main (String[] args) {
		System.out.println("Hello from main");
		myMethod;
	}
}

static void myMethod () {
	System.out.println("Hello from my method");
	myNextMethod();
}

static void myNextMethod() {
	int x = 8/0;
}