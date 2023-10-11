class A implements Cloneable{
    int a =20;
    int b =30;
    int c= 30;
    public A clone(){
        try{
        A aaa = (A)super.clone();
        return aaa;
        }catch(Exception e){
            throw new InternalError(e);
        }
        
    }
    
}
public class Main{
    public static void main(String[] args){
        A aa = new A();
        // Shallow Copy
        A b =aa; 
        // Deep Copy
        A b = aa.clone();
        
        System.out.println(aa==b);
    }
}
