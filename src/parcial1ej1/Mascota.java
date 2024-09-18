package parcial1ej1;

import javax.swing.JOptionPane;

public class Mascota {

	private String nombre;
	private String propietario;
	private int edad;
	private int cobro = 0;
	public Mascota(String nombre, String propietario, int edad) {
		super();
		this.nombre = nombre;
		this.propietario = propietario;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
		
	public int getCobro() {
		return cobro;
	}
	public void setCobro(int cobro) {
		this.cobro = cobro;
	}
	
	
	public void Revisioncardiaca() {
		int estadocardiaco = (int)(Math.random()*10);
		if(estadocardiaco > 3) {
			JOptionPane.showMessageDialog(null, "cardiacamente su mascota se encuentra en buenas condiciones");
		} else {
			JOptionPane.showMessageDialog(null, "su mascota esta teniendo problemas caridacos, los medicamentos saldran $700");
			this.cobro += 700;
		}
		System.out.println(estadocardiaco);
	}
	
	
	public void Revisionsanguinea() {
		int estadosangre = (int)(Math.random()*10);
		if(estadosangre > 3) {
			JOptionPane.showMessageDialog(null, "los resultados del analisis de sangre no presentan irregularidades, su mascota se encuentra en un estado optimo");
		} else {
			JOptionPane.showMessageDialog(null, "su mascota presenta problemas en ciertos parametros sanguineos, los medicamentos costaran $1400");
			this.cobro += 1400;
		}
		System.out.println(estadosangre);
	}
		
	public void Vacunascompletas() {
		int tienevacunas = (int)(Math.random()*10);
		if(tienevacunas > 8) {
			JOptionPane.showMessageDialog(null, "su mascota tiene el historial de vacunacion completo y no necesita ningun refuerzo");
		} else {
			JOptionPane.showMessageDialog(null, "a su mascota le falta la vacuna contra la viruela VR2024 y es obligatoria debido a la alta probabilidad de contagio con humanos, el valor de la misma es de $800");
			this.cobro += 800;
		}
		System.out.println(tienevacunas);
	}
	
	public void Generarticket() {
		String	ticketfinal = "_____ticket final_____"+"\n" +
            	"mascota = " + this.getNombre() + "\n" +
            	"edad = " + this.getEdad() + " años" + "\n" +
            	"dueño " + this.getPropietario() + "\n" +
            	"____________________________________\n" +
            	"total de la consulta $" + this.getCobro() + "\n" +
            	"________________________________________";
		
		JOptionPane.showMessageDialog(null, ticketfinal);

	}
	
	public void Reinicio() {
	this.cobro = 0;
	}

}





