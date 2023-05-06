public class DataTypes{
    public static void main(String[] args){

        //DATA TYPES

        /*
        byte 	1 byte      Stores whole numbers from -128 to 127
        short 	2 bytes 	Stores whole numbers from -32,768 to 32,767
        int 	4 bytes 	Stores whole numbers from -2,147,483,648 to 2,147,483,647
        long 	8 bytes 	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float 	4 bytes 	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        double 	8 bytes 	Stores fractional numbers. Sufficient for storing 15 decimal digits
        boolean 1 bit 	    Stores true or false values
        char 	2 bytes 	Stores a single character/letter or ASCII values 
        */

        int myNum = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;    // Floating point number
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String

        //NUMBERS

        byte myNum = 100;
        System.out.println(myNum);

        short myNum = 5000;
        System.out.println(myNum);

        int myNum = 100000;
        System.out.println(myNum);

        long myNum = 15000000000L;
        System.out.println(myNum);

        float myNum = 5.75f;
        System.out.println(myNum);

        double myNum = 19.99d;
        System.out.println(myNum);

        //BOOLEANS

        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   // Outputs false

        //CHARACTERS
        char myGrade = 'B';
        System.out.println(myGrade);
        
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);        

    }
}