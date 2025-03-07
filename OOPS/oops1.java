import java.util.*;
public class oops1 {


    public static void main(String[] args) {
        // Pen obj = new Pen();

        // Student obj = new Student();

//        obj.name="Himanshu";
//        obj.age=18;
//        obj.CalculatePercentage(90,89,78);
//        System.out.println(obj.percentage);
//        System.out.println(obj.name);     
// }
bache b1 = new bache();
b1.name="Himanshu";
// b1.password=123;
b1.setpassword("null");



Pen S1 = new Pen();
S1.setColor("blue");
System.out.println(S1.getColor());

S1.setTip(5);
System.out.println(S1.getTip());


    }





}

    class Pen{  
        private String color;
       private int tip;
        String getColor(){
            return this.color;
        }
        int getTip(){
            return this.tip;
        }

        void setColor(String newColor){
            this.color = newColor;

        }
        void setTip(int newTip){
            this.tip= newTip;
    
        }
    }

    class Student {
        String name;
        int age;
        float percentage;
        int marks[];
      

       void CalculatePercentage (int phy,int math,int chem){
        percentage =(phy + math +chem)/3;

       } 
    } 
    
    class bache{
       public String name;
       private String password;

       public void setpassword(String pwd){
        password = pwd;
       }



    }
       
       


    
