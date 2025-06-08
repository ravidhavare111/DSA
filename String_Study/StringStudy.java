package String_Study;

import java.util.HashMap;
import java.util.Map;

class StringStudy{

    public static void main(String[] args) {     
        
        String a = "welcome";
        System.out.println(a.hashCode());        
        String b = new String("welcome");        
        System.out.println(b.hashCode());        
        

        Map<String, String> HM = new HashMap<>();

        HM.put(a, "1");
        HM.put(b, "2");

        System.out.println("HashMap size: " + HM.size());
    }
}