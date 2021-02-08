// 13707293
// robertjohnhill1@gmail.com

import java.io.*;
import java.util.*;

public class Roman {

    public static final String convert(int number) {

        int[] numbers = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

        String[] romanChar = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        StringBuilder ret_string = new StringBuilder();

        for (int i = 0; i < numbers.length; i++) {

            while (number >= numbers[i]) {
                number -= numbers[i];
                ret_string.append(romanChar[i]);

            }
        }
        return ret_string.toString();
    }


    public static void main(String[] args) {
 
    }

}