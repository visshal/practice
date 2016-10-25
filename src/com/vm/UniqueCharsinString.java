package com.vm;

/**
 * Created by vgmehta on 10/24/16.
 */
public class UniqueCharsinString {
    public static boolean uniqCharsinStringLogOn(String s) {
        boolean [] charPresent = new boolean[256];
        for(int i=0;i<s.length();i++) {
            int ch = s.charAt(i);
            if(charPresent[ch])
                return false;
            charPresent[ch] = true;
        }
        return true;
    }

    public static boolean uniqCharsinStringLogOnsquqre(String s) {
        boolean [] charPresent = new boolean[256];
        for(int i=0;i<s.length();i++) {
        }
        return true;
    }

    public static void main(String [] args) {
        System.out.println(" Vishal " + uniqCharsinStringLogOn("vishal"));
    }
}
