public abstract class vehicule {

    protected double Avg_speed;

    public vehicule(double Avg_speed) {
        this.Avg_speed = Avg_speed;
    }

    public double getAvg_speed() {
        return Avg_speed;
    }

    public void setAvg_speed(double Avg_speed) {
        this.Avg_speed = Avg_speed;
    }

    public abstract double calculate_travel_time(double distance);

}
