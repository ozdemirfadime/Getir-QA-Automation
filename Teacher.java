package Week3;

import java.util.Scanner;

public class Teacher extends Person {

    int courseCount;

    public static void main(String args[])
    {
        Teacher teacher = new Teacher();
        teacher.defaultVariables();
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many courses do you currently have?");
        teacher.courseCount = scanner.nextInt();
        scanner.close();

        if(teacher.courseCount >= 3)
        {
            System.out.println("Teacher cannot take any more courses");
        }

        else {
            System.out.println("The course is yours to teach");
        }

    }
}
