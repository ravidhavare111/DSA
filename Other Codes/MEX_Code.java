import java.util.HashSet;
import java.util.Set;

public class MEX_Code {

    public static void main(String[] args) {
        
        int arr[] = {2,1,0,1,2,0,5};        

        Set<Integer> HS = new HashSet<>();  

        for(int temp : arr){
            HS.add(temp);
        }

        int mex = 0;
        while(HS.contains(mex)){
            mex++;
        }

        System.out.println(mex);
    }

}