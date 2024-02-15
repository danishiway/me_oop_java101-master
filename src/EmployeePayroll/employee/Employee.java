package src.EmployeePayroll.employee;

public class Employee{
    private String firstName;
    private String lastName;
    private double salary;
  
    public Employee(String firstName, String lastName){
      this.firstName = firstName;
      this.lastName = lastName;
      System.out.println("Inside Employee Constructor");
    }

    public void calculateSalary(double salary){
      this.salary = salary;
    }
  
    public String fullName(){
      return this.firstName +" "+ this.lastName;
    }
  
    public double getSalary(){
      System.out.println("Inside Employee getSalary Method");
      return salary;
    }
  }

