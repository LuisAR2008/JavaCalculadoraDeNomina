package calculadorDeNomina;

import java.util.Scanner;

public class TestNomina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el puesto del empleado:");
        String puesto = entrada.nextLine();

        System.out.println("Ingrese las horas de trabajo del empleado:");
        double horasTrabajo = entrada.nextDouble();

        System.out.println("Ingrese las horas extra del empleado:");
        double horasExtra = entrada.nextDouble();

        SueldoBruto sueldoBruto = new SueldoBruto(horasTrabajo, horasExtra);
        double sueldoBrutoCalculado = sueldoBruto.calcularSueldoBruto();

        SueldoNeto sueldoNeto = new SueldoNeto(sueldoBrutoCalculado);
        double sueldoNetoCalculado = sueldoNeto.calcularSueldoNeto();

        System.out.println("Puesto: " + puesto);
        System.out.println("Horas de trabajo: " + horasTrabajo);
        System.out.println("Horas extra: " + horasExtra);
        System.out.println("Sueldo bruto: $" + sueldoBrutoCalculado);
        System.out.println("Sueldo neto: $" + sueldoNetoCalculado);

       
	}

}


/* Calcula Nomina,
ingres el puesto y sueldo del empleado
ingresar sus horas de trabajo, se le debe de pagar 72.87 hora.
ingresar tiempo extra y se la va a pagar a 25.96 hora
mostar el sueldo bruto
Si el sueldo bruto es inferior a 2000 hacer un descuento de 16% de impuesto
si es mayor a 2000 aplicar el 18% de descuento
mostrar el sueldo neto

pedir puesto
calcular sueldoBase = horasTrabajadas * 72.87
ingresar tiempo extra
calcular tiempoExtra= horaExtra*25.96
mostrar sueldoBruto = sueldoBase + tiempoExtra

calcular impuesto
     si sueldoBruto =< 2000 
        impuesto = sueldoBruto *0.16
     si sueldoBruto > 2000
        impuesto = sueldoBruto * 0.18
        
 calcular sueldoNeto = impuesto  + sueldoBruto       


*/