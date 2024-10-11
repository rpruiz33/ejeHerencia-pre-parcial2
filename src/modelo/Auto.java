package modelo;

import java.time.LocalDate;

public class Auto extends Vehiculo {
private int cantPuertas;

public int getCantPuertas() {
	return cantPuertas;
}

public void setCantPuertas(int cantPuertas) {
	this.cantPuertas = cantPuertas;
}

@Override
public int aniosAntiguedad() {
	LocalDate a=LocalDate.now();
	return a.getYear()-this.anio;
	
}



@Override
public double calcularConsumo(int km) {
	double resul=0;
	if(eficienciaMotor>0.1 && eficienciaMotor<0.9) {
	resul=  (km*this.eficienciaMotor);
	}
	return resul;
}

public Auto(int idVehiculo, String marca, String modelo, int anio, int cantRuedas, double eficienciaMotor,
		int cantPuertas) {
	super(idVehiculo, marca, modelo, anio, cantRuedas, eficienciaMotor);
	this.cantPuertas = cantPuertas;
}

@Override
public String toString() {
	return "\nAuto [cantPuertas=" + cantPuertas + ", idVehiculo=" + idVehiculo + ", marca=" + marca + ", modelo=" + modelo
			+ ", anio=" + anio + ", cantRuedas=" + cantRuedas + ", eficienciaMotor=" + eficienciaMotor
			+ ", getCantPuertas()=" + getCantPuertas() + ", aniosAntiguedad()=" + aniosAntiguedad()
			+ ", getEficienciaMotor()=" + getEficienciaMotor() + "]";
}







}
