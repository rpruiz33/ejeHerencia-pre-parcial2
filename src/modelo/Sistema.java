package modelo;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
private List<Vehiculo> lstVehiculos;





public List<Vehiculo> getLstVehiculos() {
	return lstVehiculos;
}





public void setLstVehiculos(List<Vehiculo> lstVehiculos) {
	this.lstVehiculos = lstVehiculos;
}





public Sistema() {
	super();
	this.lstVehiculos = new ArrayList<Vehiculo>();
}





public Vehiculo traerVehiculo(String marca, String modelo) {
	Vehiculo v=null;
	int i=0;
	while(i<lstVehiculos.size() && v==null) {
		if(lstVehiculos.get(i).getMarca().equals(marca)&&(lstVehiculos.get(i).getModelo().equals(modelo))) {
			v=lstVehiculos.get(i);
		}
		
		i++;
	}
	return v;
}

public boolean agregarAuto(String marca, String modelo, int anio, int cantRuedas, double eficienciaMotor, int cantPuertas) {
	Vehiculo v=traerVehiculo( marca, modelo);
	boolean flag=false;
	if(v==null) {
		int id=1;
		if(lstVehiculos.size()>0) {
			id=lstVehiculos.get(lstVehiculos.size()-1).getIdVehiculo()+1;
			
		}
		lstVehiculos.add(new Auto(id,marca,  modelo,anio,  cantRuedas,  eficienciaMotor,  cantPuertas));
		flag=true;
		
	}
	else {
		flag=true;
	}
	return flag;

}
public boolean agregarMoto(String marca, String modelo, int anio, int cantRuedas,double eficienciaMotor, boolean incluyeCaja, boolean disenioAerodinamico) {
	Vehiculo v=traerVehiculo( marca, modelo);
	boolean flag=false;
	if(v==null) {
		int id=1;
		if(lstVehiculos.size()>0) {
			id=lstVehiculos.get(lstVehiculos.size()-1).getIdVehiculo()+1;
			
		}
		lstVehiculos.add(new Moto(id ,marca,  modelo, anio,  cantRuedas,eficienciaMotor,  incluyeCaja,disenioAerodinamico));
		flag=true;	
	}
	else {
		flag=true;
	}
		
	

	return flag;

}

public List<Vehiculo> traerVehiculosDeTransporte() {
	List<Vehiculo> lista=new ArrayList<Vehiculo>();
	for(int i=0;i<lstVehiculos.size();i++) {
		if( ((Moto) lstVehiculos.get(i)).isIncluyeCaja() || lstVehiculos.get(i) instanceof Auto) {
			lista.add(lstVehiculos.get(i));
			
		}
	}
	
	return lista;
}



public List<Vehiculo> traerVehiculosPorConsumo(int km, double topeConsumo){
	
	List<Vehiculo> lista=new ArrayList<Vehiculo>();

for(int i=0;i<lstVehiculos.size();i++) {
	if(lstVehiculos.get(i) instanceof Moto) {
	double d=((Moto)lstVehiculos.get(i)).calcularConsumo(km);
	System.out.println("----"+d);

	if( d<topeConsumo) {
		lista.add(lstVehiculos.get(i));
	
	}	
	}


	if(lstVehiculos.get(i) instanceof Auto) {

	double x=((Auto)lstVehiculos.get(i)).calcularConsumo(km);
	System.out.println("----"+x);

	
	if(  x<topeConsumo) {
		lista.add(lstVehiculos.get(i));
	}
	

	
		
	}

	



}


	return lista;

	}
}
