public class App {
    public static void main(String[] args) {

        // Ejercicio 1: Mascota
        System.out.println("===== MASCOTAS =====");

        Mascota mascota1 = new Mascota("Firulais", "Perro", 3);
        Mascota mascota2 = new Mascota("Michi", "Gato", 2);

        mascota1.mostrarInfo();
        mascota2.mostrarInfo();

        
        // Ejercicio 2: Telefono
        System.out.println("===== TELEFONO =====");

        Telefono telefono = new Telefono("Samsung", "A15", 250.0);
        telefono.mostrarInfo();

        // Cambio de datos con setters
        telefono.setModelo("A16");
        telefono.setPrecio(300.0);   // precio valido
        telefono.mostrarInfo();

        telefono.setPrecio(-50);     // precio invalido
        telefono.mostrarInfo();      // el precio sigue en 300.0
    }

         
}