public class Libro extends MaterialBibliografico {
    private int numeroPaginas;
    private String genero;

    public Libro(String titulo, String autor, int anioPublicacion, int numeroPaginas, String genero) {
        super(titulo, autor, anioPublicacion);
        this.numeroPaginas = numeroPaginas;
        this.genero = genero;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String obtenerTipo() {
        return "Libro";
    }

    @Override
    public int calcularDiasPrestamo() {
        return 21;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("   Género: " + genero + " | Páginas: " + numeroPaginas);
    }
}