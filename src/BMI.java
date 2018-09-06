import java.util.Scanner;

public class BMI {

    public static void main(String[] args){
        /* Bmi= kg/m*m
        inch = m* (1 inch/0.254 m)

         */


       Scanner keyboard;
       int inches;
       double meters;
       double height;
       int pounds;
       double kilograms;
       double weight;
       double bmi;



        keyboard = new Scanner(System.in);
        System.out.println("What is your height in inches?");
        inches = keyboard.nextInt();
        meters = .0254;
        height= (int)  inches *meters;
        System.out.println("What is your weight in pounds?");
        pounds = keyboard.nextInt();
        kilograms = (double) 0.453592;
        weight =  ((double) pounds*kilograms);
        System.out.println(weight+ "/" + height);
        bmi = weight/height;

        System.out.println("Your bmi is " + bmi +".");























    }
}
