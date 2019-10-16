package common;

public class Utils {
    public static double averageInts(int... ints){
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }
        return sum / ints.length;
    }
}
