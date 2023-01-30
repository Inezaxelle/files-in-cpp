package exceptions;

class MyException extends Exception {
	class TextEx {
		void doStuff() throws MyException {
			throw new MyException();
		}
	}
}