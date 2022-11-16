package Inheritance;

public class Main3 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Chihua",152273, 42,"JAVA");
        Teacher teacher2 = new Teacher("Kevin",100002, 50,"Deep Learning");
        Student student1 = new Student("David", 51021001,19,"Java");
        Student student2 = new Student("Howard", 51021002,20,"Java");

        teacher1.teach();
        teacher2.teach();
        student1.learn();
        student2.learn();
    }
}
