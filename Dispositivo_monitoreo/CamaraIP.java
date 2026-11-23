public class CamaraIP extends DispositivoMonitoreo {
    private int resolucionMP;

    public CamaraIP(String codigo, String ubicacion, int resolucionMP) {
        super(codigo, ubicacion);
        this.resolucionMP = resolucionMP;
    }

    public int getResolucionMP() {
        return resolucionMP;
    }

    public void setResolucionMP(int resolucionMP) {
        this.resolucionMP = resolucionMP;
    }

    @Override
    public void activarAlerta() {
        System.out.println("Cámara " + codigo + " (" + resolucionMP + "MP) en " + ubicacion
                + ": Grabando video y enviando captura al servidor.");
    }
}