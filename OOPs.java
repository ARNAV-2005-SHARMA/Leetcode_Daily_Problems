
/*class Pen{ //class --> blueprint
    String color;
    String type; //Ballpoint or gel

    public void write(){ 
        System.out.println("write something");//Method or function
    }
    public void printType(){
        System.out.println(this.type); //this keyword refers to the current object in a method or constructor
        System.out.println(this.color);
    }
}
class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class OOPs{ //Object
    public static void main(String args[]){
        Pen pen1 = new Pen(); //special function --> Constructor(java ke objects ko bnana)
        pen1.color = "Red";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type = "ball";

        pen2.write();
        pen1.printType();
        pen2.printType();

        Student s1 = new Student();
        s1.name = "Arya";
        s1.age = 33;

        Student s2 = new Student();
        s2.name = "Mohan";
        s2.age = 22;

        s1.printInfo();
        
    }
}*/

//Constructor types

/*class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(){ //By default (constructor)
        System.out.println("Non Parameterized Constructor called");//Properties of constructor-->(1).no return type. (2).class name and constructor name are same.  (3).object called the constructor only one time 
    }
    Student(String name,int age){ //parameterized constructor
        this.name=name;
        this.age=age;
    }
    Student(Student s2){ //Copy constructor
        this.name = s2.name;
        this.age = s2.age;
    }
    Student(){

    }
}
public class OOPs{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "anisha";
        s1.age = 23;

        Student s2 = new Student(s1);
        s2.printInfo();
    }
}*/

/*NOTE-->In java, the garbage collector automatically deletes the unused objects to free up the memory. Developers have no need to mark the objects for  deletion, which is error-prone and vulnerable to the memory leak.
==>Java has no destructors available due to garbage collector  */

/*Main topics of oops
(1).Polymorphism--> "many forms" & the same entity(function or object) behaves differently in differnet scenarios
*/
/*There are two main types of polymorphism -->Runtime and Compile time polymorphism .
Runtime polymorphism is achieved through method overriding & compile time polymorphism is achieved through method overloading
*/

/*(1).Compile-time polymorphism = The term method overloading allow us to have more than one function or method with the same name .Since this is executed during compile time, that's why it is known as Compile-Time Polymorphism.
Differnt work under the same function name.
*/
/*class Student{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name , int age){
        System.out.println(name+" "+age);
    }
}
public class OOPs{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "aman";
        s1.age = 123;

        s1.printInfo(s1.name, s1.age);
    }
}*/

/*(2)..Inheritance--> When class derives from another class. The child class will inherit all the public and priotected properties and methods from the parent class.
In, addition it can have its own properties & methods. An inherited class is defined by using the "extends" keyword.
*/

/*class Shape{ //Base class or Parent class
    String color; //Properties

    public void printColor(){
        System.out.println(this.color);
    }
}

class Triangle extends Shape{ //Sub class or child class

}
public class OOPs{
    public static void main(String args[]){
        Triangle t1 = new Triangle();
        t1.color = "Red";

        t1.printColor();
    }
}*/

/*-->Types of Inheritance = (1).Single level inheritance => Base class---Derived class */

/*class Shape{ //base class
    public void Area(){
        System.out.println("display area");
    }
}
class Triangle extends Shape{ //child class
    public void Area(int l , int h){
        System.out.println(1/2*l*h);
    }
}
public class OOPs{
    public static void main(String args[]){
        
    }
}*/

/*-->(2).Multi level inheritance = Base class--Derived class--Derived class*/

/*class Shape{ //base class
    public void Area(){
        System.out.println("display area");
    }
}
class Triangle extends Shape{ //child class
    public void Area(int l , int h){
        System.out.println(1/2*l*h);
    }
}
class EquilateralTriangle extends Triangle{ //Derived class
    public void Area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
public class OOPs{
    public static void main(String args[]){
        
    }
}*/

/*-->(3).Hierarchial inheritance = Derived class---Base class--Derived class */

/*class Shape{ //base class
    public void Area(){
        System.out.println("display area");
    }
}
class Triangle extends Shape{ //Derived class
    public void Area(int l , int h){
        System.out.println(1/2*l*h);
    }
}
class Circle extends Shape{ //Derived class
    public void Area(int r){
        System.out.println(3.14*r*r);
    }
}
public class OOPs{
    public static void main(String args[]){
        
    }
}*/

/*-->(4).Hybrid inheritance = Multiple types of inheritance*/
/*-->Multiple inheritance = base clase--base class--derived class */
/*Packages -: Package is a group of similar types of classes , interfaces and sub packages.
packages can be built in or user defined .*/

/*import java.util.*;

class Shape { // base class
    public void Area() {
        System.out.println("display area");
    }
}

class Triangle extends Shape { // Derived class
    public void Area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

class Circle extends Shape { // Derived class
    public void Area(int r) {
        System.out.println(3.14 * r * r);
    }
}

public class OOPs {
    public static void main(String args[]) {

    }
}*/

/*==>(3).Encapsulation :- Wrapping up of data member(variables) and member function(method) together into a single unit is called is known as encapsulation.*/

/*==>(4).Abstraction --> Abstraction is hiding the implementation details from the user and showing only important or useful parts to the user.
Abstraction is achieved in 2 ways : (i)->Abstract class (ii)->Interfaces(Pure Abstraction)
*/

/*abstract class Animal { // only blueprint (hiding from the user)
    abstract void walk(); //base class
    
    Animal() {// constructor
        System.out.println("You are creating a new animal");
    }

    public void eat() {// non abstract
        System.out.println("Animal eats");
    }
}

class Horse extends Animal{ //derived class
    Horse() {
        System.out.println("created a horse");
    }

    public void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("walk on 2 legs");
    }
}

public class OOPs {
    public static void main(String args[]) {
        Horse horse = new Horse(); //object
        horse.walk();
        horse.eat();
        
        /*Animal animal = new Animal(); // run time error because of abstract class
    }
}*/

/*-->(ii)Interfaces -: An interface in java is a blueprint of a class. It has static constants and abstract methods. The interfaces in java is a mechanism to achieve abstraction.*/

/*interface Animal { // By default public
    public void walk();// define
}

interface Herbivore {
f
}

class Horse implements Animal, Herbivore { //multiple inheritance
    public void walk() { // implement or use
        System.out.println("walks on 4 legs");
    }
}

public class OOPs {
    public static void main(String args[]) {
        Horse horse = new Horse();
        horse.walk();
    }
}*/
/*NOTE===>Interfaces support the functionality of multiple inheritance. Multiple inheritance only possible in inheritance but not in the class */

/*-->Use of Static keyword*/

class Student {
    String name;
    static String school;

    public static void changeSchool() {
        school = "newschool";
    }

    public void setId(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setId'");
    }
}

public class OOPs {
    public static void main(String args[]) {
        Student.school = "SVM";
        Student student1 = new Student();
        student1.name = "Anuu";
        System.out.println();
    }
}