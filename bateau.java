public class bateau extends vehicule {

    public bateau() {
        super(40);
    }

    @Override
    public double calculate_travel_time(double distance) {
        return distance / this.Avg_speed;
    }
}
