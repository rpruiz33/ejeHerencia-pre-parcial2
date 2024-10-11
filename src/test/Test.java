package test;

import modelo.Moto;
import modelo.Sistema;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sistema sistema=new Sistema();
		System.out.println(sistema.agregarMoto("Ford","f1", 1993, 2, 0.1, true, true));
		System.out.println(sistema.agregarMoto("Ford","f3", 1993, 2, 0.1, true, true));
		System.out.println(sistema.agregarAuto("Opel", "f2", 1995, 4, 0.8, 2));	
		System.out.println(sistema.agregarAuto("Fiat", "f4", 1996, 4, 0.8, 4));
		System.out.println(sistema.getLstVehiculos());
		System.out.println("-------------------------");
		System.out.println(sistema.traerVehiculo("Ford","f1").aniosAntiguedad());
		System.out.println(sistema.traerVehiculo("Ford","f1").calcularConsumo(100));
		System.out.println("-------------------------");
		System.out.println(sistema.traerVehiculosPorConsumo(10, 100));
	}

}
