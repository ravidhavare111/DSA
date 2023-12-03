import java.util.*;
public class g3_BFS {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i = 0 ; i<= n ; i++){
            graph.add(new ArrayList<Integer>());
        }

        for(int i = 1 ; i<= m ; i++){
            int source = sc.nextInt();
            int dest = sc.nextInt();
            graph.get(source).add(dest);
            graph.get(dest).add(source);
        }

        int used[] = new int[n+n];
        used[1] = 1;
        int level[] = new int[n+n];
        level[1] = 0;

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        int i = 1;
        System.out.println();

        while(!q.isEmpty()){
            int temp = q.remove();
            System.out.println(temp + " " + level[temp]);

            for(int x : graph.get(temp)){
                

                if(used[x] == 0){
                    q.add(x);

                    used[x] = 1;
                    level[x] = level[temp] + 1;
                
                }
            }
        }
    }
}