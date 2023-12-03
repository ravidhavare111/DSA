import java.util.ArrayList;
import java.util.Scanner;

public class temp {


    public static void DFS(int node, ArrayList<ArrayList<Integer>> graph, int visited[], int parent[] ){

        // visted[node] = 1;

        System.out.print(node+" ");

        for(int x : graph.get(node)){

            if(visited[x] == 0){
                visited[x] = 1;

                parent[x] = node;

                DFS(x, graph, visited, parent);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int e = sc.nextInt();

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i = 0 ; i<=n ; i++){
            graph.add(new ArrayList<Integer>());
        }

        for(int i = 1 ; i<=e ; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        int visited[] = new int[n+1];
        int parent[] = new int[n+1];

        visited[1] = 1;

        DFS(1, graph, visited, parent);
    }
    
}
