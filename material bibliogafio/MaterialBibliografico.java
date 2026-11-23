public abstract class MaterialBibliografico {

    // ==========================================
    // ATRIBUTOS
    // ==========================================
    protected String titulo;
    protected String autor;
    protected int anioPublicacion;
    protected boolean disponible;

    // ==========================================
    // CONSTRUCTORES
    // ==========================================
    public MaterialBibliografico(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.disponible = true;
    }

    // ==========================================
    // GETTERS
    // ==========================================
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    // ==========================================
    // SETTERS
    // ==========================================
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // ==========================================
    // MÉTODOS ABSTRACTOS
    // ==========================================
    public abstract String obtenerTipo();

    public abstract int calcularDiasPrestamo();

    // ==========================================
    // MÉTODOS CONCRETOS
    // ==========================================
    public boolean prestar() {
        if (!disponible) {
            System.out.println("No se puede prestar \"" + titulo + "\": ya está prestado.");
            return false;
        }
        disponible = false;
        System.out.println("Préstamo realizado: \"" + titulo + "\" por " + calcularDiasPrestamo() + " días.");
        return true;
    }

    public boolean devolver() {
        if (disponible) {
            System.out.println("El material \"" + titulo + "\" ya se encuentra disponible.");
            return false;
        }
        disponible = true;
        System.out.println("Devolución registrada: \"" + titulo + "\" ahora está disponible.");
        return true;
    }

    public void mostrarInformacion() {
        String estado = disponible ? "Disponible" : "Prestado";
        System.out.println("[" + obtenerTipo() + "] \"" + titulo + "\" - Autor: " + autor
                + " (" + anioPublicacion + ") | Préstamo: " + calcularDiasPrestamo() + " días"
                + " | Estado: " + estado);
    }
}