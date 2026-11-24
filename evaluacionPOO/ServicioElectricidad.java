public class ServicioElectricidad extends Servicio {
    private double costoPorKwh;
    private double cargoMantenimiento;
    private String tipoCategoria;

    public ServicioElectricidad(
            String codigoContrato,
            String nombreTitular,
            double consumo,
            double tarifaBase,
            double costoPorKwh,
            double cargoMantenimiento,
            String tipoCategoria) {
        super(codigoContrato, nombreTitular, consumo, tarifaBase);
        if (costoPorKwh < 0 || cargoMantenimiento < 0) {
            throw new IllegalArgumentException("El costo por kWh y el cargo de mantenimiento no pueden ser negativos.");
        }
        if (tipoCategoria == null) {
            throw new IllegalArgumentException("La categoría no puede ser nula.");
        }

        String categoriaNormalizada = tipoCategoria.trim().toUpperCase();
        if (!categoriaNormalizada.equals("RESIDENCIAL") && !categoriaNormalizada.equals("COMERCIAL")) 
            {throw new IllegalArgumentException("Categoría inválida. Use 'RESIDENCIAL' o 'COMERCIAL'.");}

        this.costoPorKwh = costoPorKwh;
        this.cargoMantenimiento = cargoMantenimiento;
        this.tipoCategoria = categoriaNormalizada;
    }

    public double getCostoPorKwh() {
        return costoPorKwh;
    }

    public double getCargoMantenimiento() {
        return cargoMantenimiento;
    }

    public String getTipoCategoria() {
        return tipoCategoria;
    }

    @Override
    public double calcularTotalPagar() {
        double subtotal = (consumo * costoPorKwh) + cargoMantenimiento;

        if (tipoCategoria.equals("RESIDENCIAL")) {
            return subtotal * 0.90; // 10% de descuento
        } else {
            return subtotal * 1.15; // 15% de recargo
        }
    }
}