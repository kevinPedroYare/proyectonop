public class Booleans{
    public static void main(String[] args){
        //Booleans
        /*
        YES / NO
        ON / OFF
        TRUE / FALSE
        */
        //Boolean Values
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   // Outputs false
        //Boolean Expression
        int x = 10;
        int y = 9;
        System.out.println(x > y); // returns true, because 10 is higher than 9

        int x = 10;
        System.out.println(x == 10); // returns true, because the value of x is equal to 10
        System.out.println(10 == 15); // returns false, because 10 is not equal to 15

        //Real Life Example
        int myAge = 25;
        int votingAge = 18;
        System.out.println(myAge >= votingAge);

        int myAge = 25;
        int votingAge = 18;
        
        if (myAge >= votingAge) {
          System.out.println("Old enough to vote!");
        } else {
          System.out.println("Not old enough to vote.");
        }
    }
}