public class Palindrome {

    public static void main (String[] args){
        String str = ("caBobac");
        System.out.println(stringPalindrome(str));
    }

    public static Boolean stringPalindrome(String str){

        for(int i=0; i<str.length();i++){
            int r = str.length()-i-1;
            System.out.println(i + "->" + r);
            if(!String.valueOf(str.charAt(i)).toLowerCase().equals(String.valueOf(str.charAt(r)).toLowerCase())){
                return false;
            }
        }
        return true;
    }
}
