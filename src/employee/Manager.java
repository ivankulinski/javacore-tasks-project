package employee;

public class Manager extends Employee{

    public Manager(int hours) {
        super(hours);
    }

    public double getSalary(){
        return super.getSalary() * 1.5;
    }
}
