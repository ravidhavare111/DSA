package Generics_Study.ArrayList.Multi_type_ArrayList;
import java.util.ArrayList;

public class Multi_ArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("Hello");
        list.add(2);
        list.add(2.54);

        Object object = list.get(0);
        String str = (String)list.get(0);
        int num = (int)list.get(1);
        int num2 = (int)list.get(0);    // This will cause a ClassCastException at runtime

        System.out.println(str+ " " + num);

    }

}