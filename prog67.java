import java.util.*;
public class prog67 {
    static class Edge{
        int src;
        int dest;
        int wt;
        Edge(int src,int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Edge>[] graph = new ArrayList[n];
        for(int i = 0; i < n;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,5));
    }
}
