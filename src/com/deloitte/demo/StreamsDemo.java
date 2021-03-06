package com.deloitte.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

		System.out.println("All employees as a stream");

		Stream<Employee> empStream = empList.stream();

		empStream.forEach(emp -> System.out.println(emp.toString()));

		System.out.println("Employees with salary > 1500");

		Stream<Employee> empWithMoreSalary = empList.stream().filter(emp -> emp.salary > 1500);

		empWithMoreSalary.forEach(emp -> System.out.println(emp.toString()));

		System.out.println("First three Employees ");

		Stream<Employee> firstThreeEmps = empList.stream().limit(3);

		firstThreeEmps.forEach(emp -> System.out.println(emp.toString()));

		System.out.println("All except first three Employees ");

		Stream<Employee> skipFirstThreeEmps = empList.stream().skip(3);

		skipFirstThreeEmps.forEach(emp -> System.out.println(emp.toString()));

		System.out.println("pay hike using map()");

//		map(Function<? super T,? extends R> mapper)

		List<Double> payHike = empList.stream().map(emp -> emp.salary = emp.salary + 1000).collect(Collectors.toList());

		payHike.forEach(emp -> System.out.println(emp.toString()));
		System.out.println(empList);
		
//		List<Employee> aa = empList.stream().filter().limit().map().collect();

	}

}
