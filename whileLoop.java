public class whileLoop{
    public static void main(String[] args){
        //Java While Loop
        /*esto es un while loop
        Syntax
        while (condition) {
            // code block to be executed
        }
        */
        int i = 0;
        while (i < 5) {
          System.out.println(i);
          i++;
        }
        // Outputs "0 1 2 3 4"
        //The Do/While Loop
        /*esto es un do/while loop
        Syntax
        do {
            // code block to be executed
        }
        while (condition);
        */
        int i = 0;
        do {
          System.out.println(i);
          i++;
        }
        while (i < 5);
        // Outputs "0 1 2 3 4"
    }
}