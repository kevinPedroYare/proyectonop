public class Methods{

    /*
        public class Main {
            static void myMethod() {
                // code to be executed
            }
        }
        
        myMethod() is the name of the method
        static means that the method belongs to the Main class and not an object of the Main class. You will learn more about objects and how to access methods through objects later in this tutorial.
        void means that this method does not have a return value. You will learn more about return values later in this chapter

    */
    static void myMethod() {
        System.out.println("I just got executed!");
    }
    public static void main(String[] args){
        

        // Call a Method
        //myMethod();
        
        myMethod();
        myMethod();
        myMethod();

        // I just got executed!
        // I just got executed!
        // I just got executed!

    }
}