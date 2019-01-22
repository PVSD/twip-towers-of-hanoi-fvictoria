package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {


        Scanner kbReader = new Scanner(System.in);
        System.out.println("So, you need help with Towers of Hanoi??");
        String response = kbReader.nextLine();
        System.out.println("Great!");
        System.out.println("How many disks do you have?");
        int disks = kbReader.nextInt();
        double moves = Math.pow(2,disks)-1;
        System.out.println("It should take you "+moves+" moves");
        System.out.println("Instructions:");
        Solution.game(disks,'A','C','B');




    }
}
