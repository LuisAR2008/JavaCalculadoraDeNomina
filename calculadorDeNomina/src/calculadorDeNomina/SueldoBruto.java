package calculadorDeNomina;

class SueldoNeto {
    private double sueldoBruto;

    public SueldoNeto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public double calcularSueldoNeto() {
        double impuesto;
        if (sueldoBruto < 2000) {
            impuesto = sueldoBruto * 0.16;
        } else {
            impuesto = sueldoBruto * 0.18;
        }
        return sueldoBruto - impuesto;
    }
}