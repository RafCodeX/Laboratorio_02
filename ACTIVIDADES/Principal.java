public class Principal {
    public static void main(String[] args) {
        // **BOLSA DE CHOCOLATINAS**
        Bolsa<Chocolatina> bolsaCho = new Bolsa<Chocolatina>(10);
        
        // Crear y agregar Chocolatinas
        Chocolatina c1 = new Chocolatina("Milka");
        Chocolatina c2 = new Chocolatina("Ferrero");
        Chocolatina c3 = new Chocolatina("Snickers");
        bolsaCho.add(c1);
        bolsaCho.add(c2);
        bolsaCho.add(c3);

        // Mostrar contenido de la bolsa de Chocolatinas
        System.out.println("Contenido de la bolsa de Chocolatinas:");
        for (Chocolatina chocolatina : bolsaCho) {
            System.out.println(chocolatina.getMarca());
        }

        // **BOLSA DE GOLOSINAS**
        Bolsa<Golosina> bolsaGol = new Bolsa<Golosina>(10);

        // Crear y agregar Golosinas
        Golosina g1 = new Golosina("Caramelo", 5.0);
        Golosina g2 = new Golosina("Gomita", 3.0);
        Golosina g3 = new Golosina("Chicle", 2.5);
        bolsaGol.add(g1);
        bolsaGol.add(g2);
        bolsaGol.add(g3);

        // Mostrar contenido de la bolsa de Golosinas
        System.out.println("\nContenido de la bolsa de Golosinas:");
        for (Golosina golosina : bolsaGol) {
            System.out.println(golosina.getNombre() + " - " + golosina.getPeso() + "g");
        }
    }
}

