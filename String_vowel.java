/*
Create a Java program that does the following: 
1. Accepts a sentence input from the user. 
2. Splits the sentence into words without using any collection data structures. 
3. Removes all vowels from each word. 
4. Reconstruct and print the sentence without vowels. 
*/

import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String Pattern = "[AEIOUaeiou]";
        String[] st = str.split("//s+");
        StringBuffer sb = new StringBuffer();
        for(String strr : st){
            String modstr = strr.replaceAll(Pattern,"");
            sb.append(modstr).append(" ");
            
        }
        System.out.println(sb.toString());
    }
}
