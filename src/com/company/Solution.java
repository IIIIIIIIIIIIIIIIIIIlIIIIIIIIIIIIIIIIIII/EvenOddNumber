package com.company;
import java.util.Scanner;

/*
Чётные и нечётные циферки
*/

public class Solution {

    public static void main(String[] args) {
        
        System.out.println("Введите число:");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int event = 0;
        int odd = 0;

        int number_length = stringSize(number);

            for (int i = 0; i < number_length; i++) {
                    if ( (number % 10) % 2 == 0 )
                        event++;
                    else
                        odd++;
                    number /= 10;
            }
        System.out.println("Even: " + event + " Odd: " + odd);
        scanner.close();

    }

    final static int [] sizeTable = { 9, 99, 999, 9999, 99999, 999999, 9999999,
            99999999, 999999999, Integer.MAX_VALUE };

    // Requires positive x
    static int stringSize(int x) {
        for (int i=0; ; i++)
            if (x <= sizeTable[i])
                return i+1;
    }
}
