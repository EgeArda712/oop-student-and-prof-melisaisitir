package tr.edu.maltepe.oop;

public class Myfirstclass{

    public static void main(String[] args){
     Student studentm = new Student("Melisa",24);
     Student studentT = new Student("Tamay",20);
     Prof professor1 = new Prof("ensar gul","SENG");


     professor1.teaches("OOP");
     studentT.studying("OOP");
     studentm.studying("OOP");

    }
}
class Student{
    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
     public int getAge(){
        return age;
     }
     public void setAge(int age){
        this.age = age;
     }
     public void studying(String subject){
        System.out.println(name +" is studying " + subject);

     }
}
class Prof{
    private String name;
    private String department;

    public Prof(String name, String department){
        this.name = name;
        this.department = department;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public void teaches(String subject){
        System.out.println(name + " is teaching " + subject);
    }
}