interface FuncInterface 
{  
    void abstractFun(int x); 
  
    
    default void normalFun() 
    { 
       System.out.println("Hello"); 
    } 
} 
  
class Test5
{ 
    public static void main(String args[]) 
    { 
        
        FuncInterface fobj = (int x)->System.out.println(2*x); 
  
        // This calls above lambda expression and prints 10. 
        fobj.abstractFun(5); 
    } 
} 