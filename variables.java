public class variables {
    public static void main(String[] args) {
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

    }
}
