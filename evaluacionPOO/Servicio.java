public abstract class Servicio {
    protected String codigoContrato;
    protected String nombreTitular;
    protected double consumo;
    protected double tarifaBase;

    public Servicio(String codigoContrato, String nombreTitular, double consumo, double tarifaBase) {
        if (codigoContrato == null || codigoContrato.isBlank()) {
            throw new IllegalArgumentException("El código de contrato no puede estar vacío.");
        }
        if (nombreTitular == null || nombreTitular.isBlank()) {

            throw new IllegalArgumentException("El nombre del titular no puede estar vacío.");
        }
        if (consumo < 0) {
            throw new IllegalArgumentException("El consumo no puede ser negativo.");
        }
        if (tarifaBase < 0) {
            throw new IllegalArgumentException("La tarifa base no puede ser negativa.");
        }

        this.codigoContrato = codigoContrato;
        this.nombreTitular = nombreTitular;
        this.consumo = consumo;
        this.tarifaBase = tarifaBase;
    }

    public String getCodigoContrato() {
        return codigoContrato;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public double getConsumo() {
        return consumo;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public abstract double calcularTotalPagar();

    public void mostrarResumen() {
    
        System.out.println("Tipo de Servicio : " + getClass().getSimpleName());
        System.out.println("Código Contrato  : " + codigoContrato);
        System.out.println("Titular          : " + nombreTitular);
        System.out.println("Consumo          : " + consumo);
        System.out.println("Tarifa Base      : $" + tarifaBase);
        System.out.println("Total a Pagar    : $" + calcularTotalPagar());
        System.out.println("\n");
    }
}