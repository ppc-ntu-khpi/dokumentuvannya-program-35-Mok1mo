package domain;
public class Manager extends Employee {
    /**
     * Initialize Manager
     * @param employees Employees of Manager
     * @param name Name of Manager
     * @param jobTitle Job of Manager
     * @param level Level of Manager
     * @param dept dept of Manager
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Get info about Employee
     * @return
     */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }

    /**
     * Assign ID to Manager
     * @param employees Employees of Manager
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }

    /**
     * Assign ID to Manager
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;

    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    /**
     * Return list of Employees
     * @return Employees
     */
    public Employee[] getEmployeesList() {
        return employees;
    }

    
}
