import java.util.List;

public class Fibonacci {

    public static void main(String[] args){
        int n = 10;
        String result = executeByIteration(3);
        System.out.println(result);
    }

    public static String executeByIteration(int n) {
        StringBuffer sb = new StringBuffer();
        int prev = 0, next = 1, sum = 0;
        for(int i=0;i<n;i++){
            if(i==1){
                sum = 1;
            }else
                sum = next + prev;
            sb.append(sum + " ");
            prev = next;
            next = sum;
        }
        String result = sb.toString();
        return result.substring(0,result.length() - 1);
    }

    public static Integer[] executeByRecursion(int n, Integer[] array) {
        if (array == null) {
            array = new Integer[n];
        }
        if(n == 1) {
            array[0] = 1;
        } else if(n == 2) {
            array[0] = 1;
            array[1] = 1;
        } else if(n>=3){
            array = executeByRecursion(n - 1, array);
            array[n-1] = array[n-2]+array[n-3];

        }
        return array;
    }
}
