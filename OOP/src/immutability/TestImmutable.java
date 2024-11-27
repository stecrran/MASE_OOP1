package immutability;

import java.util.ArrayList;

public class TestImmutable {

	public static void main(String[] args) {
		ArrayList<String> employees = new ArrayList<>();
		employees.add("Ann");
		employees.add("Liam");
		
		Department dept = Department.createNewInstance("Argos", "Athlone", 2, employees);
		System.out.println("Created: " + dept);
		
		String name = dept.getName();
		String address = dept.getAddress();
		int numEmployees = dept.getNumEmployees();
		employees = dept.getEmployees();
		
		name = "Boots";
		address = "Galway";
		numEmployees = 3;
		employees.add("Tom");
		
		System.out.println("Created: " + dept);
		System.out.println("New: " + "Name: " + name + ", Address: " + address + ", Number of employess: " + numEmployees + ", Employees: " + employees);

	}

}
