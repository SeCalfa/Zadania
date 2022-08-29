package Zadanie2;

import java.util.ArrayList;

public class Zadanie2 {

    public static void main(String[] args){
        System.out.println(findNPerfectNumbers(4));
    }

    public static ArrayList<Integer> findNPerfectNumbers(int n) {
        ArrayList<Integer> perfectNumbers = new ArrayList<>();
        int currentNumber = 1;
        int sum = 0;

        while (perfectNumbers.size() < n){
            for (int number = 1; number < currentNumber; number++){
                if(currentNumber % number == 0)
                    sum += number;
            }

            if(sum == currentNumber){
                perfectNumbers.add(currentNumber);
            }

            sum = 0;
            currentNumber += 1;
        }

        return perfectNumbers;
    }

}
