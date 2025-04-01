import java.util.*;
class Employee
{
    Employee() {//default constructor
        System.out.println("Default constructor is called.");
    }
}

class Student {
    String name;
    int age;
    int marks;
    // parameterised constructor
    Student(String n ,int a,int m) {
        name = n;
        age = a;
        marks = m;
    }

    void display(){
        System.out.println("Name:"+name+",Age is"+age+",and Marks is"+marks);

    }
}

//copy constructor
class  Car {
    //  String model;
    String color;

    // parameterised constructor
    Car(String color) {
        this.color = color;
    }
    // copy constructor
    Car(Car d) {
        this.color = d.color;
    }
   
    // Car(String model) {
    //     this.model = model;
    // }
    // Car(Car c) {
    //     this.model = c.model;
    // }

    void show() {
        System.out.println("Car Color is"+color );
    }
}

class Btech {
    String name;
    int id;
    Btech() {
        String name; 
        int id;
    }
    Btech(String m,int a) {
        name = m;
        id = a;
    }

    void show() {
        System.out.println("Name "+name+"Id "+id);
    }
}
public class cos {
    public static void main(String[] args)
    {
        // Car car1= new Car("Lamborghini Revuelto");
        // Car car2 = new Car(car1);//copy constructor call

        
       Btech cs = new Btech();
       Btech cs1 = new Btech("sharma",45);
       cs.show();
       cs1.show();



    } 
    }

