package lintcode;

import java.util.ArrayList;
import java.util.Arrays;

public class test {
    static public void main(String argv[]) {

        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
            	System.out.print(j % 3 + (i/3) * 3);
            	System.out.print(", ");
            	System.out.println( ((j / 3 + j)%3) + (i%3) * 3);
            }
        }

    }
}