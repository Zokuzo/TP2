public class Vertex {
    private String name;
    private double x;
    private double y;
    private int radius;
    private String cssClass;
    private String label;

    public Vertex(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.radius = 50;
        this.cssClass = "vertex-blue"; // Default class
        this.label = name;
    }

    public String getName() {
        return name;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public String getLabel() {
        return label;
    }

    public String getCssClass() {
        return cssClass;
    }

    public void setCssClass(String cssClass) {
        this.cssClass = cssClass;
    }

    @Override
    public String toString() {
        return "Vertex{" + "name='" + name + '\'' + ", x=" + x + ", y=" + y + '}';
    }
}
