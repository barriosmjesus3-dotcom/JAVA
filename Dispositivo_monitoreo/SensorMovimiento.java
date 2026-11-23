public class SensorMovimiento extends DispositivoMonitoreo {
    private double rangoMetros;

    public SensorMovimiento(String codigo, String ubicacion, double rangoMetros) {
        super(codigo, ubicacion);
        this.rangoMetros = rangoMetros;
    }

    public double getRangoMetros() {
        return rangoMetros;
    }

    public void setRangoMetros(double rangoMetros) {
        this.rangoMetros = rangoMetros;
    }

    @Override
    public void activarAlerta() {
        System.out.println("Sensor " + codigo + " (rango " + rangoMetros + "m) en " + ubicacion
                + ": ¡Movimiento detectado! Activando sirena local.");
    }
}