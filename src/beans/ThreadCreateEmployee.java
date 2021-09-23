package beans;

public class ThreadCreateEmployee implements Runnable {

    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    @Override
    public void run() {
        employee = new Employee();
        System.out.println(employee);
    }
}
