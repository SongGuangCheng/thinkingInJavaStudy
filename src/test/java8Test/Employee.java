package test.java8Test;

/**
 * @author sgc
 * @create 2020/9/7
 */
public class Employee {
        int age;
        String name;
public Employee(int age,String name){
        this.age = age;
        this.name = name;
        }

@Override
public String toString() {
        return "Employee{" +
        "age=" + age +
        ", name='" + name + '\'' +
        '}';
        }
        }
