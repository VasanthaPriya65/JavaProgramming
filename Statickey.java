public class Statickey{
    static int accountbalance=0;
    String depositedby;
    static String name="Java";
    
    public  static void printname()
    {
    
        System.out.println(name);
    }
    
    //static block execute before main method
    //execute while class loaded in a memory
    //execute in a written order
    //used to intialize value for variables
    static{
        System.out.println("block1");
        
    }
    
     static{
        System.out.println("block2");
        
    }
    
    public static void main(String[] args) {
   //using static keyword ,we can call a method without creating object    
   printname();
    //static variable shared among all objects in a class,static variable created only once in a class and shared among them

    accountbalance=1000;
    accountbalance=2000;
    System.out.println(accountbalance);
}}