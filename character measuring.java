/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		String str = "ysh";
				String stUpper = str.toUpperCase();

		String stLower = str.toLowerCase();
		String stFirst = str.substring(0,1).toUpperCase()+str.substring(1,str.length()).toLowerCase();


	if(str == stLower ){
	    System.out.print("true");
	   // return true;
	}else if(str ==stUpper){
	   System.out.print("true");
	} else if(str.equals(stFirst) ){
	   System.out.print("true");
	}else{
	    System.out.print("false");
	}


	}
}
