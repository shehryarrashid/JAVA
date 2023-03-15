package week10;

public class act2 {
    public static void main(String[] args) {
        System.out.println(isprime(9));
        System.out.println(factorial(4));
        pattern('*');
    }

    public static boolean isprime(int num){
        for(int i = 2; i < num; i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static long factorial(int num){
        long fact = 1;
        for(int i = num; i > 0;i--){
            fact *= i;
        }
        return fact;
    }
    public static void pattern(char c){
        for(int i = 1; i < 7; i++){
            for(int k = 0; k < i; k++){
                System.out.print(c);
            }
            System.out.println();
        }
    }

}
