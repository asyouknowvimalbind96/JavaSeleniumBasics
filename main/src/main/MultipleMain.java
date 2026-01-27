package main;

public class MultipleMain {
    public static void main(String[] args) {
        System.out.println("hello world");
        main("Im nikeshyadav");
    }

    public static void main(String arg) {
        System.out.println("yes: " + arg);
    }
}
