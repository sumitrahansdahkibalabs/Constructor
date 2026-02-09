public class Employee {
    String empName;
    int empID;
    String empDepartment;

    public Employee(String name, int id, String  department) {
        empName = name;
        empID = id;
        empDepartment = department;
    }
    public void displayDetails() {
        System.out.println("Employee Name: " +empName);
        System.out.println("Employee ID: " +empID);
        System.out.println("Department: " +empDepartment);
    }
}
