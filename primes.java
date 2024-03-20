/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    
    public static boolean isPrime(int n){
        if(n == 0 || n==1) return false;
		    for(int i = 2;i<n;i++){
		        if(n%i == 0){
		            return false;
		        }
		        
		    }
		    return true;
		}
	public static void main(String[] args) {
		System.out.println("Hello World");
// 		int no =1;
            
            for(int i =1;i<=100;i++){
                if(isPrime(i)){
                    System.out.print(i+ " ");
                }
            }
		
	}
}
