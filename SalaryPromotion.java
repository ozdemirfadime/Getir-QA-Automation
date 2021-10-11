package Week2;

import java.util.Scanner;

public class SalaryPromotion {
    public void SalaryPromation (double salary) {
    int workYear = 0;

        System.out.println("Please enter the years you have been worked for this company");
        Scanner scanner = new Scanner(System.in);
        workYear = scanner.nextInt();
                if (workYear == 1) {
            salary = salary + salary * 5 / 100;
            System.out.println("Total raised salary is: " + salary);
        }
                else if (workYear == 2) {
            salary = salary + salary * 10 / 100;
            System.out.println("Total raised salary is: " + salary);
        }
                else if (workYear == 3) {
            salary = salary + salary * 15 / 100;
            System.out.println("Total raised salary is: " + salary);
        }
                else if (workYear == 4) {
            salary = salary + salary * 20 / 100;
            System.out.println("Total raised salary is: " + salary);
        }
                else if (workYear >= 5) {
            salary = salary + salary * 25 / 100;
            System.out.println("Total raised salary is: " + salary);
        }
                scanner.close();
    }
    }
