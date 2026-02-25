//Lets solve Q & A from what we are studied
//1.Get input for variable:Name and Age. print it
//Sample Input                  Sample Output
//John                          My name is John
//24                            My age is 24
//code

import java.util.Scanner;
class qa1userinput{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in); 
        String name = scan.nextLine();
        int age = scan.nextInt();
        System.out.println("My name is "+name);
        System.out.print("My age is "+age);
    }
}
