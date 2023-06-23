package calculadorDeNomina;

class SueldoBruto {
     private double horasTrabajo;
     private double horasExtra;

    public SueldoBruto(double horasTrabajo, double horasExtra) {
        this.horasTrabajo = horasTrabajo;
        this.horasExtra = horasExtra;
    }

    public double calcularSueldoBruto() {
        double sueldoBase = horasTrabajo * 72.87;
        double sueldoExtra = horasExtra * 25.96;
        return sueldoBase + sueldoExtra;
    }
}