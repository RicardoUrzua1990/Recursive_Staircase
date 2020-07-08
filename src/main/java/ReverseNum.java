public class ReverseNum {

    public static void main(String[] args){
        Integer result = executeReverse(12345);
        System.out.println(result);
    }

    public static Integer executeReverse(int n) {
        int unit = 0, aux = 0;
        while(n>=10){
            unit = n % 10;
            n = n / 10;
            if(aux < 10){
                aux = unit *10;
            }else
                aux = (aux + unit) *10;
        }
        return aux = aux + n;
    }
}