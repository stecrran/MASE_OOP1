package immutability;

import java.util.ArrayList;

public class Department {
	
	private String name;
	private String address;
	private int numEmployees;
	private ArrayList<String> employees;
	
	private Department(String name, String address, int numEmployees, ArrayList<String> employees) {
		this.name = name;
		this.address = address;
		this.numEmployees = numEmployees;
		this.employees = employees;
	}
	
	public static Department createNewInstance(String name, String address, int numEmployees, ArrayList<String> employees) {
		return new Department(name, address, numEmployees, employees);
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getNumEmployees() {
		return numEmployees;
	}

	public ArrayList<String> getEmployees() {
		return new ArrayList<String>(employees);
	}
	
	public String toString() {
		return "Department - Name: " + getName() + ", Address: " + getAddress() + ", Number of employees: " + getNumEmployees() 
		+ ", Employees: " + getEmployees();
	}

	
	
	
	

}
