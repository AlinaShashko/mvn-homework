package by.academy.obj;

import java.util.Arrays;

public class Worker {


    private String name;
    private String surname;
    private int[] salary;


    public Worker(String name, String surname, int[] salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;

    }

    public int[] getSalary() {
        return salary;
    }

    public void setSalary(int[] salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Worker: " + name + " " + surname + " salary: " + Arrays.toString( salary ) + " .";
    }

}
