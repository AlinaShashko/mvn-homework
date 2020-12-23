package by.academy.Calc;


import by.academy.obj.Worker;

public class CalcSalary {
    Worker worker;
    int one = 1;
    double average = 0;

    public void sumSalary(int[] salary) {

        if (salary.length > 0) {
            double sum = 0;
            int sumMonth = 0;
            for (int i = 0; i < salary.length; i++) {
                sumMonth = i + one;
                sum += salary[i];
            }
            average = (sum / salary.length);
            System.out.println( "Total payment for " + sumMonth + " months = " + sum + " ." );
            System.out.println( "And average monthly salary = " + average );
        }
    }
}