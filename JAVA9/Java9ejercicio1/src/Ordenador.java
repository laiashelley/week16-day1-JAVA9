public class Ordenador {
    
    // los ATRIBUTOS:

    private String marca;
    private String modelo;
    private int memoriaRam;
    private int capacidadDisco;
    private double precio;

    // el CONSTRUCTOR:

    public Ordenador(String marca, String modelo, int memoriaRam, int capacidadDisco, double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.capacidadDisco = capacidadDisco;
        this.precio = precio;
    }

    // los GETS:

    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public int getMemoriaRam(){
        return this.memoriaRam;
    }

    public int getCapacidadDisco(){
        return this.capacidadDisco;
    }

    public double getPrecio(){
        return this.precio;
    }

    // los SETS:

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setMemoriaRam(int memoriaRam){
        this.memoriaRam = memoriaRam;
    }

    public void setCapacidadDisco(int capacidadDisco){
        this.capacidadDisco = capacidadDisco;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    // el toString():

    @Override
    public String toString(){
        return "Marca: " + getMarca() + ", modelo: " + getModelo() + ", memoria RAM: " + getMemoriaRam() + ", capacidad de disco duro: " + getCapacidadDisco() + ", precio: " + getPrecio() + " dolares.";
    }

}
