package com.deloitte.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

// streams - group and proccess data 

public class StreamsDemo {

	public static void main(String[] args) {

		// create a list of employees
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101, "Sonu", 1500));
		empList.add(new Employee(102, "Monu", 1000));
		empList.add(new Employee(103, "Tonu", 1800));
		empList.add(new Employee(104, "Ponu", 2000));
		empList.add(new Employee(105, "Gonu", 1300));

		System.out.println("Employee List");
		System.out.println(empList);

		Iterator<Employee> it = empList.iterator();
		System.out.println("Using iterator");
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}

		System.out.println("using forEach anonymous inner class");

		empList.forEach(new Consumer<Employee>() {
			@Override
			public void accept(Employee emp) {
				System.out.println(emp.toString());
			}
		});

		System.out.println("using forEach with lambda expression");

		empList.forEach((emp) -> {
			System.out.println(emp.toString());
		});

	}

}
