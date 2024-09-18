public class Main {
    public static void main(String[] args) {

        vehicule[] tab = new vehicule[3];

        tab[0] = new voiture();
        tab[1] = new velo();
        tab[2] = new bateau();

        double distance = 150;

        for (vehicule vehicule : tab) {
            System.out.println(vehicule.getClass().getSimpleName() + " : Temps de trajet pour " + distance + " km est de " + vehicule.calculate_travel_time(distance) + " heures.");
        }
    }
}
