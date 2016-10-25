package com.vm;

/**
 * Created by vgmehta on 10/24/16.
 */
public class TwoDimensionMatrixinSingleLoop {
    public static void printMatrix() {
        int n = 5;
        System.out.println();
        for (int i=0; i<n*n ;i++) {
            System.out.print( (i/n) + "" + (i%n) + " " );
            if ((i+1)%n == 0 )
                System.out.println("\n");
        }
    }

    public static void main(String[] args) {
       printMatrix();
    }
}
