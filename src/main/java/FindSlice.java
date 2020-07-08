import javafx.util.Pair;

import java.util.Arrays;
import java.util.List;

public class FindSlice {

    public static void main (String[] args){
        findSlice(Arrays.asList(new Integer[]{0, 1, 0, 3, 1, 2, 5}));
    }

    public static Pair<Integer, Integer> findSlice(List<Integer> list) {
        Integer valueBefore = null, ini = 0;
        Pair<Integer,Integer> currentSlice = new Pair<Integer, Integer>(0, 0);
        Pair<Integer,Integer> maxSlice = currentSlice;
        for(int i=0; i < list.size(); i++){
            if(valueBefore == null || list.get(i) <= valueBefore){
                ini = i;
                if(maxSlice == null || (maxSlice.getValue() - maxSlice.getKey() < currentSlice.getValue() - currentSlice.getKey())){
                    maxSlice = currentSlice;
                }
                currentSlice = new Pair<Integer, Integer>(i,i);
            }else {
                currentSlice = new Pair<Integer, Integer>(ini,i);
            }
            valueBefore = list.get(i);
        }

        if(maxSlice.getValue() - maxSlice.getKey() < currentSlice.getValue() - currentSlice.getKey()){
            System.out.println(currentSlice);
            return currentSlice;
        }else
            System.out.println(maxSlice);
            return maxSlice;
    }
}
