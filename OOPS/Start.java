import java.util.*;

public class Start {
    public static void main(String[] args) {
        // Pen p1 =  new Pen();
        // p1.setColor("green");
        // p1.color = "pink";
        // System.out.println(p1.color);
        // p1.tip = 3;
        // System.out.println();
        // Student p2 = new Student();
        // p2.name="Himanshu";
        // p2.age=21;
        // p2.calcPercentage(89,98,80);
       
        // System.out.println(p2.percentage);


        // BankAccount myAcc = new BankAccount();
        // myAcc.name = "HImanshu";
        // myAcc.setPassword("123");


        Pen p1 =  new Pen();
        p1.setColor("green");
       
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
        
    }
}

  
    
    class Pen{
         private String color;
         private int tip;

        String getColor() {
            return this.color;
        }

        int getTip() {
            return this.tip;
        }

        void setColor(String newColor){
            color = newColor;
        }

        void setTip(int newTip){
          this.tip = newTip;
        }
    }
    // class BankAccount{
    //    public String name;
    //    private String password;
    //    public void setPassword(String pwd){
    //     password = pwd;
    //    }
    // }

    // class Student {
    //     String name;
    //     int age;
    //     float percentage;//cgpa

    //     void calcPercentage(int phy,int chem,int math){
    //         percentage = (phy + chem + math)/3;
    //     }
       
    // }
   
    // Encapsulation
    

