package com.example.demo.employee;


public class Employee {
    int employeeId;
    String name;
    int salary;

    public Employee(int employeeId, String name, int salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    Employee(String line){
        String[] split=line.split(" ");
        employeeId=Integer.parseInt(split[0]);
        name=split[1];
        salary=Integer.parseInt(split[2]);
    }
    Employee(){

    }



    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void print(){
        System.out.print(getEmployeeId()+" "+getName()+" "+getSalary());
    }
    public void println(){
        System.out.println(getEmployeeId()+" "+getName()+" "+getSalary());
    }

    public String printFile(){
        return (getEmployeeId()+" "+getName()+" "+getSalary());
    }

}
