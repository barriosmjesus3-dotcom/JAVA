public class Main {
    public static void main(String[] args) {
        DispositivoMonitoreo[] dispositivos = new DispositivoMonitoreo[2];
        dispositivos[0] = new CamaraIP("CAM-01", "Entrada principal", 4);
        dispositivos[1] = new SensorMovimiento("SEN-02", "Patio trasero", 12.5);

        for (int i = 0; i < dispositivos.length; i++) {
            dispositivos[i].mostrarEstado();
            dispositivos[i].activarAlerta();
            System.out.println("------");
        }
        dispositivos[0].setActivo(false);
        System.out.println(dispositivos[0].mostrarEstado());
        dispositivos[0].activarAlerta();

    }
}