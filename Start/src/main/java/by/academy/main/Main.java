package by.academy.main;

import by.academy.Calc.CalcSalary;
import by.academy.obj.Worker;

public class Main {

    public static void main(String[] args) {

        Worker worker1 = new Worker( "Sasha", "Ivanov", new int[]{1900, 2000, 2300} );
        System.out.println( worker1 );
        CalcSalary salaryWorker1 = new CalcSalary();
        salaryWorker1.sumSalary( worker1.getSalary() );
        Worker worker2 = new Worker( "Dima", "lama", new int[]{1900, 2000, 2300} );
        System.out.println( worker2 );
        CalcSalary salaryWorker2 = new CalcSalary();
        salaryWorker1.sumSalary( worker2.getSalary() );
        Worker worker3 = new Worker( "Vasya", "Stasya", new int[]{1200, 1000, 1300, 700, 2900, 10000} );
        System.out.println( worker3 );
        CalcSalary salaryWorker3 = new CalcSalary();
        salaryWorker1.sumSalary( worker3.getSalary() );
        Worker worker4 = new Worker( "lena", "Neproblema", new int[]{300, 250, 1200, 3650} );
        System.out.println( worker4 );
        CalcSalary salaryWorker4 = new CalcSalary();
        salaryWorker1.sumSalary( worker4.getSalary() );

    }


}
