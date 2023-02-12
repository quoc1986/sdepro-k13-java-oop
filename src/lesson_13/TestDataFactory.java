package lesson_13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestDataFactory {
    public static void main(String[] args) {
        String relativeFilePath="/src/lesson_13/Person.txt";
        String absolutePath=System.getProperty("user.dir").concat(relativeFilePath);
        List<Employee> employeeList=DataFactory.readFile(absolutePath);
        Collections.sort(employeeList);
        System.out.println(employeeList);

        Employee teo=new Employee("Teo", 18,19000);
        Employee ti=new Employee("Ti", 40,50000);
        Employee tun=new Employee("Tun", 38,69000);
        List<Employee> employeeList1= Arrays.asList(teo,ti,tun);
        String employeeDataFile=System.getProperty("user.dir").concat("/src/lesson_13/EmployeeDB.txt");
        DataFactory.saveEmployeeList(employeeList1,employeeDataFile);
    }
}
