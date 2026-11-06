public class App {
    public static void main(String[] args) {

        // Ejercicio 1: Mascota
        System.out.println("===== MASCOTAS =====");

        Mascota mascota1 = new Mascota("Firulais", "Perro", 3);
        Mascota mascota2 = new Mascota("Michi", "Gato", 2);

        mascota1.mostrarInfo();
        mascota2.mostrarInfo();
    }
}