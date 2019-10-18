package algorithms;

public class Person {
    public String name;
    public int age;
    public Utils.Gender gender;

    public Person(String name, int age, Utils.Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
