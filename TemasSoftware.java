package scl.edu.gt;

public class TemasSoftware {

	public static void Informatica () {

		//ARREGLO DE INFORMACION DE INFORMATICA
		//DEFINICION DE ARREGLO
		
		String informacion [] = new String [5];
		
		informacion[0]= "\nLa inform�tica o computaci�n es la ciencia que estudia \nlos m�todos y t�cnicas para almacenar, procesar y \ntransmitir informaci�n de manera automatizada, y m�s \nespec�ficamente, en formato digital empleando sistemas \ncomputarizados.";
		informacion[1]= "\n�PARA QU� SIRVE?\n";
		informacion[2]= "La inform�tica tiene como prop�sito clave el almacenamiento \ny la recuperaci�n de informaci�n, lo cual ha sido una de \nlas preocupaciones clave de la humanidad desde el inicio \nde los tiempos. En ese sentido, el primer sistema de \nalmacenamiento fue la escritura misma, que permit�a codificar \nmensajes y recuperarlos luego a trav�s de marcas sobre una \nsuperficie.";
		informacion[3]= "\nIMPORTANCIA DE LA INFORMATICA\n";
		informacion[4]= "La importancia de la inform�tica hoy en d�a no podr�a ser \nm�s evidente. En un mundo hipertecnologizado e hiperconectado, \nla informaci�n se ha convertido en uno de los activos m�s \npreciados el mundo, y los complejos sistemas inform�ticos que \nhemos construido nos permiten administrarlo de manera m�s \nveloz y eficiente que nunca antes en la historia.";
		
		System.out.println(" _________________");
		System.out.println("|   INFORMATICA   | ");
		System.out.println("|_________________| ");
		
		for (int i=0; i<informacion.length;i++) {
			System.out.println(informacion[i]);
		}	
	}
	
	public static void Hardware() {
		
		//Definicion arreglo para informacion de Hardware
		
		String infoHardware[] = new String[6];
		
		infoHardware[0]="\nEn computaci�n e inform�tica, se conoce como hardware\n(uni�n de los vocablos del ingl�s hard, r�gido, y\nware, producto, mercanc�a) al total de los\nelementos materiales, tangibles, que forman al sistema\ninform�tico de una computadora u ordenador. Esto se\nrefiere a sus componentes de tipo mec�nico, electr�nico,\nel�ctrico y perif�rico, sin considerar los programas\ny otros elementos digitales, que forman en cambio\nparte del software.";
		infoHardware[1]="\nExisten cuatro generaciones distintas de hardware, a\nlo largo de su historia evolutiva, determinadas por\nun adelanto tecnol�gico clave que las hizo\nposible:";
		infoHardware[2]="\n� 1era generaci�n (1945-1956). M�quinas de c�lculo que\n  operaban mediante tubos al vac�o, en lugar de rel�s.";
		infoHardware[3]="\n� 2da generaci�n (1957-1963). Gracias al descubrimiento\n  de los transistores, se redujo enormemente el tama�o\n  total de los computadores.";
		infoHardware[4]="\n� 3era generaci�n (1964-hoy). Se descubren los circuitos\n  integrados, impresos en pastillas de silicio, lo\n  cual brind� rapidez y efectividad.";
		infoHardware[5]="\n� 4ta generaci�n (futura). Dispositivos que superan las\n  placas de silicio e incursionan en nuevos formatos\n  computacionales. Se trata de tecnolog�a a�n\n  en desarrollo.";
		
		System.out.println(" _________________");
		System.out.println("|    HARDWARE     | ");
		System.out.println("|_________________| ");
		
		//Ciclo para lectura del arreglo
		
		for (int i=0;i<infoHardware.length;i++) {
			System.out.println(infoHardware[i]); //Mostrar informaci�n en consola sobre Hardware
	  }
   }
	public static void Software() {
		
		//Definicion arreglo para informacion de Hardware
		
		String infoSoftware[] = new String[8];
				
		infoSoftware[0]="\nEl t�rmino software es un vocablo ingl�s que fue tomado\npor otros idiomas y designa a todo componente\nintangible (y no f�sico) que forma parte de\ndispositivos como computadoras, tel�fonos m�viles\no tabletas y que permite su funcionamiento.";
		infoSoftware[1]="\nEl software est� compuesto por un conjunto de aplicaciones\ny programas dise�ados para cumplir diversas\nfunciones dentro de un sistema. Adem�s,\nest� formado por la informaci�n del usuario y los datos\nprocesados.";
		infoSoftware[2]="\nLos programas que forman parte del software le indican al\nhardware (parte f�sica de un dispositivo),\npor medio de instrucciones, los pasos a seguir.";
		infoSoftware[3]="\nTipos de software";
		infoSoftware[4]="\nLos softwares se clasifican seg�n su funci�n en:";
		infoSoftware[5]="\n� Softwares de sistema: Programas que dan al usuario\nla capacidad de relacionarse con el sistema, para\nejercer control sobre el hardware. El software\nde sistema tambi�n se ofrece como soporte para\notros programas. Por ejemplo: sistemas operativos\no servidores.";
		infoSoftware[6]="\n� Softwares de programaci�n: Programas dise�ados como\nherramientas que le permiten a un programador\ndesarrollar programas inform�ticos. Se valen de\nt�cnicas y un lenguaje de programaci�n espec�fico. Por\nejemplo: compiladores o editores multimedia.";
		infoSoftware[7]="\n� Softwares de aplicaci�n: Programas dise�ados para\nrealizar una o m�s tareas espec�ficas a la vez, pueden\nser autom�ticos o asistidos. Por ejemplo: videojuegos\no reproductores multimedia.";
				
		System.out.println(" _________________");
		System.out.println("|    SOFTWARE     | ");
		System.out.println("|_________________| ");
				
				
		//Ciclo para lectura del arreglo
				
		for (int i=0;i<infoSoftware.length;i++) {
					System.out.println(infoSoftware[i]); //Mostrar informaci�n en consola sobre Software
		}
	}
	
	public static void CPU() {
		
		String infoCPU[] = new String[17];
		
		infoCPU[0]="\nCPU es la abreviaci�n de Unidad Central de Procesamiento, un\ncomponente b�sico de todo dispositivo que procesa datos y\nrealiza c�lculos matem�ticos-inform�ticos.";
		infoCPU[1]="\nEl CPU proporciona la capacidad de programaci�n y, junto con\nla memoria y los dispositivos de entrada/salida, es uno de\nlos componentes presentes en la historia de los ordenadores.\nCon el tiempo, los microprocesadores de un chip fueron\nreemplazando a los CPU, usualmente cuando se hace referencia\na este t�rmino se habla de los microprocesadores.";
		infoCPU[2]="\nAlgunas de las funciones b�sicas del CPU son recolectar\ninformaci�n, decodificarla en partes menores y llevar a cabo\ninstrucciones, que luego ejecuta.";
		infoCPU[3]="\n�Para qu� sirve un CPU?";
		infoCPU[4]="\nEl CPU es la pieza fundamental de todo dispositivo, es consi-\nderado el cerebro de un sistema. En primer lugar, es el\nencargado de recibir e interpretar datos y ejecutar las secu-\nencias de instrucciones a realizar por cada programa\nvali�ndose de operaciones aritm�ticas y matem�ticas. El CPU\ninterpreta todos los datos que provienen del dispositivo,\ntanto de los programas como la informaci�n que env�a\nel usuario a trav�s de aplicaciones.";
		infoCPU[5]="\nAdem�s, controla el buen funcionamiento de cada componente del\nsistema para que todas las acciones sean realizadas en\ntiempo y forma.";
		infoCPU[6]="\nPartes del CPU:";
		infoCPU[7]="\nUn CPU est� compuesto internamente de los siguientes componentes:";
		infoCPU[8]="\n* N�cleo. Es la unidad base que constituye a un CPU, que interpreta\n  y ejecuta acciones. Originariamente los procesadores\n  solo ten�an uno (single core), pero actualmente lo m�nimo\n  es dos.";
		infoCPU[9]="\n* Unidad de control. Es un circuito digital que extrae la instru-\n  cci�n de la memoria, la descifra y la ejecuta.";
		infoCPU[10]="\n* Unidad aritm�tica l�gica. Es un circuito digital que lleva a cabo\n  las operaciones l�gicas, matem�ticas y aritm�ticas entre\n  los datos.";
		infoCPU[11]="\n* Unidad de coma flotante. Es un componente especializado en el\n  c�lculo de operaciones con coma flotante.";
		infoCPU[12]="\n* Memoria cach�. Es la memoria en la que se almacenan los datos que\n  el usuario consulta con frecuencia, esto permite ganar\n  velocidad al procesador.";
		infoCPU[13]="\n* Registros. Es una memoria de alta velocidad que permite controlar\n  y almacenar las instrucciones en ejecuci�n.";
		infoCPU[14]="\n* Controlador de memoria. Es un circuito que puede estar integrado\n  al procesador y que regula el flujo de datos entre el pro-\n  cesador y la memoria.";
		infoCPU[15]="\n* Bus. Es un sistema digital que env�a y recibe datos entre los\n  componentes.";
		infoCPU[16]="\n* Tarjeta gr�fica. Es el componente que procesa los datos de video\n  e imagen, que puede estar incluido o no en el CPU.";
		
		System.out.println(" _________________");
		System.out.println("|       CPU       | ");
		System.out.println("|_________________| ");
		
		for (int i=0;i<infoCPU.length;i++) {
			System.out.println(infoCPU[i]); //Mostrar informaci�n en consola sobre el CPU
		}
	}
	
	public static void archivosDll () {
		
		String info [] = new String [4];
		
		info[0]= "\nLos archivos DLL, siglas por su nombre en \ningl�s Dynamic Link Library, conocidos en \nespa�ol como Bibliotecas de Enlaces Din�micos,\nconsisten en una serie de archivos que constan \nde c�digo ejecutable y dem�s partes de una app, \nlos cuales hacen posible la utilizaci�n de las \naplicaciones que tenemos instaladas en la PC.";
		info[1]= "\nCuando ordenemos a nuestro equipo a ejecutar \nun programa, sin que nosotros lo notemos, el \nsistema operativo carga autom�ticamente la \nlibrer�a DLL correspondientes para que la \naplicaci�n o funci�n incluida de la app se \nejecute.";
		info[2]= "\n�PARA QU� SIRVEN LOS ARCHIVOS DLL";
		info[3]= "\nUna de las m�s importantes ventajas que nos \nofrecen los archivos DLL o librer�as de enlace \ndin�mico, es que gracias a su implementaci�n \nse ha logrado reducir notablemente el tama�o \nde los archivos ejecutables de las aplicaciones, \nya que una gran porci�n de los c�digos \nejecutables de los programas pueden ser \nalmacenados en estos archivos DLL, como por \nejemplo gr�ficos, audio, texto, tipograf�a y \ntodos los dem�s elementos que utiliza la app, \npor lo que se obtiene una mayor organizaci�n \nde los procesos, que brinda como resultado un \nmejor rendimiento de la app, y por lo tanto \ndel rendimiento general de la computadora.";
		
		System.out.println(" _________________");
		System.out.println("|   ARCHIVOS DLL  | ");
		System.out.println("|_________________| ");
		
		
		for (int i=0; i<info.length; i++) {
			System.out.println(info[i]);
		}
	}
	
	
	
}
