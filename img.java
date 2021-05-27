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
			System.out.println("Si necesita conocer mas detalle de cada comando tecle help");
			System.out.println(" ________________________________________________________");
			
		
	}
}
