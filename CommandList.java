package scl.edu.gt;

public class CommandList {
	
	String command 		[] = new String [12];
	String information  [] = new String [12];
	
	CommandList() {
		//MATRIZ DE OPCIONES
		command[0]= "suma";
		command[1]= "resta";
		command[2]= "multiplicacion";
		command[3]= "division";
		command[4]= "residuo";
		command[5]= "Informatica";
		command[6]= "Hardware";
		command[7]= "Software";
		command[8]= "CPU";
		command[9]= "Archivos DLL";
		command[10]= "help";	
		command[11]= "exit";

	
		//DEFINICIONES DE LOS COMANDOS ARITMETICOS
		information [0]="El comando puede realizar la suma de dos \n números ya sean enteros o decimales.";
		information [1]="El comando puede realizar la resta de dos \n números ya sean enteros o decimales.";
		information [2]="El comando puede realizar la multiplicacion \n de dos números ya sean enteros o decimales.";
		information [3]="El comando puede realizar la division de dos \n números ya sean enteros o decimales.";
		information [4]="El comando puede calcular el residuo de dos \n números ya sean enteros o decimales.";
		information [5]="Este comando despliega información acerca \n de la informatica";
		information [6]="Este comando despliega informacion acerca \n del Hardware";
		information [7]="Este comando despliega informacion acerca \n del Software";
		information [8]="Este comadno despliega informacion acerca \n del CPU";
		information [9]="Este comando despliega información acerca \n de los archivos DLL";
		information [10]="Este comando te muestra todos los comandos \n disponibles";
		information [11]="Este comando detiene el programa";
		
		

		
	}
	
	
}

