import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MaterialBibliografico> catalogo = new ArrayList<>();

        catalogo.add(new Libro("El hombre más rico de Babilonia", "George S. Clason", 1926, 192, "Finanzas personales"));
        catalogo.add(new Libro("Hábitos atómicos", "James Clear", 2018, 328, "Desarrollo personal"));
        catalogo.add(new Libro("Noches blancas", "Fiódor Dostoyevski", 1848, 112, "Ficción / Clásico"));
        catalogo.add(new Libro("El principito", "Antoine de Saint-Exupéry", 1943, 96, "Fábula / Clásico"));
        catalogo.add(new Libro("No me puedes lastimar", "David Goggins", 2018, 364, "Biografía / Superación"));

        System.out.println("=== CATÁLOGO INICIAL ===");
        for (MaterialBibliografico material : catalogo) {
            material.mostrarInformacion();
        }

        System.out.println("\n=== PRÉSTAMOS Y DEVOLUCIONES ===");
        catalogo.get(0).prestar(); // El hombre más rico de Babilonia
        catalogo.get(1).prestar(); // Hábitos atómicos
        catalogo.get(0).prestar(); // Intento de prestar uno ya prestado
        catalogo.get(0).devolver(); // Devolución de El hombre más rico de Babilonia

        System.out.println("\n=== ESTADO ACTUAL DEL CATÁLOGO ===");
        for (MaterialBibliografico material : catalogo) {
            material.mostrarInformacion();
        }
    }
}