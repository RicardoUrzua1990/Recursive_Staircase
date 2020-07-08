public class RomanNum {

    public static void main(String[] args){
        String result = executeChange(100);
        System.out.println(result);
    }

    public static String executeChange(int n) {

        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] hundred = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] thousand = {"", "M", "MM", "MMM"};
        return thousand[n / 1000] + hundred[(n % 1000) / 100] + tens[(n % 100) / 10] + units[n % 10];
    }
}
