package my.java.app.Employee;

public class EmployeeDetails {
	private String EmployeeName;
	private String EmployeeId;
	private String Salary;

	public void printEmployee() {
		System.out.println("Employee Name: " + getEmployeeName());
		System.out.println("Employee ID: " + getEmployeeId());
		System.out.println("Employee Salary: " + getSalary());
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public String getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(String employeeId) {
		EmployeeId = employeeId;
	}

	public String getSalary() {
		return Salary;
	}

	public void setSalary(String salary) {
		Salary = salary;
	}
}
