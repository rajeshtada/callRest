package com.example.callRest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		StreamTest stest = new StreamTest();
//		stest.groupingByMultipleFieldsExample();
//		stest.listAndMapObjectValue();
		stest.listFilter();

	}

	public void groupingByMultipleFieldsExample() {

		List<Employee> employeesList = getEmpList();
		Stream<Employee> stream = employeesList.stream();
		Collector<Employee, ?, Map<String, Map<String, List<Employee>>>> groupingBy = Collectors
				.groupingBy(Employee::getDesignation, Collectors.groupingBy(Employee::getGender));

		Map<String, Map<String, List<Employee>>> collect = stream.collect(groupingBy);
		System.out.println(collect);
	}

	public void groupByMapping() {

//		Map<City, Set<String>> namesByCity
//		   = people.stream().collect(
//		     groupingBy(Person::getCity,
//		                mapping(Person::getLastName,
//		                        toSet())));

	}

	public void listToString() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);

//		String s = list.stream().map(e -> e.toString()).reduce("", String::concat);
		String s = list.stream().map(e -> "'" + e + "'").collect(Collectors.joining(","));
		System.out.println(s);
	}

	public void listFilter() {

		List<Employee> listP = new ArrayList<>();
		Employee process;

//		for (int i = 0; i < 3; i++) {
//			process = new Employee(i, "Bank = " + i, null, null, 0L);
//			listP.add(process);
//		}
		System.out.println(listP);
		List<Employee> collect = listP.stream().filter(x -> x.getId() == 2).collect(Collectors.toList());
		System.out.println(collect);
	}

	public void listAndMapObjectValue() {

//		listTxnLog.stream().filter(x-> x.getMerchantId() !=null).map(x->x.getMerchantId()).collect(Collectors.toList());
		List<Employee> employeesList = getEmpList();
		List<String> collect = employeesList.stream().filter(x -> x.getId() < 103).map(x -> x.getName())
				.collect(Collectors.toList());
		System.out.println(collect);
	}

	public List<Employee> getEmpList() {

		List<Employee> employeesList = new ArrayList<>();

		employeesList.add(new Employee(101, "Glady", "Manager", "Male", 25_00_000));
		employeesList.add(new Employee(102, "Vlad", "Engineer", "Female", 15_00_000));
		employeesList.add(new Employee(103, "Shine", "Lead Engineer", "Female", 20_00_000));
		employeesList.add(new Employee(104, "Nike", "Manager", "Female", 25_00_000));
		employeesList.add(new Employee(105, "Gagy", "Software Engineer", "Male", 15_00_000));
		employeesList.add(new Employee(106, "Murekan", "Software Engineer", "Male", 15_00_000));
		employeesList.add(new Employee(107, "Gagy", "Software Engineer", "Male", 15_00_000));
		return employeesList;
	}
}

class Employee {

	private int id;
	private String name;
	private String designation;
	private String gender;
	private long salary;

	public Employee(int id, String name, String designation, String gender, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.gender = gender;
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", gender=" + gender
				+ ", salary=" + salary + "]";
	}

}