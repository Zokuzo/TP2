public class Main {
    public static void main(String[] args) {

        pokemon pokemon1 = new pokemon(493, "Arceus", "Normal", 100, 120, 120, 120, 120, 120, 120);
        pokemon pokemon2 = new pokemon(1, "Charmander", "Fire", 1, 39, 52, 43, 60, 50, 65);

        System.out.println(pokemon1.toString());
        System.out.println("\n");
        System.out.println(pokemon2.toString());

        double dommageInflige = pokemon1.calculerDommage(pokemon2);
        System.out.println("\n "+ pokemon1.getName() +" inflige " + dommageInflige + " points de dommages à "+ pokemon2.getName() +"!");

        double dommageRecu = pokemon2.calculerDommage(pokemon1);
        System.out.println( pokemon2.getName() +" inflige " + dommageRecu + " points de dommages à "+ pokemon1.getName() +"!");

        if (pokemon1.getSpeed() > pokemon2.getSpeed()) {
            System.out.println("\n " + pokemon1.getName() +" attaque en premier grâce à sa vitesse plus élevée!");
        } else if (pokemon2.getSpeed() > pokemon1.getSpeed()) {
            System.out.println("\n"+ pokemon2.getName() +" attaque en premier grâce à sa vitesse plus élevée!");
        } else {
            System.out.println("\nLes deux Pokémon ont la même vitesse. L'attaque sera randomisée.");
        }
    }
}
