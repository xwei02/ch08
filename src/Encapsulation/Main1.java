package Encapsulation;

public class Main1 {
    public static void main(String[] args) {
        Robot r = new Robot("GUNDAM",2022);
        System.out.println(r.getName());
        r.setName("Aerial");
        System.out.println(r.getName());
    }
}
