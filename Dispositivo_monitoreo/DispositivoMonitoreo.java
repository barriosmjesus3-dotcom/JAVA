public abstract class DispositivoMonitoreo {
    /* ATRIBUTOS */
    protected String codigo;
    protected String ubicacion;
    protected Boolean activo;

    /* CONSTRUCTOR */
    public DispositivoMonitoreo(String codigo, String ubicacion) {
        this.codigo = codigo;
        this.ubicacion = ubicacion;
        this.activo = true;
    }

    /* GETTERS Y SETTERS */
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public boolean isActivo() {
        return Boolean.TRUE.equals(this.activo);
    }

    
    public String mostrarEstado() {
        String estado = "Inactivo y no permite alertas";
        if (isActivo()) {
            estado = "Activo";
        }

        return "Dispositivo de Monitoreo codigo =" + codigo
                + ", ubicacion =" + ubicacion
                + ", estado =" + estado + "";
    }
    public abstract void activarAlerta();
}