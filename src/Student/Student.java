package Student;

public class Student {
    private String name;
    private int age;

    public void setData(String name, int age){
        if (name.isEmpty()){
            System.out.println("Please, provide the name.");
            this.name = "NO NAME";
        }
        else{
            this.name = name;
        }

        if (age <= 0){
            System.out.println("Age cannot be 0 or negative. Age 20 will be used");
            this.age = 20;
        }
        else {
            this.age = age;
        }
    }

    public int getAge(){
        return this.age;
    }

    public static double averageAge(int... ages){
        int sum = 0;
        for (int i = 0; i < ages.length; i++) {
            sum += ages[i];
        }
        return sum / ages.length;
    }
}
