package com.emp;

public class Employee {

	private int empId;

	private String empName;

	private String empDept;

	public Employee(String empName, String empDept) {

		if (empName != null && empDept != null) {
			this.empId = (int) Math.round(Math.random() * 100);
			this.empName = empName;
			this.empDept = empDept;
			empId++;
		} else {
			try {
				throw new InvalidInputException("Invalid Entry");
			} catch (InvalidInputException e) {
				// TODO Auto-generated catch block
				e.getMessage();
			}
		}

	}

	@Override
	public String toString() {
		return empId + ";" + empName;
	}

}
