package Generics_Study.Generic_Class.Single;

public class Main {

    public static void main(String[] args) {

        Box<String> box = new Box<>();      
        box.setUser("Hello World");
        System.out.println(box.getUser());  

        Box<Integer> box2 = new Box<>();    
        box2.setUser(52);
        System.out.println(box2.getUser()); 


    }

}