package scl.edu.gt;

public class img {

	public static void Mensaje() {
			
		System.out.println("         /\\/\\    ________  _________   /\\/\\    ");
		System.out.println("         \\(\\(   /  _____/ /   _____/   \\(\\(    ");
		System.out.println("               /   \\  ___ \\_____  \\            ");
		System.out.println("               \\    \\_\\  \\/        \\           ");
		System.out.println("      /\\  /\\    \\______  /_______  /    /\\  /\\ ");
		System.out.println("      \\/  \\/           \\/        \\/     \\/  \\/ ");
		System.out.println("          ______   ______   ______   ______    ");
		System.out.println("         /_____/  /_____/  /_____/  /_____/    ");
		System.out.println(" ________________________________________________________");
	//	System.out.println("Si usted esta utilizando el programa por \nprimera vez ingrese la palabra: help para \nver los comandos que puede utilizar");
	//	System.out.println(" ____________________________________________");
		 
	
	CommandList comandos = new CommandList();
			 
			System.out.println("        ¨°o.O( COMANDOS QUE PUEDE UTILIZAR )O.o° \n");
			
			for (int i=0;i<comandos.command.length;i++) {
				
				if(i<=4) {
					System.out.print(" • "+comandos.command[i]+"");
										
				}else if(i>4 && i<=9) {
					
					if(i==5) {
						System.out.println("");
					}
					
					System.out.print(" • "+comandos.command[i]+"");
					
				}else if(i>9) {
					
					if (i==10) {
						System.out.println("");
					}
					
					System.out.print(" • "+comandos.command[i]+"");
				}
			}
		
			System.out.println("");
			System.out.println("\n      Para ejecutar el comando tecle nombre y luego ");
			System.out.println("        presione Enter. Ejemplo: suma + Enter");
			System.out.println(" ________________________________________________________");
	
		
	}
}
