import Tensor.ITensor;
import org.jetbrains.annotations.Contract;

import java.io.File;
import java.util.logging.FileHandler;

public class Graph {


    private ITensor <Integer> grDistanceTensor;
    private IEdge[] edges;
    private INode[] nodes;

    /**
     *
     * @param nodes The number of nodes in the graph.
     */
    public Graph(int nodes) {

    }

    public Graph(File inpFile){

    }

    /**
     *
     * @param tail The node where the edge begins
     * @param head The node where the edge ends
     */
    public void addEdge(int tail, int head) {

    }

    public int[] shortestReach(int startingNode){

        return new int[] {1, 2, 3, 4};
    }

    @SuppressWarnings("unused")
    public IEdge[] getEdges () {
        return edges;
    }

    @SuppressWarnings("unused")
    public void setEdges (IEdge[] edges) {
        this.edges = edges;
    }

    @SuppressWarnings("unused")
    public INode[] getNodes () {
        return nodes;
    }

    @SuppressWarnings("unused")
    public void setNodes (INode[] nodes) {
        this.nodes = nodes;
    }
}
