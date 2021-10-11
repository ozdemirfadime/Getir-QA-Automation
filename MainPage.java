package Week3;

import java.util.Scanner;

public class MainPage {
    public static void main(String[] args) {
        Student student =  new Student();
        Course course = new Course();
        Teacher teacher = new Teacher();

        System.out.println("Please choose system for student press S for Teacher pres T");
        Scanner scanner = new Scanner(System.in);
        String systems = scanner.next();
        if (systems.equals("S"))
        {
            Student student1 = new Student();
            student1.setName("Nazlı");
            student1.setSurname("Tek");
            student1.setYear(4);
            student.setAge(24);

        }
        else if (systems.equals("T"))
        {
            Teacher teacher1 = new Teacher();
            teacher1.setName("Aslı");
            teacher1.setSurname("Kara");

        }
        else{
            System.out.println("Enter System type as Teacher or Student");

        }






    }
}
