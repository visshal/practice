package com.vm;

/**
 * Given two strings,write a method to decide if one is a permutation of the other.
 * If two given strings are anagram or not.
 * Created by vgmehta on 10/24/16.
 */
public class IdenticalChars {


    /**
     * Method:
     * String1 = s1
     * String2 = s2
     * Assumption: Given string is in ascii format.
     *  1. Create an array of 256 chars letters.
     *  2. For every char in s1, increment the index for letters. (Hence marking occurance of each char in string1)
     *  3. For every char in s2, get the char's ascii #, now decrement the value of letters array's index set by char's ascii #
     *  4. If that is less than 0 then return false.
     * @param s1
     * @param s2
     * @return
     */
    public static boolean identicalCharsInStrings(String s1, String s2) {
        int [] letters = new int[256];
        for(char ch: s1.toCharArray()) {
            letters[ch]++;
        }

        for(int i=0;i<s2.length();i++) {
            int c = s2.charAt(i);
            System.out.println(c+ ":" + letters[c]);
            // From letters array decrement the occurance of c by 1
            if(--letters[c] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String [] args) {
        System.out.println(identicalCharsInStrings("good","doog"));
        System.out.println(identicalCharsInStrings("god","bad"));
        System.out.println(identicalCharsInStrings("dog","god"));

    }
}

