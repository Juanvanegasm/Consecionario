public class moto extends vehiculo{
    private int cilindraje;

    public moto(String marca, String modelo, int año, int preciobase, int placa, int cilindraje) {
        super(marca, modelo, año, preciobase, placa);
        this.cilindraje = cilindraje;
    }


    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public String toString() {
        return "moto{" +
                "cilindraje=" + cilindraje +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", preciobase=" + preciobase +
                ", placa=" + placa +
                '}';
    }

    public double calcularpreciofinal(){
        return preciobase + (preciobase * 0.10);


    }
}
