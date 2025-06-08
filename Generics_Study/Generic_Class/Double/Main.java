package Generics_Study.Generic_Class.Double;

public class Main {

    public static void main(String[] args) {

        Pair<String, Integer> pair = new Pair<>("Age", 30);
        System.out.println("Key: " + pair.getKey());
        System.out.println("Value: " + pair.getValue());

    }

}