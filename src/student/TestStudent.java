package student;

import common.Utils;

import static common.Utils.*;

public class TestStudent {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        st1.setData(null, 20);
        st2.setData("Ghena", 30);

        System.out.println(averageInts(st1.getAge(), st2.getAge()));
    }
}
