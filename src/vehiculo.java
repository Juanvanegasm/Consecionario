public class vehiculo {
    protected String marca, modelo;
    protected int año, preciobase, placa;

    public vehiculo() {
    }

    public vehiculo(String marca, String modelo, int año, int preciobase, int placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.preciobase = preciobase;
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getPreciobase() {
        return preciobase;
    }

    public void setPreciobase(int preciobase) {
        this.preciobase = preciobase;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", preciobase=" + preciobase +
                '}';
    }
}
