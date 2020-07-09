import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateArray {

    public static void main(String[] args){
        removeDuplicate(Arrays.asList(new Integer[]{3, 1, 1, 6, 7}));
    }

    public static List removeDuplicate(List<Integer> list){
        List<Integer> newList = new ArrayList<Integer>(list);
        for(int i = 0; i < list.size(); i++){
            for(int j = i+1; j < list.size(); j++){
                if(list.get(i) == list.get(j)){
                    newList.remove(j);
                }
            }
        }
        System.out.println(newList);
        return newList;
    }
}
