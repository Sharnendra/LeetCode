import java.util.function.Predicate;

public class ReverseOfAnyNumber {
    public static void main(String[] args) {
        System.out.println(reverse(1463847412));
    }

    public static int reverse(int x) {

        int rev=0;
        int counter = 0;
        if(x > 0){
            int init = String.valueOf(x).charAt(String.valueOf(x).length()-1) - '0';
            while(x > 0){
                rev= rev*10 + x%10;
                x= x/10;
                counter++;
            }
            int fin = String.valueOf(rev).charAt(0)- '0';

            return counter > 10 ? 0 : init == fin || init == 0 ? rev : 0;
        }
        else{
            while(x < 0){
                rev= rev*10 + x%10;
                x= x/10;
                counter++;
            }
            return counter > 10 ?  rev > 0 ? 0: 0: rev;
        }
    }
}
