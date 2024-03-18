/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
    	public static boolean isPalindrome(String s){
		    return s.equals(new StringBuilder(s).reverse().toString());
		}
		
		
	public static void main(String[] args) {
		System.out.println("Hello World");
		String str = "google";
			HashSet<String>set = new HashSet<String>();
		int Maxlength = 0;
		int Minlength = 1;
	
		for(int i =0;i<str.length();i++){
		    for(int j =i+1;j<str.length();j++){
		        if(isPalindrome(str.substring(i,j))){
		            set.add(str.substring(i,j));
		             Maxlength = Math.max(Maxlength,str.substring(i,j).length());
		          Minlength = Math.min(Minlength,str.substring(i,j).length());
		        }
		    }
		}
		System.out.println(set);
		System.out.println(Maxlength);
		System.out.print(Minlength);
	}
}
