/**
 * Created by zzzxxx on 13.06.2017.
 */

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        double[] array = new double[10];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        array[6] = 7;
        array[7] = 8;
        array[8] = 9;
        array[9] = 10;
        int count = 0;
        for (int b = 0; b < array.length; b++) {
            double a = array[b];
            System.out.print(array[b] +" ");
        }

          for (int i = 0; i < array.length; i++){
              if (array[i] <= 1)
                  continue;
              else if (array[i] == 2 | array[i] == 3 | array[i] == 5) {
                  System.out.print(i + " ");
                  count += 1;
              } else if (array[i] % 2 != 0 & array[i] % 3 != 0 & array[i] % 5 != 0) {
                  System.out.print(i + " ");
                  count += 1;

          }
        if (count == 0)
            System.out.println("Простых чисел нет");
    }}}