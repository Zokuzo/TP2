import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class Graph {
    private Set<Vertex> vertices;
    private Set<Edge> edges;
    private Map<Edge, Set<Vertex>> edgeToVertices;

    // Constructor
    public Graph() {
        vertices = new HashSet<>();
        edges = new HashSet<>();
        edgeToVertices = new HashMap<>();
    }

    // Method to add a vertex
    public void addVertex(Vertex v) {
        vertices.add(v);
    }

    // Method to add an edge
    public void addEdge(Edge e) {
        if (vertices.contains(e.getVertex1()) && vertices.contains(e.getVertex2())) {
            edges.add(e);
            Set<Vertex> connectedVertices = new HashSet<>();
            connectedVertices.add(e.getVertex1());
            connectedVertices.add(e.getVertex2());
            edgeToVertices.put(e, connectedVertices);
        } else {
            System.out.println("Both vertices must be present in the graph before adding an edge.");
        }
    }

    // Get all vertices
    public Set<Vertex> getVertices() {
        return vertices;
    }

    // Get all edges
    public Set<Edge> getEdges() {
        return edges;
    }

    // Génération du code HTML
    // Graph.java
    public String toHTML() {
        StringBuilder html = new StringBuilder();

        // Début du fichier HTML
        html.append("<!DOCTYPE html>\n<head>\n<title>Graph Visualization</title>\n");
        html.append("<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\n</head>\n<body>\n");
        html.append("<h1>Visualisation de Graphe</h1>\n");
        html.append("<svg width=\"1920\" height=\"1080\">\n");

        // Dessin des arêtes
        for (Edge e : edges) {
            Vertex v1 = e.getVertex1();
            Vertex v2 = e.getVertex2();

            // Coordonnées des sommets pour chaque arête
            double controlX = (v1.getX() + v2.getX()) / 2;
            double controlY = Math.min(v1.getY(), v2.getY()) - 50; // Ajouter une courbure légère

            html.append("<path d=\"M").append(v1.getX()).append(",").append(v1.getY())
                    .append(" Q").append(controlX).append(",").append(controlY)
                    .append(" ").append(v2.getX()).append(",").append(v2.getY())
                    .append("\" class=\"").append(e.getCssClass()).append("\" />\n");
        }

        // Dessin des sommets
        for (Vertex v : vertices) {
            html.append("<circle cx=\"").append(v.getX()).append("\" cy=\"").append(v.getY())
                    .append("\" r=\"50\" class=\"vertex\" id=\"vertex").append(v.getLabel()).append("\"/>\n")
                    .append("<text x=\"").append(v.getX()).append("\" y=\"").append(v.getY() + 5)
                    .append("\" color = \"white\" class=\"vertex-label\" alignment-baseline=\"middle\" text-anchor=\"middle\">")
                    .append(v.getLabel()).append("</text>\n");
        }

        html.append("</svg>\n");

        // Ajout de contrôles pour la coloration
        html.append("<div class='controls'>\n")
                .append("<h2>Colorer un sommet ou une arête</h2>\n")
                .append("<label for='element-type'>Type:</label>\n")
                .append("<select id='element-type'>\n")
                .append("<option value='vertex'>Sommet</option>\n")
                .append("<option value='edge'>Arête</option>\n")
                .append("</select>\n")
                .append("<label for='element-id'>ID:</label>\n")
                .append("<input type='text' id='element-id' placeholder='ex: vertexA ou edge1'>\n")
                .append("<label for='color'>Couleur:</label>\n")
                .append("<input type='color' id='color-picker'>\n")
                .append("<button onclick='colorElement()'>Colorier</button>\n")
                .append("</div>\n");

        // Ajout d'un script pour permettre la coloration dynamique
        html.append("<script>\n")
                .append("function colorElement() {\n")
                .append("  const type = document.getElementById('element-type').value;\n")
                .append("  const id = document.getElementById('element-id').value;\n")
                .append("  const color = document.getElementById('color-picker').value;\n")
                .append("  document.getElementById(id).setAttribute('style', 'stroke:' + color + '; fill:' + color);\n")
                .append("}\n")
                .append("</script>\n");

        html.append("</body>\n</html>");

        return html.toString();
    }





    // Save HTML to file
    public void saveToHTMLFile(String filePath) {
        String htmlContent = toHTML();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("<html><body>");
            writer.write(htmlContent);
            writer.write("</body></html>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // toString method
    @Override
    public String toString() {
        return "Graph{" + "vertices=" + vertices + ", edges=" + edges + ", edgeToVertices=" + edgeToVertices + '}';
    }
}