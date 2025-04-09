public class auto extends vehiculo{
    private int numeropuertas;

    public auto(String marca, String modelo, int año, int preciobase, int placa, int numeropuertas) {
        super(marca, modelo, año, preciobase, placa);
        this.numeropuertas = numeropuertas;
    }

    public int getNumeropuertas() {
        return numeropuertas;
    }

    public void setNumeropuertas(int numeropuertas) {
        this.numeropuertas = numeropuertas;
    }
    public double calcularpreciofinal(){
        return preciobase + (preciobase * 0.10);
    }

    @Override
    public String toString() {
        return "auto{" +
                "numeropuertas=" + numeropuertas +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", preciobase=" + preciobase +
                ", placa=" + placa +
                '}';
    }
}
