import java.io.*;
class Person{
    //instance variables 
    int height, weight;
    static int collegeCode;
    //constructor: - used to initialize the value of the varibles 
    Person(int h, int w){
        this.height = h;
        this.weight = w;
    }
    void run(){
        System.out.println("Program started running..j");
    }
    void print(){
        System.out.println("Now my weight is: " + this.weight);
        System.out.println("Now my height is: " + this.height);
    }
    void staticPrint(){
        
        collegeCode = 10118;
        System.out.println("The college code is :" + collegeCode);
    }
    public static void main(String[] args){
        //creating an object
        Person  dipika = new Person(6,70);
        Person xyz = new Person(8,120);
        dipika.run();
        dipika.print();
        xyz.run();
        xyz.print();
        dipika.staticPrint();
        xyz.staticPrint();
    } 
}