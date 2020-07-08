import java.util.Arrays;
import java.util.List;

public class Recursive_Staircase {

    public static void main(String[] args) {
        Integer[] x = new Integer[] { 1, 2 };
        List<Integer> list = Arrays.asList(x);
        int n = 7;
        System.out.println(countWays(n,list));
    }

    public static int countWays(int n, List<Integer> x) {
        if(n == 0)
            return 1;
        int total = 0;
        for(Integer possibleStep : x) {
            if(n - possibleStep >= 0) {
                total += countWays(n- possibleStep, x);
            }
        }
        return total;
    }

}
