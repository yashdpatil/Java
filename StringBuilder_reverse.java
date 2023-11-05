import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Hello World");
		
		String s = sc.next();
		StringBuilder st = new StringBuilder(s);
		StringBuilder p =new StringBuilder(s).reverse();
		if(st.toString().equals(p.toString())){
		    System.out.println("Pallindrome");
		    
		}else{
		    System.out.println("Not a palindrome");
		}
	}
}
