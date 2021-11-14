public class RealDollar {
    private double real;
    private double taxa;

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double calcularNota() {
        return Cambio.calcularNota(this.real, this.taxa);
    }
}
