package src.EmployeePayroll.employee;

public class HourlyEmployee extends Employee{
  
    private double workedHours;
    private double rate;
    
    public HourlyEmployee(String firstName, String lastName, double workedHours, double rate){
      super(firstName,lastName);
      this.rate = rate;
      this.workedHours = workedHours;
      super.calculateSalary(this.rate * this.workedHours);
      System.out.println("Inside HourlyEmployee Constructor");
    }
  
    public double getSalary(){
      System.out.println("Inside HourlyEmployee getSalary Method");
      return super.getSalary();
    }
  }

