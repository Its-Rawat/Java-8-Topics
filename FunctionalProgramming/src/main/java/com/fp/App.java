package com.fp;

import com.fp.emp.EmpSalary;

import java.util.ArrayList;
import java.util.Objects;

public class App{
    public static void main(String[] args) {
        System.out.println("main Started");

        ArrayList<EmpSalary> empSalaries = new ArrayList<>();

        empSalaries.add(new EmpSalary(999,"Aditya"));
        empSalaries.add(new EmpSalary(9,"Aayush"));
        empSalaries.add(new EmpSalary(888,"Deew"));


        empSalaries.stream().parallel()
                .filter(e->e.getSalary() > 100)
                .forEach(EmpSalary :: getBonous);
    }
}