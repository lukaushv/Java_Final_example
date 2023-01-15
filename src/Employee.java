public class Employee {
    private String firstname;
    private String lastname;
    private int salary;
    private String department;
    private String position;

    Employee(String firstname,String lastname, String department, String position, int salary) throws EmployeeException {
        this.firstname=firstname;
        this.lastname=lastname;
        this.department=department;
        this.salary=salary;
        this.position=position;
        if (salary < 0) {
            throw new EmployeeException("Salary must be above zero");
        }
    }

    public boolean equal(){
        return firstname.equals(lastname);
    }

    public void salaryGetter(){

    }
}
