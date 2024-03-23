/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		String str = "cdac";
		String abc = str.replaceAll("[aeiou]","");
		for(int i =0;i<str.length();i++){
		  //  abc = str.replaceall('[aeiou]'," ");
		    if(str.charAt(i) == 'a' || str.charAt(i) == 'e' ||str.charAt(i) == 'i' ||  str.charAt(i) == 'o' || str.charAt(i) == 'u'){
		        continue;
		    }else{
		        System.out.print(str.charAt(i));
		    }
		}
		System.out.println();
		System.out.print(abc);
	}
}
