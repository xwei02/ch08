package Inheritance;

public class Teacher {
    private String name;
    private int id;
    private int age;
    private String subjectName;

    public Teacher(String name, int id, int age, String subjectName) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.subjectName = subjectName;
    }
    public void sit(){
        System.out.println("Sitting...");
    }
    public void eat(){
        System.out.println("eating...");
    }
    public void teach(){
        System.out.println("teaching...");
    }
}
