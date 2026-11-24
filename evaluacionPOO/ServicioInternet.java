public class ServicioInternet extends Servicio {
    private double limiteGb;
    private double costoGbAdicional;

    public ServicioInternet(
            String codigoContrato,
            String nombreTitular,
            double consumo,
            double tarifaBase,
            double limiteGb,
            double costoGbAdicional) {
        super(codigoContrato, nombreTitular, consumo, tarifaBase);
        if (limiteGb < 0 || costoGbAdicional < 0) {
            throw new IllegalArgumentException("El límite de GB y el costo adicional no pueden ser negativos.");
        }
        this.limiteGb = limiteGb;
        this.costoGbAdicional = costoGbAdicional;
    }

    public double getLimiteGb() {
        return limiteGb;
    }

    public double getCostoGbAdicional() {
        return costoGbAdicional;
    }

    @Override
    public double calcularTotalPagar() {
        double subtotal = tarifaBase;
        if (consumo > limiteGb) {
            double gbExcedentes = consumo - limiteGb;
            subtotal += gbExcedentes * costoGbAdicional;
        }
        return subtotal * 1.16; // 16% de impuesto
    }
}