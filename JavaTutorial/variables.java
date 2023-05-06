public class variables {
    public static void main(String[] args) {

        //VARIABLES


        /*String para cadena de palabras
        int para numeros enteros
        float para numeros decimales
        double para numeros decimales
        char para caracteres
        boolean para verdadero o falso
        */

        String name = "John";
        System.out.println(name);
        
        int myNum = 15;
        System.out.println(myNum);

        int myNum;
        myNum = 15;
        System.out.println(myNum);

        int myNum = 15;
        myNum = 20;  // myNum is now 20
        System.out.println(myNum);


        final int myNum = 15;
        myNum = 20;  // will generate an error: cannot assign a value to a final variable
        
        //Otros Tipos
        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        //PRINT VARIABLES
        String name = "John";
        System.out.println("Hello " + name);

        //concatenar cadenas
        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        //sumar en el print
        int x = 5;
        int y = 6;
        System.out.println(x + y); // Print the value of x + y
        

        //DECLARACION DE MULTIPLES VARIABLES
        int x = 5;
        int y = 6;
        int z = 50;
        System.out.println(x + y + z);

        
        int x = 5, y = 6, z = 50;
        System.out.println(x + y + z);

        int x, y, z;
        x = y = z = 50;
        System.out.println(x + y + z);

        //IDENTIFICADORES

        // Good
        int minutesPerHour = 60;

        // OK, but not so easy to understand what m actually is
        int m = 60;
    }
}
