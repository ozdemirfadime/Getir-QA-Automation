package Week1;

import java.util.Scanner;
public class SalaryCalculate{
    public static void main(String[] args) {

        // Base salary must be at least 1000 euros.
        // The weekly working hour standard is 40 hours per week.
        // If the employee has worked less than 40 hours, her/his salary should be reduced proportionally
        // For every hour worked on weekdays over 40 hours, 1.5 times the hourly unit wage is paid.
        //For every hour worked on weekends over 40 hours, 2 times the hourly unit wage is paid
        // If the employee has worked at least 40 hours during the week and more than 10 hours on the weekend,
        // he or she will receive an additional bonus of $500.

        System.out.println("Enter the base salary ");
        Scanner scanner = new Scanner(System.in);
        double baseSalary= scanner.nextDouble();
        double promotedSalary = 0;
        scanner.close();

        if (1000 > baseSalary) {
            System.out.println("Base salary must be at least 1000£");
        }
        else {
            double amountPerHour= baseSalary/40;

            System.out.println("Enter the hour working on weekdays");
            double weekdaysHours   =  scanner.nextDouble();

            System.out.println("Enter the hour working on  weekends ");
            double weekendsHours   =  scanner.nextDouble();

            double totalWorkingHours = weekdaysHours+weekendsHours;

              if (totalWorkingHours <= 40) {
                promotedSalary = baseSalary - (40 - totalWorkingHours) * amountPerHour;
            }
              else{
                if (weekdaysHours<40) {
                    promotedSalary =  baseSalary - ((totalWorkingHours - 40) * amountPerHour * 2) ;
                }

                else{
                      if ( weekendsHours <10 ) {
                    promotedSalary =  baseSalary + ((weekdaysHours - 40) * amountPerHour * 1.5) +
                            (weekendsHours*amountPerHour * 2);
                      }
                      else
                      {
                    promotedSalary = baseSalary + ((weekdaysHours - 40) * amountPerHour * 1.5) +
                            (weekendsHours * amountPerHour * 2) + 500 ;
                          System.out.println("You earned bonus 500$ ");


                }
              }
            }
    }
        if(baseSalary != 0) {
            System.out.println("The  promoted salary is:" + promotedSalary);
        }
    }
}