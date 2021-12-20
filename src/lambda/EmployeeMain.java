package src.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(new Employee(1, "Ram", "Das"),
				new Employee(2, "Sham", "Kumar"),
				new Employee(3, "Sita", "Biswas"));
		
		//Collections.sort(empList, (e1,e2) -> e1.lastName.compareTo(e2.lastName));
		
		empList.sort((e1,e2) -> e1.lastName.compareTo(e2.lastName));
		
		empList.forEach(e -> System.out.println(e));
	}

}
