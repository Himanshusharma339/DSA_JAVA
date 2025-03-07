import java.util.*;

public class Constructor {
    public static void main(String[] args) {

        // Student obj = new Student();
        // obj.name="Himanshu";
        // obj.age = 20;
        // System.out.println(obj.name);

        // Student s1 = new Student();
        // Student s2 = new Student("Himanshu");
        // Student s3 = new Student(12);

        Student S1 = new Student();
        S1.name = "Himanshu";
        S1.roll = 44;
        S1.password = "ABC";

        S1.marks[0]= 100;
        S1.marks[1]=90;
        S1.marks[2]=98;
      

        Student S2 = new Student(S1);//copy
        S2.password = "XYZ";//s2 me naya pass 

        for(int i=0;i<3;i++){
            System.out.println(S1.marks[i]);
        }

       
    }
    
}

class Student{
    String name;
    int roll;
    String password;
    int marks[];


// 3 types of constructor 
// Non parameterised constructor 
//parameterised constr
// Student(){
//     System.out.println("Const is called");
// }
// Student (String name){
//     this.name= name;
// }
// Student (int roll) {
//     this.roll= roll;
// }
//yaha pr constructor overloading bhi hora h and this
// an eg of ploymorphism ->many form multiple func bna liye h jinke same name h
// **************
// Copy Constructor / Shallow copy constructor
Student(Student S1){
    marks = new int[3];
    this.name = S1.name;
    this.roll = S1.roll;
}


//deep Copy constructor
// Student(Student S1) {
//     marks = new int [3];
//     this.name = S1.name;
//     this.roll = S1.roll;
//     for(int i=0;i<marks.length;i++) {
//         this.marks[i] = S1.marks[i];
//     }
// }
Student(){//jb hm koi parm khud se pas kare tb 
    // this.name= name;
    marks = new int[3];
    System.out.println("Constructor is called...");

}
Student(String name){
    marks = new int[3];
    this.name = name;
}
Student(int roll){
    marks = new int[3];
    this.roll = roll;
}

}


// /shallow copy -> Reference copy kr dete new obj nhi bnate 
// deep me naya maks ka arr changes not reflect






