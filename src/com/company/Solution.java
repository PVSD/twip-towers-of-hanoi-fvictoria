package com.company;

public class Solution {

    public static void game(int n, char from, char to, char last) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + from + " to rod " + to);
            return;
        }
        game(n - 1, from, last, to);
        System.out.println("Move disk " + n + " from rod " + from + " to rod " + to);
        game(n - 1, last, to, from);
    }
}
