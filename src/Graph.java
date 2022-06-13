public class Graph {

    private int numOfNodes;
    private float[][] matrix;

    /*
     This will allow us to safely add weighted graphs in our class since
     we will be able to check whether an edge exists without relying
     on specific special values (like 0)
    */
    private boolean[][] isSetMatrix;

    public Graph(int numOfNodes) {
        this.numOfNodes = numOfNodes;

        // Simply initializes our adjacency matrix to the appropriate size
        matrix = new float[numOfNodes][numOfNodes];
        isSetMatrix = new boolean[numOfNodes][numOfNodes];
    }

    /*
 Since matrices for directed graphs are symmetrical, we have to add
 [destination][source] at the same time as [source][destination]
*/
    public void addEdge(int source, int destination) {

        matrix[source][destination] = 1;
        isSetMatrix[source][destination] = true;

    }

    public void printMatrix() {
        for (int i = 0; i < numOfNodes; i++) {
            for (int j = 0; j < numOfNodes; j++) {
                // We only want to print the values of those positions that have been marked as set
                if (isSetMatrix[i][j])
                    System.out.format("%8s", String.valueOf(matrix[i][j]));
                else System.out.format("%8s", "/  ");
            }
            System.out.println();
        }
    }

    /*
 We look at each row, one by one.
 When we're at row i, every column j that has a set value represents that an edge exists from
 i to j, so we print it
*/
    public void printEdges() {
        for (int i = 0; i < numOfNodes; i++) {
            System.out.print("Node " + i + " is connected to: ");
            for (int j = 0; j < numOfNodes; j++) {
                if (isSetMatrix[i][j]) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }

    public boolean hasEdge(int source, int destination) {
        return isSetMatrix[source][destination];
    }


}
