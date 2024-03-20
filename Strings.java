/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    public static int Fibo(int n){
        if(n ==0 || n==1){
            return n;
        }
        return Fibo(n-1) + Fibo(n-2);
        
    }
    public static String Rev(String str){
        if(str.length() == 0){
            return " ";
        }
        //System.out.print();
        return Rev(str.substring(1)) + str.charAt(0);
        
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int count =0;
		for(int i =1;i<=10;i++){
		    count ++;
		    if(i%2 ==0){
		        System.out.print(i+ " ");
		    }
		}
		System.out.println();
		System.out.println(count);
		int fact =1;
		
		for(int i =1;i<=5;i++){
		    fact =fact*i;
		}
		System.out.println(fact);
		System.out.print(Fibo(6));
		System.out.println(Rev("yash"));
		
		
	
		
	}
}
