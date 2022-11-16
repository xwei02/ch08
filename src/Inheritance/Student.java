package Inheritance;

public class Student {
    private String name;
    private int id;
    private int age;
    private String className;

    public Student(String name, int id, int age, String className) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.className = className;
    }
    public void sit(){
        System.out.println("Sitting...");
    }
    public void eat(){
        System.out.println("eating...");
    }
    public void learn(){
        System.out.println("learning...");
    }
}
