public class SquareRoot {

    public static void main (String[] args){
        int num = (640000);
        System.out.println(squareRootInteger(num));
    }

    public static Integer squareRootInteger (Integer num){
        int i;
        for(i = 1; i < num ; i++){
            int x = (i*i);
            if(num == x){
                return i;
            }
        }
        return i;
    }
}
