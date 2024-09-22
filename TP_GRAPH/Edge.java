public class Edge {
    private Vertex vertex1;
    private Vertex vertex2;
    private String cssClass;

    // Constructor
    public Edge(Vertex vertex1, Vertex vertex2) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.cssClass = "edge-red"; // Default class
    }

    // Getter for the first vertex
    public Vertex getVertex1() {
        return vertex1;
    }

    // Getter for the second vertex
    public Vertex getVertex2() {
        return vertex2;
    }

    public String getCssClass() {
        return cssClass;
    }

    public void setCssClass(String cssClass) {
        this.cssClass = cssClass;
    }

    // toString method
    @Override
    public String toString() {
        return "Edge{" + "vertex1=" + vertex1.getName() + ", vertex2=" + vertex2.getName() + '}';
    }
}
