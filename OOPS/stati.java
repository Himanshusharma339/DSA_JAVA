import java.util.*;
public class stati {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schollName = "Jmv";

        Student s2=new Student();
        System.out.println(s2.schollName);
        
    }
}

class Student {
    String name;
    int roll;

static String schollName;

void setName(String name) {
    this.name =  name;
}
String getName() {
    return this.name;
}
}
