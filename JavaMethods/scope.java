public class scope{
    public static void main(String[] args) {

        // Method Scope
        // Variables declared directly inside a method are available anywhere in the method following the line of code in which they were declared
        // Code here CANNOT use x
    
        int x = 100;
    
        // Code here can use x
        System.out.println(x);

        //Block Scope
    }

    public static void main(String[] args) {

        // Code here CANNOT use x
    
        { // This is a block
    
          // Code here CANNOT use x
    
          int x = 100;
    
          // Code here CAN use x
          System.out.println(x);
    
        } // The block ends here
    
      // Code here CANNOT use x
    
    }

}