// package Cipher_School.Java_Assignment2;
import java.util.ArrayList;
class Employee{
   int empId;
   String empName;
   String empDes;
   float salary;
   String address;

   public Employee(int empId,String empName,String empDes,float salary,String address)
   {
       this.empId = empId;
       this.empName = empName;
       this.empDes = empDes;
       this.salary = salary;
       this.address = address;
   }


}
public class Problem3 {
    public static void main(String[] args) {
    ArrayList<Employee> list = new ArrayList<>();
    list.add(new Employee(1,"Vishal","Programmer",80000,"Rajasthan"));
    list.add(new Employee(2,"Ankit","IAS",50000,"Rajasthan"));
    list.add(new Employee(3,"Nishant","Manager",65000,"Rajasthan"));
    list.add(new Employee(4,"Sourabh","Trainer",40000,"Madhyapradesh"));
    list.add(new Employee(5,"Anup","Gamer",49000,"Hariyana"));
    list.add(new Employee(6,"Madhur","Scientist",55000,"Hariyana"));
    list.add(new Employee(7,"Mayank","Programmer",90000,"Utter Pradesh"));
    list.add(new Employee(8,"Aditya","Intern",20000,"Punjab"));
    list.add(new Employee(9,"Moomal","Student",70000,"Rajasthan"));
    list.add(new Employee(10,"Vidhi","Trainer",50000,"Himachal"));

    list.stream().forEach(ls -> System.out.println(ls.empName));
    list.stream().filter(ls -> ls.salary > 50000).forEach(ls ->System.out.println(ls.salary));
    list.stream().filter(ls -> ls.address.startsWith("M")).forEach(ls -> System.out.println(ls.address));
    list.stream().filter(ls ->ls.empDes.endsWith("e")).forEach(ls->System.out.println(ls.empDes));
    }
    
}