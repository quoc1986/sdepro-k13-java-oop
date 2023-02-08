package lesson_10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestSalary {
    public static void main(String[] args) {
        Employee teo=new Employee("Teo",10);
        teo.setAge(23);
        Employee ti=new Employee("Ti",7);
        ti.setAge(27);
        Employee tun=new Employee("Tun",14);
        tun.setAge(22);

        List<Employee> employeeList= Arrays.asList(teo,ti,tun);
        System.out.println("Before sorting");
        System.out.println(employeeList);

        System.out.println("After sorting");
        employeeList.sort(new EmployeeAgeComparator());
        System.out.println(employeeList);
    }
}
