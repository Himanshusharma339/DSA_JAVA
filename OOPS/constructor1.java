import java.util.*;
public class constructor1 {
    public static void main(String[] args) {

        Student s1= new Student("Himanshu");
        
        System.out.println(s1.name);
        }

        
}
    class Student{
        String name;
        int age;

        Student (String name) {
             this.name = name;
            // System.out.println("Function is running");
        }
    }
    

