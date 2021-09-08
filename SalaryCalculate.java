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
        System.out.println("Enter the hour working on weekdays");
        System.out.println("Enter the hour working on  weekends ");
        double baseSalary= scanner.nextDouble();
        double weekendsHours   =  scanner.nextDouble();
        double weekdaysHours   =  scanner.nextDouble();
        double weekPerHours= weekdaysHours+weekendsHours;
        double amountPerHour= baseSalary/40;
        double promotedSalary = 0;
        double amountWeekend;
        double amountWeekday;
        scanner.close();

        if (1000 > baseSalary) {
            System.out.println("Base salary must be at least 1000£");
        }
        if(weekPerHours>40){
            amountWeekend = amountPerHour*2*weekendsHours;
            amountWeekday = amountPerHour*1.5*weekdaysHours;
            promotedSalary= baseSalary+amountWeekend+amountWeekday;
        }
        else if (weekPerHours<40){
            amountWeekend = amountPerHour*weekendsHours;
            amountWeekday = amountPerHour*weekdaysHours;
            promotedSalary = baseSalary-(amountWeekend+amountWeekday);
        }
        else if((weekPerHours>40)&&(weekendsHours>=10)){
            amountWeekend = amountPerHour*2*weekendsHours;
            amountWeekday = amountPerHour*1.5*weekdaysHours;
            promotedSalary=baseSalary+(amountWeekend+amountWeekday)+500;
        }
        else{
            promotedSalary=baseSalary;
        }
        System.out.println("Promoted salary "+ promotedSalary);





    }
}