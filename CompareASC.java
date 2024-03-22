/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    static int compare (char ch1,char ch2){
        return Character.toLowerCase(ch1) - Character.toLowerCase(ch2);
    }
	public static void main(String[] args) {
        String str = "Yash";
        char ch[] = str.toCharArray();
        int n = str.length();
        for(int i = 0;i<n-1;i++){
            for(int j= 0;j<n-i-1;j++){
                if(compare(ch[j],ch[j+1])>0){
                    char temp  = ch[j];
                    ch[j] = ch[j+1];
                    ch[j+1] = temp;
                    
                }
            }
        }
        for(char c : ch){
            System.out.print(c);
        }

	}
}
