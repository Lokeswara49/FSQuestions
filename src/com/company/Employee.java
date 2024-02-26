package com.company;

public class Employee {
    private int empId;
    private String empName;
    Employee(int empId,String empName){
        this.empId=empId;
        this.empName=empName;
    }

    public static void main(String[] args) {
//        Employee obj=new Employee();
//        obj.empId=10;



    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                '}';
    }
}
