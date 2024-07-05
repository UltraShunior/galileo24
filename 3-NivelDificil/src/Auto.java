
public class Auto {
    private String marca;
    private String modelo;
    private int anio;
    private String placa;
    private double precioPorDia;
    private boolean disponible;

    public Auto(String marca, String modelo, int año, String placa, double precioPorDia) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = año;
        this.placa = placa;
        this.precioPorDia = precioPorDia;
        this.disponible = true;
    }

    // Getters
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAnio() { return anio; }
    public String getPlaca() { return placa; }
    public double getPrecioPorDia() { return precioPorDia; }
    public boolean isDisponible() { return disponible; }

    // Setter para cambiar la disponibilidad del auto
    public void setDisponible(boolean disponible) { this.disponible = disponible; }

    public void mostrarAuto() {
        System.out.println("Auto disponible: " + isDisponible());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Año: " + getAnio());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Precio por dia: " + getPrecioPorDia());
    }
}
