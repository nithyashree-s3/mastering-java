class ifelse {
    public static void main(String[] args) {
        //Scenario 1:its going 
        boolean rain = false;
        if(rain)
        {
            System.out.print("Take an Umbrella");
        }
        else{
            System.out.print("Enjoy the Sunlight");
        }
    }
}


//COMPARISON OPERATOR
//1)String Comparison
//Operator which is used to compare two values.  5>4  Here > is a xomparison operator here we are comparing two value.
//Example Question 1
//We have two numbers num1=40 num2=50 Check whether two number is equal or not
class ifelse { //to check copy this code seperately
    public static void main(String[] args) 
    {
        int num1 = 40;
        int num2 = 50;
        if(num1==num2)
        {
            System.out.print("Both the numbers are Equal");
        else{
            System.out.print("Not equal");
        }
    }
}    

//to get userinput for the same question
import java.util.Scanner;
class ifelse{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        if(num1==num2)
        {
            System.out.print("Both the numbers are Equal");
        else{
            System.out.print("Not equal");
        }
    }
}    
    
