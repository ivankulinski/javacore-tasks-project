package Student;

public class TestStudent {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        st1.setData("Anton", 20);
        st1.setData("Ghena", 30);
        System.out.println(Student.averageAge(st1.getAge(), st2.getAge()));
    }
}
