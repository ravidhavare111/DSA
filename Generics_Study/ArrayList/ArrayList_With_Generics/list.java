package Generics_Study.ArrayList.ArrayList_With_Generics;
import java.util.ArrayList;

public class list {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("World");

        String str = list.get(0);
        String str2 = list.get(1);

        System.out.println(str + " " + str2);
    }

}