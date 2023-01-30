package javaCollections;

public class RuntimeExceptionExample {
public static void main(String[] args) {
System.out.println("hello from main");
myMethod();
}
static void myMethod() {
System.out.println("hello from my method.");
myNextMethod();
}
static void myNextMethod() {
int x = 8;
}
}