package lab07_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeController {
    public static void main(String[] args) {
       int totalSalary=0;
        FullTimeEmployee fultimeEployeeA= new FullTimeEmployee();
        FullTimeEmployee fultimeEployeeB= new FullTimeEmployee();
        FullTimeEmployee fultimeEployeeC= new FullTimeEmployee();
        ContractEmployee contractEmployeeA= new ContractEmployee();
        ContractEmployee contractEmployeeB= new ContractEmployee();
        List<Employee> listEmployee= Arrays.asList(fultimeEployeeA,fultimeEployeeB,fultimeEployeeC,contractEmployeeB,contractEmployeeA);
        for(Employee emp:listEmployee){
           totalSalary=totalSalary+emp.getSalary();
        }
        System.out.println(totalSalary);
    }
}
