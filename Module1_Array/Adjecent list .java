// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.LinkedList;

class Graph{
    // Data fields
    int V; // no of vertices
    LinkedList<Integer> adj[]; // array of LinkedLists
    
    //constructor
    Graph(int v){
    this.V=v;
    adj = new LinkedList[v];
    
    // for each vertex we have initialized empty LL
    for(int i=0;i<V;i++){
        adj[i] = new LinkedList<>();
    }
    }
    
    // connection 
    void addEdge(int v,int w){
        adj[v].add(w);
    }
    
    // print whole Graph
    void printGraph(){
         // outer for loop to traversal all the vertices
        for(int i=0;i<V;i++){
             System.out.print(i +"->");
            // adj[0] 
            for(int j=0; j<adj[i].size();j++){
                 System.out.print(adj[i].get(j)+" ");
            }
            
            System.out.println();
        }
    }
    
    
}
class Main {
    public static void main(String[] args) {
        Graph g= new Graph(5);
        System.out.println(g);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(0,3);
        g.addEdge(1,2);
        g.addEdge(2,4);
        g.addEdge(3,4);
        
        g.printGraph();
        
    }
}
