package prac2;

public class Employee extends Person {
    private String department;
    private String designation;

    public Employee(String name, String address, int age, String department, String designation) {
        super(name, address, age);
        this.department = department;
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
