public class velo extends vehicule {

    public velo() {
        super(15);
    }

    @Override
    public double calculate_travel_time(double distance) {
        return distance / this.Avg_speed;
    }
}
