public class Alquiler {
    private String placaAuto;
    private String documentoCliente;
    private String fechaInicio;
    private String fechaFin;

    public Alquiler(String placaAuto, String documentoCliente, String fechaInicio, String fechaFin) {
        this.placaAuto = placaAuto;
        this.documentoCliente = documentoCliente;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    // Getters
    public String getPlacaAuto() { return placaAuto; }
    public String getDocumentoCliente() { return documentoCliente; }
    public String getFechaInicio() { return fechaInicio; }
    public String getFechaFin() { return fechaFin; }
}
