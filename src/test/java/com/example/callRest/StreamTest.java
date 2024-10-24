package com.example.callRest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class StreamTest {

	public static void main(String[] args) {
		StreamTest stest = new StreamTest();
//		stest.groupingByMultipleFieldsExample();
//		stest.listAndMapObjectValue();
//		stest.listFilter();
		stest.listToString();

//		 vpaStringList =  upiQrList.stream().map(x-> "'" + x.getVpa()+ "'").collect(Collectors.toList());
//		Set<String> listRRN = txnIdListByDate.stream().map(x -> x.getUdf7()).collect(Collectors.toSet());
//		Set<String> listVpa = txnIdListByDate.stream().map(x -> x.getUdf9()).collect(Collectors.toSet());
//		Set<String> listUnique = txnIdListByDate.stream().map(x -> x.getUdf7() + x.getUdf9())
//				.collect(Collectors.toSet());
//		processorSettlementDataMap = txnIdListByDate.stream().collect(Collectors.toMap(x -> x.getUdf7() + x.getUdf9(),
//				x -> new FileRowProcessorSettlementData(x.getAmt().toString(), todayDate)));
//		Map<Long, TransactionLog> duplicateTxnMap = dulicateTxnLog.stream().collect(Collectors.toMap(x->x.getTransactionId(), x->x));

//		 List<String> of string to List<Long>
//		List<Long> longList = txnIdList.stream().map(Long::valueOf).collect(Collectors.toList());

//		to array
//		Long[] ids = longList.stream().toArray(Long[]::new);

//		List<object> to map
//		merchantMap = findAllMerchant.stream().collect(Collectors.toMap(Merchant::getMid, Function.identity()));

//		String dynamicQrTxnIdString = model.getDynamicQrTxnIdRrnMap().keySet().stream().map(e -> String.valueOf(e)).collect(Collectors.joining(","));
//		deactivateTxnList.stream().map(e -> e.getTransactionId()).forEach(x -> releaseTxnIdList.add(x));;

		
//		deactivateTxnList.stream().map(e -> e.getTransactionId()).forEach(x -> releaseTxnIdList.add(x));
		
	}
	
	public void forEachTest() {
		Map<String , String> map = new HashMap<>();
		Set<String> keySet = map.keySet();
		System.out.println(keySet.size());
		StringBuffer txnIdStringBuffer = null;
		
		Set<String> virtualVpaSet = new HashSet<>();
		Map<String, String> ezpayIdVpaMap = new HashMap<>();
		
		ezpayIdVpaMap.put("1", "gvi.");
		ezpayIdVpaMap.put("2", "GETgvi");
		ezpayIdVpaMap.put("3", "ram");
		
		System.out.println(ezpayIdVpaMap);
		
		ezpayIdVpaMap.entrySet().stream().filter(x -> x.getValue().contains("gvi.") 
				|| x.getValue().contains("GETgvi"))
				.forEach(x -> virtualVpaSet.add(x.getValue()));
		
		System.out.println(virtualVpaSet);
	}
	
	public void mapToSetWithFilter() {
		Set<String> virtualVpaSet = new HashSet<>();
		virtualVpaSet.add("hello.gvi");
		System.out.println(virtualVpaSet);
		Map<String, String> ezpayIdVpaMap = new HashMap<>();
		ezpayIdVpaMap.put("1", "gvi.1");
		ezpayIdVpaMap.put("2", null);
		ezpayIdVpaMap.put("3", "notandy");
		
//		ezpayIdVpaMap.entrySet().stream().filter(x-> x.getValue().contains(Utils.VIRTUAL_VPA_HANDLER)).forEach(x-> virtualVpaSet.add(x.getValue()));
		Set<String> collect = ezpayIdVpaMap.entrySet().stream().filter(x-> x.getValue() != null && x.getValue().contains("gvi."))
				.map(x->x.getValue()).collect(Collectors.toSet());
		
		virtualVpaSet.addAll(collect);
		System.out.println(virtualVpaSet);
	}
	
	public void MapValueToSetCollectByForEach() {
		Map<String,String> ezpayIdVpaMap = new HashMap<>();
		ezpayIdVpaMap.put("1", "hello1");
		ezpayIdVpaMap.put("2", "gvi.");
		ezpayIdVpaMap.put("3", "gvi.");
		
		List<String> list = new ArrayList<>();
		list.add("gvi.");
		list.add("gvi.1");
		System.out.println(list);
		Set<String> virtualVpaSet = new HashSet<>();
		list.stream().map(x -> virtualVpaSet.add(x));
//		list.stream().map(String -> virtualVpaSet.add(String));
		 
		 list.stream().filter(x -> x.contains("gvi.")).map(x -> String.valueOf(x)).forEach(x -> virtualVpaSet.add(x));
		 System.out.println(virtualVpaSet);
	}
	
	public void splitStreamTest() {
		String midsString = "22556|2269";
		String[] midArray = midsString.split("\\|");
		List<Long> midList = Arrays.stream(midArray).map(x -> Long.valueOf(x)).collect(Collectors.toList());
		System.out.println(midList);
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
		String s = list.stream().map(e -> "'" + e + 1 + "'").collect(Collectors.joining(","));
		List<Integer> s2 = list.stream().map(e -> e + 1).collect(Collectors.toList());
		System.out.println(s);
		System.out.println(s2);
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