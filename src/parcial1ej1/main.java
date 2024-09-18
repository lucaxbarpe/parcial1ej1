package parcial1ej1;

import javax.swing.JOptionPane;

class main {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "bienvenido a la clinica veterinaria amigos peludos" + "\n" 
		+ "acontinuacion le pediremos que ingrese los datos de su mascota para acceder al sistema");
		String nombremascota = null;
		String dueñomascota = null;
		int edadmascota = 0;
		String consulta = null;
		do {
			nombremascota = JOptionPane.showInputDialog("como es el nombre de su mascota");
			edadmascota = Integer.parseInt(JOptionPane.showInputDialog("cual es la edad de " + nombremascota));
			dueñomascota = JOptionPane.showInputDialog("quien es el dueño de " + nombremascota);
			
		} while (nombremascota.isEmpty() || dueñomascota.isEmpty() || edadmascota <= 0);
		
		
		Mascota mascota1 = new Mascota(nombremascota, dueñomascota, edadmascota);
		JOptionPane.showMessageDialog(null, "bienvenido/a a la veterinaria ¡" + mascota1.getNombre() + "!" + "\n" + "edad = " + mascota1.getEdad() + "\n" + "dueño = " + mascota1.getPropietario());
		
		
		
		int opcion = 0;
	
		do {

			opcion = Integer.parseInt(JOptionPane.showInputDialog("elija una opcion" + "\n" +"0 = ver a su mascota en el sistema"
					+ "\n" + "1 para hacer un control general de su mascota" + "\n" + "2 para controlar si tiene la nueva vacuna contra el VR2024" + 
							"\n" + "3 para salir" ));
			
			switch (opcion) {
			case 0:
				JOptionPane.showMessageDialog(null, "nombre = " + mascota1.getNombre() + "\n" + "edad = " + mascota1.getEdad() + "\n" + "dueño = " + mascota1.getPropietario());
				break;
			case 1:
				mascota1.Revisioncardiaca();
				mascota1.Revisionsanguinea();
				mascota1.Vacunascompletas();
				mascota1.Generarticket();
				mascota1.Reinicio();
				break;
			case 2:
				mascota1.Vacunascompletas();
				mascota1.Generarticket();
				mascota1.Reinicio();
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "chau muchas gracias por confiar en nosotros");
				break;

			default:
				break;
			}
		} while (opcion != 3);
	
		mascota1.Generarticket();
	
	}
}
