package scl.edu.gt;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*MENSAJE INICIAL DEL PROGRAMA*/
		img inicio= new img();
		inicio.Mensaje();
		
		
		/**ESTADO DEL PROGRAMA**/
		boolean on = true;
		
		/*INICIO DEL PROGRAMA*/
		do {
			
			/*SOLICITANDO UN COMANDO*/
			Scanner inputCommand = new Scanner(System.in);
			System.out.println("");
			System.out.print("~$: ");
			String output = inputCommand.nextLine();
			
			/*INSTANCIAS DE CLASES*/
			CommandList dateCommand = new CommandList();
			ArithmeticFunctions fa = new ArithmeticFunctions();
			TemasSoftware temas = new TemasSoftware();
			Help help = new Help();
			
			
			if(output.equals(dateCommand.command[0])) {
				fa.sumar();	
			}else if (output.equals(dateCommand.command[1])) {
				fa.restar();	
			}else if (output.equals(dateCommand.command[2])) {
				fa.multiplicar();	
			}else if (output.equals(dateCommand.command[3])) {
				fa.dividir();			
			}else if (output.equals(dateCommand.command[4])) {
				fa.residuo();
			}else if (output.equals(dateCommand.command[5])) {
				temas.Informatica();
			}else if (output.equals(dateCommand.command[6])) {
				temas.Hardware();
			}else if (output.equals(dateCommand.command[7])) {
				temas.Software();
			}else if (output.equals(dateCommand.command[8])) {
				temas.CPU();;
			}else if (output.equals(dateCommand.command[9])) {
				temas.archivosDll();
			}else if (output.equals(dateCommand.command[10])) {
				help.CommandList();
			}else if (output.equals(dateCommand.command[11])) {
				on = false;
			}
			
			
			else {
				System.out.println("Comando no encontrado");
				System.out.println("Ingresa help para ver los comandos disponibles");
			}
		}while(on);
		
		
		System.out.println("Programa finalizado");

		
	}
}




