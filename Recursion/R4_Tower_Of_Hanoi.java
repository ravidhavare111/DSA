public class R4_Tower_Of_Hanoi {

    public static void towerOfHanoi(int N, char A, char B, char C){

        if(N == 0){
            return ;
        }

        towerOfHanoi(N-1, A, C, B);

        System.out.println("Moving Disc "+ N + " from Rod " +A+ " to rod " +C);

        towerOfHanoi(N-1, B, A, C);

    }

    public static void main(String args[]){
        int N = 4;

        towerOfHanoi(N, 'A' , 'B', 'C');
    }
    
}