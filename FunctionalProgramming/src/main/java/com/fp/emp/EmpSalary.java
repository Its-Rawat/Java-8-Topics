package com.fp.emp;

public class EmpSalary {
    public int salary;
    public String Name;

    // Constructor
    public EmpSalary(int salary , String Name){
        this.salary = salary;
        this.Name = Name;
    }

    // getter
    public int getSalary(){
        return salary;
    }

    public void getBonous(){
        double bonus = salary * 0.10; // 10% Bonous
        System.out.println(Name+" Bonus: "+bonus);
    }

}
