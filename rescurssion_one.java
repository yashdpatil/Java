// Why Recurssion :
// logic building
// keep faith

import java.util.*;

public class rescurssion_one {
    static void print(int n) {

        if (n == 1) {
            System.out.println(1);
            return;
        } // Halting Condition , Base Case , Smalller SubPRoblem.
        print(n - 1);// Smaller Problem
        System.out.println(n);// Self Work

    }

    static void Reprint(int n) {

        if (n == 1) {
            System.out.println(1);
            return;
        } // Halting Condition , Base Case , Smalller SubPRoblem.
        System.out.println(n);// Self Work
        Reprint(n - 1);// Smaller Problem

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // print(n);
        Reprint(n);
    }

}

// // // A function Calling Itself with halting Condin
// // to Solve subproblem

// // *********Recurssion Spell*************//
// //
// Identify the Smalller PRoblem : Let Recurssion Solve it
// Self Work : Do your Work
// Base Case : Smallest PRoblem For which the answer is obvious
// //

// ***** Recursive Function**********
// Method_name (N para){
// if(haltcond){
// return resul;
// }
// return Method_name(n para)
// }

// *************** Print all natural no n to 1 ***************8
