package Employee;

public class UseEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee(10);
        System.out.println("Tarif per Hour: " + employee.getTarifPerHour());
        System.out.println("Salary is: " + employee.getSalary());

        System.out.println("Manager");
        Manager manager = new Manager(10);
        System.out.println(manager.getSalary());
    }
}
