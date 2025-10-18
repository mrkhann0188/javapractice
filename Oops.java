public class Oops{

    public static void main(String args[]){
        /*Student s1 = new Student();
        // s1.name = "AYAAN KHAN";
        // s1.roll = 234;
        // s1.pass = "abc";
        // s1.marks[0]= 100;
        // s1.marks[1]= 90;
        // s1.marks[2]= 80;
        // Student s2 = new Student(s1);
        // s2.pass = "xyz";
        // s1.marks[2]= 100;
        // for(int i =0; i<3; i++){
        //     System.out.println(s2.marks[i]);
        } 
        Fish shark = new Fish();
        shark.eat();
        Dog doog = new Dog();
        doog.eat();
        doog.legs = 4;
        System.out.println(doog.legs);
        Fish maral =  new Fish();
        maral.swim();
        Bird eagle = new Bird();
        eagle.fly();
        Mammal human = new Mammal();
        human.walk();
        human.breathe();
        human.eat();
        Horse h = new Horse();
        h.eat();
        h.walk();
        Chicken c = new Chicken();
        c.eat();
        c.walk();
        System.out.println(h.col);
        Queen q = new Queen();
        q.moves();*/
        Stu s1 = new Stu();
        s1.schooln = "JVM";
        Stu s2 = new Stu();
        System.out.println(s2.schooln);
        

    }
}
/* 
class Student{
    String name;
    int roll;
    String pass;
    int marks[];
    //SHALLOW COPY 
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }
    //DEEP COPY CONSTRUCTOR
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i =0;i<marks.length;i++){
            this.marks[i]= s1.marks[i];
        }
    }
    
    Student(){
        marks = new int[3];
        System.out.println("Constructor is called....");
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
class Animal {
    String colour;
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}
//SINGLE LEVEL INHERITENCE 

class Fish extends Animal{
    int fins;

    void swim(){
            System.out.println("swims in water");
    }
} 
// MULTILEVEL INHERITANCE 
class Mammal extends  Animal{
    int legs;
}
class Dog extends  Mammal{
    String breed;
} 
//Hierarchial INheritance
class Fish extends Animal{
    void swim(){
        System.out.println("Swimming");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("Flying");
    }
}
class Mammal extends  Animal{
    void walk(){
        System.out.println("Walking");
    }
}
abstract class Animal{
    String col ;
    Animal(){
        col = "Blue";
    }
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    void Changecol(){
        col = "Dark Brown";
    }
    void walk(){
        System.out.println("4 Legs");
    }
}
class Chicken extends Animal{
        void Changecol(){
        col = "yeLLow";
    }
    void walk(){
        System.out.println("2 Legs");
    }
}
interface ChessPl{
    void moves();  
}
class Queen implements ChessPl{
    public void moves(){
        System.out.println("U D R L DI");
    }
}

class Rook implements ChessPl{
    public void moves(){
        System.out.println("U D R L ");
    }
}

class King implements ChessPl{
    public void moves(){
        System.out.println("U D R L DI-by1 step");
    }
}
class Student{
    String name;
    int roll;
    static String schoolName;
    void setName(String name){
        this.name = name;
    }
    String getName(){
        this.name = name;
    }
    

}*/
class Stu{
    String name;
    int roll;
    static String schooln;
    void setNam(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}
