import java.util.*;

public class Recursions {

    public static int recursion(int n){
        if(n == 0){
            return 0;
        }

        return n + (recursion(n-1));
    }

    public static void main(String args[]){
        int n = 10;
        int ans = recursion(n);

        System.out.println(ans);
    }
    
}
