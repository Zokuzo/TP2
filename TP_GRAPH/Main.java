public class Main {
    public static void main(String[] args) {
        // Création des sommets (A, B, C, D) comme dans l'exemple
        Vertex A = new Vertex("A", 410, 502 );
        Vertex B = new Vertex("B", 1400, 650);
        Vertex C = new Vertex("C", 950, 300);
        Vertex D = new Vertex("D", 650, 100);
        Vertex E = new Vertex("E", 1650, 500);

        A.setCssClass("vertex-red");
        B.setCssClass("vertex-blue");
      

        // Création des arêtes (a, b, c, d, e, f, g) reliant les sommets
        Edge edgeA = new Edge(A, B); // arête a
        Edge edgeB = new Edge(A, C); // arête b
        Edge edgeC = new Edge(B, C); // arête c
        Edge edgeD = new Edge(B, D); // arête d
        Edge edgeE = new Edge(C, D); // arête e
        Edge edgeF = new Edge(C, C); // arête f (boucle)
        Edge edgeG = new Edge(B, B); // arête g (boucle)
        Edge edgeH = new Edge(D, E); // arête h
        Edge edgeI = new Edge(E, A); // arête i
        Edge edgeJ = new Edge(E, B); // arête j

        edgeA.setCssClass("edge-red");
        edgeB.setCssClass("edge-blue");
        

        // Création du graphe
        Graph graph = new Graph();

        // Ajout des sommets dans le graphe
        graph.addVertex(A);
        graph.addVertex(B);
        graph.addVertex(C);
        graph.addVertex(D);
        graph.addVertex(E);

        // Ajout des arêtes dans le graphe
        graph.addEdge(edgeA); // arête a
        graph.addEdge(edgeB); // arête b
        graph.addEdge(edgeC); // arête c
        graph.addEdge(edgeD); // arête d
        graph.addEdge(edgeE); // arête e
        graph.addEdge(edgeF); // arête f (boucle)
        graph.addEdge(edgeG); // arête g (boucle)
        graph.addEdge(edgeH); // arête h
        graph.addEdge(edgeI); // arête i
        graph.addEdge(edgeJ); // arête j

        // Affichage de tous les sommets
        System.out.println("Sommets dans le graphe :");
        for (Vertex v : graph.getVertices()) {
            System.out.println(v);
        }

        // Affichage de toutes les arêtes avec les sommets qu'elles relient
        System.out.println("\nArêtes dans le graphe :");
        for (Edge e : graph.getEdges()) {
            System.out.println(e + " relie " + e.getVertex1().getName() + " et " + e.getVertex2().getName());
        }

        // Sauvegarde du graphe en HTML
        String filePath = "C:\\COURS\\3A\\Programmation_oritente_objet_et_BDD\\POO\\Tp_graph\\graph.html";
        graph.saveToHTMLFile(filePath);
        System.out.println("\nLe graphe a été sauvegardé dans le fichier " + filePath);
    }
}
