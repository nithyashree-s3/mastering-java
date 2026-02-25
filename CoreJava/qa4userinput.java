//get Input for 3 variables:Name, Score, department.Let the user enter the score for 100 Marks,you convert it for 10 and print it
//Sample Input:           Sample Output:
//John                    My name is John
//56                      My score is 8.4/10
//Computer                My department is Computer

import java.util.Scanner;
class qa4userinput {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int score = scan.nextInt();
        scan.nextLine();
        String department = scan.nextLine();
        System.out.println("My name is" +name);
        System.out.println("My score is" +score);
        System.out.print("My department is" +department);
    }
}
