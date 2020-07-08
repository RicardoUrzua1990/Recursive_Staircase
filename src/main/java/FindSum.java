import javafx.util.Pair;

import java.util.Arrays;
import java.util.List;

public class FindSum {

    public static void main(String[] args) {
        Integer[] numbers = new Integer[] { 11, 2, 15, 7};
        List<Integer> numbersList = Arrays.asList(numbers);
        int n = 26;
        System.out.println(findSum(n,numbersList));
    }

    public static Pair<Integer, Integer> findSum(int n, List<Integer> x) {
        for(int i=0 ; i < x.size() ; i++){
            for(int j=i+1 ; j < x.size() ; j++){
                if(x.get(i)+x.get(j) == n){
                    return new Pair<Integer, Integer>(i, j);
                }
            }
        }
        return null;
    }
}
