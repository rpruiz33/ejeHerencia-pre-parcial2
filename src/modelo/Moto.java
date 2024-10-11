package modelo;

import java.time.LocalDate;

public class Moto extends Vehiculo {
private boolean incluyeCaja;

public Moto(int idVehiculo, String marca, String modelo, int anio, int cantRuedas, double eficienciaMotor,
		boolean incluyeCaja, boolean disenioAerodinamico) {
	super(idVehiculo, marca, modelo, anio, cantRuedas, eficienciaMotor);
	this.incluyeCaja = incluyeCaja;
	DisenioAerodinamico = disenioAerodinamico;
}


private boolean DisenioAerodinamico;
public boolean isIncluyeCaja() {
	return incluyeCaja;
}
public void setIncluyeCaja(boolean incluyeCaja) {
	this.incluyeCaja = incluyeCaja;
}
public boolean isDisenioAerodinamico() {
	return DisenioAerodinamico;
}
public void setDisenioAerodinamico(boolean disenioAerodinamico) {
	DisenioAerodinamico = disenioAerodinamico;
}
@Override
public int aniosAntiguedad() {
	LocalDate a=LocalDate.now();
	return a.getYear()-this.anio;
	} 


@Override
public double calcularConsumo(int km) {
	double resul=0;
	double efi=this.eficienciaMotor;
	if(isIncluyeCaja()) {
		efi=efi+0.3;
	}
	if(isDisenioAerodinamico()) {
		efi=efi-0.05;
	}

	
	if(efi>0.1 && efi<0.9) {
	resul=  (km*efi);
	}
	return resul;
	
}
@Override
public String toString() {
	return "\nMoto [incluyeCaja=" + incluyeCaja + ", DisenioAerodinamico=" + DisenioAerodinamico + ", idVehiculo="
			+ idVehiculo + ", marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", cantRuedas=" + cantRuedas
			+ ", eficienciaMotor=" + eficienciaMotor + "]";
}




}
