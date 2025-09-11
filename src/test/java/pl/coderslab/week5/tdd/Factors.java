package pl.coderslab.week5.tdd;


import java.util.ArrayList;
import java.util.List;

public class Factors {

    static List<Integer> generatePrimeFactors(int n){
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        return factors;
    }
}
