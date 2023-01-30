package javaCollections;

import java.util.HashSet;

public class Hashing{
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		HashSet<Comparable> set = new HashSet<Comparable>();
		set.add(1234);
		set.add("Hello");
		set.add(1234);
		
		System.out.println(set.size());
	}
}	