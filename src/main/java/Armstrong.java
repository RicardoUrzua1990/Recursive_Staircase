public class Armstrong {

    public static void main (String[] args){
        Integer value = (153);
        System.out.println(stringArmstrong(value));
    }

    public static Boolean stringArmstrong(Integer value){
        int unit = 0, sum = 0, aux = value;
        while (aux>0){
            unit = aux % 10;
            aux = aux / 10;
            sum = sum + (unit*unit*unit);
        }
        //sum = sum + (aux*aux*aux);
        if(sum == value){
            return true;
        }
        return false;
    }
}
