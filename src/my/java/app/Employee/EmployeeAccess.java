package my.java.app.Employee;

public class EmployeeAccess {

	private static String employeeName = "Maaz";
	private static String employeeId ="ID01";
	private static String employeeSalary ="7000";
	public static void main(String[] args)
	{
		EmployeeDetails employeeDetails = new EmployeeDetails();
		employeeDetails.setEmployeeName(employeeName);
		employeeDetails.setEmployeeId(employeeId);
		employeeDetails.setSalary(employeeSalary);
		
		employeeDetails.printEmployee();
		
	}
}
