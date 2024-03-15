/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int k =3;
		int wsum = 0 ;
		int msum = Integer.MIN_VALUE;
		for(int i =0;i<k;i++){
		    wsum+=arr[i];
		}
		for(int i=k;i<arr.length;i++){
		    wsum = wsum - arr[i-k]+arr[i];
		    msum = Math.max(wsum,msum);
		    
		}
		System.out.print(msum);
	}
}
