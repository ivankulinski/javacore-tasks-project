package Employee;

public class Employee {

    private double tarifPerHour = 5.5;
    public int hours;

    public Employee(int hours) {
        if (hours < 0){
            this.hours = 0;
        }
        else {
            this.hours = hours;
        }
    }

    public double getTarifPerHour() {
        return tarifPerHour;
    }

    public double getSalary(){
        return getTarifPerHour() * hours;
    }
}
