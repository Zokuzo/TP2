public class voiture extends vehicule {

    public voiture() {
        super(100);
    }

    @Override
    public double calculate_travel_time(double distance) {
        return distance / this.Avg_speed;
    }
}
