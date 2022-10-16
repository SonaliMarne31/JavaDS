package Graph;

public class GraphProblems {

  public static void main(String[] args) {
    int nodes = 10;
    
    Graph g = new Graph(nodes);
   
    g.addEdge(1, 1);
    g.addEdge(1, 2);
    g.addEdge(1, 4);
    g.addEdge(2, 3);
    g.addEdge(2, 5);
    g.addEdge(2, 1);
    g.addEdge(5, 3);
    g.addEdge(5, 6);
    g.addEdge(8, 1);
    g.addEdge(8, 9);

    System.out.println(g.ifSourceConnectedToDestination(1, 2));
    System.out.println(g.ifSourceConnectedToDestination(1, 9));
  }

}