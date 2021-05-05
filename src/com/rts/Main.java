package com.rts;
//#1 Print the number of integers in an array that are above the given input and the number that are below,
// e.g. for the array [1, 5, 2, 1, 10] with input 6, print “above: 1, below: 4”.
//
//        #2 Rotate the characters in a string by a given input and have the overflow appear at the beginning,
//        e.g. “MyString” rotated by 2 is “ngMyStri”.
//
//        #3 If you could change 1 thing about your favorite framework/language/platform (pick one), what would it be?
//          Remove checked exception in Java.
//          Since checked exception as definition is an exception is expected to be happened and handle but no programmer
//          expect that to happen and is forced to handle that.
public class Main {
    public static void question1(int[] arr, int input){
        int above = 0;
        int below = 0;

        for (int num: arr) {
            if (num > input) {
                above++;
            }
            if (num < input) {
                below++;
            }
        }
        System.out.println("Above: " + above + ", below: " + below);
    }
    public static void question2(String s, int k) {
        if (k < 0) {
            k += s.length();
        }
        k = k % s.length();

        s = s.substring(s.length() - k) + s.substring(0,s.length() - k);
        System.out.println(s);
    }
    public static void main(String[] args) {
//        int[] arr = {1,5,2,1,10};
//        question1(arr,6);
        question2("MyString", 2);

    }
}
