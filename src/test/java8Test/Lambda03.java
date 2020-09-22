package test.java8Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author sgc
 * @create 2020/9/7
 */
public class Lambda03 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(58,"C"));
        employees.add(new Employee(18,"A"));
        employees.add(new Employee(38,"G"));
        Collections.sort(employees,(e1,e2)->{
            if(e1.age!=e2.age){
                return -Integer.compare(e1.age,e2.age);//可以加个-号调整排序方式
            }else {
                return e1.name.compareTo(e2.name);
            }
        });
        for (Employee e:employees) {
            System.out.println(e);
        }
    }
}

