package Learn;

// Program to calculate prime numbers between an interval

import java.util.ArrayList;

public class Prime {
    ArrayList<Integer> primes = new ArrayList<Integer>();

    public Prime(int from, int to){
        for (int i = from; i <= to; i++){
            if(isPrime(i)){
                primes.add(i);
            }
        }
    }

    public boolean isPrime(int num){
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> getPrimes() {
        return primes;
    }

    public static void main(String[] args) {
        Prime list = new Prime(20,50);
        System.out.println(list.getPrimes());
    }
}
