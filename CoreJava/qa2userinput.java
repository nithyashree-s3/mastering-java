
//2.Get input for variable:Name and Age. print it
//Sample Input                  Sample Output
//John                          My name is John
//24                            My age is 24
//Chennai                       My address is Chennai

import java.util.Scanner;
class qa2userinput{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in); 
        String name = scan.nextLine();
        int age = scan.nextInt();
        scan.nextLine();
        String address = scan.nextLine();
        System.out.println("My name is "+name);
        System.out.print("My age is "+age);
        System.out.print("My address is "+address);
    }
}

