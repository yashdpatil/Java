/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int a =52;
		int b = 17;
		int count = 0;
		int c = a+b;
		while(c>b){
		    c=c-b;
		    count++;
		}
		System.out.print("count is : "+count);
	}
}
