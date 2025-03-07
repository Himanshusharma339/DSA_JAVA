//Astract class 
import java.util.*;
public class Abstract {
public static void main(String[] args) {
    hourse h1 = new hourse ();
    h1.eat();
    h1.walk();

    mob h2 = new mob();
    h2.eat();
    h2.walk();
    
    
}

abstract class Animal{
    void eat(){
        System.out.println("it eats");
    }
   abstract void walk();
}

class hourse extends Animal{
void walk(){
System.out.println("it's having 4 legs");
}

}

class mob extends hourse{
    void walk(){
        System.out.println("Connecting it by 2 legs");
    }
}


}