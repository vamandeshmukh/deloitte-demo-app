package com.deloitte.demo;

// functional interface - contains only ONE public abstract method 

// functional interface can be implemented in three ways - 

// 1. with implements 
// 2. with anonymous inner class 
// 3. with lambda expression 

// Java 8 onwards - 
// an interface can contain zero or more static methods 
// an interface can contain zero or more default (non static) methods 

//@FunctionalInterface 

interface FunInt {

	public default void aDefaultMethod() {
		System.out.println("a default method");
	}

	public default void anotherDefaultMethod() {
		System.out.println("another default method");
	}

	// other methods - concrete methods, (static methods and default methods )
	public static void aStaticMethod() {
		System.out.println("a static method");
	}

	public static void anotherStaticMethod() {
		System.out.println("another static method");
	}

//	public abstract void funMethod();
}

// calling / invoking a default emthod from an interface 

public class FunDemo implements FunInt {
	
	public static void main(String[] args) {
		FunDemo obj = new FunDemo();
		obj.aDefaultMethod();
		obj.anotherDefaultMethod();
	}
}

////3. with lambda expression 
//public class FunDemo {
//	public static void main(String[] args) {
//		System.out.println("Start");
//
//		FunInt.aStaticMethod();
//		FunInt.anotherStaticMethod();
//
//		FunInt obj = () -> {
//			System.out.println("fun method using lambda expression");
//		};
//		obj.funMethod();
//	}
//}

////2. with anonymous inner class  
//public class FunDemo {
//
//	public static void main(String[] args) {
//		System.out.println("Start");
//
//		FunInt obj = new FunInt() {
//			@Override
//			public void funMethod() {
//				System.out.println("fun method using anonymous inner class");
//			}
//		};
//		obj.funMethod();
//	}
//}

////1. with implements 
//public class FunDemo implements FunInt {
//
//	public static void main(String[] args) {
//		System.out.println("Start");
//		FunDemo obj = new FunDemo();
//		obj.funMethod();
//	}
//
//	@Override
//	public void funMethod() {
//		System.out.println("fun method with implements");
//	}
//}
