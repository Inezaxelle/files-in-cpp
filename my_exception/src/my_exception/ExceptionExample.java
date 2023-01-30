package my_exception;

public class ExceptionExample {
	public static void main(string[] args) {
		Mymethod();
	}
	static void Mymethod() {
		try {
			int x = 8/0;
			System.out.println("inside try. ");
			printStackTrace();
		} catch (Exception e) {
			System.err.println(e.toString());
			System.err.println(e.getMessage());
			e.printStackTrace();
			System.out.println("inside catch. ");
		} finally {
			System.out.println("inside finally.");
		}
	}
}
