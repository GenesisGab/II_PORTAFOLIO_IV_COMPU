package scl.edu.gt;

public class TemasSoftware {

	public static void Informatica () {

		//ARREGLO DE INFORMACION DE INFORMATICA
		//DEFINICION DE ARREGLO
		
		String informacion [] = new String [5];
		
		informacion[0]= "\nLa informática o computación es la ciencia que estudia \nlos métodos y técnicas para almacenar, procesar y \ntransmitir información de manera automatizada, y más \nespecíficamente, en formato digital empleando sistemas \ncomputarizados.";
		informacion[1]= "\n¿PARA QUÉ SIRVE?\n";
		informacion[2]= "La informática tiene como propósito clave el almacenamiento \ny la recuperación de información, lo cual ha sido una de \nlas preocupaciones clave de la humanidad desde el inicio \nde los tiempos. En ese sentido, el primer sistema de \nalmacenamiento fue la escritura misma, que permitía codificar \nmensajes y recuperarlos luego a través de marcas sobre una \nsuperficie.";
		informacion[3]= "\nIMPORTANCIA DE LA INFORMATICA\n";
		informacion[4]= "La importancia de la informática hoy en día no podría ser \nmás evidente. En un mundo hipertecnologizado e hiperconectado, \nla información se ha convertido en uno de los activos más \npreciados el mundo, y los complejos sistemas informáticos que \nhemos construido nos permiten administrarlo de manera más \nveloz y eficiente que nunca antes en la historia.";
		
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
		
		infoHardware[0]="\nEn computación e informática, se conoce como hardware\n(unión de los vocablos del inglés hard, rígido, y\nware, producto, mercancía) al total de los\nelementos materiales, tangibles, que forman al sistema\ninformático de una computadora u ordenador. Esto se\nrefiere a sus componentes de tipo mecánico, electrónico,\neléctrico y periférico, sin considerar los programas\ny otros elementos digitales, que forman en cambio\nparte del software.";
		infoHardware[1]="\nExisten cuatro generaciones distintas de hardware, a\nlo largo de su historia evolutiva, determinadas por\nun adelanto tecnológico clave que las hizo\nposible:";
		infoHardware[2]="\n• 1era generación (1945-1956). Máquinas de cálculo que\n  operaban mediante tubos al vacío, en lugar de relés.";
		infoHardware[3]="\n• 2da generación (1957-1963). Gracias al descubrimiento\n  de los transistores, se redujo enormemente el tamaño\n  total de los computadores.";
		infoHardware[4]="\n• 3era generación (1964-hoy). Se descubren los circuitos\n  integrados, impresos en pastillas de silicio, lo\n  cual brindó rapidez y efectividad.";
		infoHardware[5]="\n• 4ta generación (futura). Dispositivos que superan las\n  placas de silicio e incursionan en nuevos formatos\n  computacionales. Se trata de tecnología aún\n  en desarrollo.";
		
		System.out.println(" _________________");
		System.out.println("|    HARDWARE     | ");
		System.out.println("|_________________| ");
		
		//Ciclo para lectura del arreglo
		
		for (int i=0;i<infoHardware.length;i++) {
			System.out.println(infoHardware[i]); //Mostrar información en consola sobre Hardware
	  }
   }
	public static void Software() {
		
		//Definicion arreglo para informacion de Hardware
		
		String infoSoftware[] = new String[8];
				
		infoSoftware[0]="\nEl término software es un vocablo inglés que fue tomado\npor otros idiomas y designa a todo componente\nintangible (y no físico) que forma parte de\ndispositivos como computadoras, teléfonos móviles\no tabletas y que permite su funcionamiento.";
		infoSoftware[1]="\nEl software está compuesto por un conjunto de aplicaciones\ny programas diseñados para cumplir diversas\nfunciones dentro de un sistema. Además,\nestá formado por la información del usuario y los datos\nprocesados.";
		infoSoftware[2]="\nLos programas que forman parte del software le indican al\nhardware (parte física de un dispositivo),\npor medio de instrucciones, los pasos a seguir.";
		infoSoftware[3]="\nTipos de software";
		infoSoftware[4]="\nLos softwares se clasifican según su función en:";
		infoSoftware[5]="\n• Softwares de sistema: Programas que dan al usuario\nla capacidad de relacionarse con el sistema, para\nejercer control sobre el hardware. El software\nde sistema también se ofrece como soporte para\notros programas. Por ejemplo: sistemas operativos\no servidores.";
		infoSoftware[6]="\n• Softwares de programación: Programas diseñados como\nherramientas que le permiten a un programador\ndesarrollar programas informáticos. Se valen de\ntécnicas y un lenguaje de programación específico. Por\nejemplo: compiladores o editores multimedia.";
		infoSoftware[7]="\n• Softwares de aplicación: Programas diseñados para\nrealizar una o más tareas específicas a la vez, pueden\nser automáticos o asistidos. Por ejemplo: videojuegos\no reproductores multimedia.";
				
		System.out.println(" _________________");
		System.out.println("|    SOFTWARE     | ");
		System.out.println("|_________________| ");
				
				
		//Ciclo para lectura del arreglo
				
		for (int i=0;i<infoSoftware.length;i++) {
					System.out.println(infoSoftware[i]); //Mostrar información en consola sobre Software
		}
	}
	
	public static void CPU() {
		
		String infoCPU[] = new String[17];
		
		infoCPU[0]="\nCPU es la abreviación de Unidad Central de Procesamiento, un\ncomponente básico de todo dispositivo que procesa datos y\nrealiza cálculos matemáticos-informáticos.";
		infoCPU[1]="\nEl CPU proporciona la capacidad de programación y, junto con\nla memoria y los dispositivos de entrada/salida, es uno de\nlos componentes presentes en la historia de los ordenadores.\nCon el tiempo, los microprocesadores de un chip fueron\nreemplazando a los CPU, usualmente cuando se hace referencia\na este término se habla de los microprocesadores.";
		infoCPU[2]="\nAlgunas de las funciones básicas del CPU son recolectar\ninformación, decodificarla en partes menores y llevar a cabo\ninstrucciones, que luego ejecuta.";
		infoCPU[3]="\n¿Para qué sirve un CPU?";
		infoCPU[4]="\nEl CPU es la pieza fundamental de todo dispositivo, es consi-\nderado el cerebro de un sistema. En primer lugar, es el\nencargado de recibir e interpretar datos y ejecutar las secu-\nencias de instrucciones a realizar por cada programa\nvaliéndose de operaciones aritméticas y matemáticas. El CPU\ninterpreta todos los datos que provienen del dispositivo,\ntanto de los programas como la información que envía\nel usuario a través de aplicaciones.";
		infoCPU[5]="\nAdemás, controla el buen funcionamiento de cada componente del\nsistema para que todas las acciones sean realizadas en\ntiempo y forma.";
		infoCPU[6]="\nPartes del CPU:";
		infoCPU[7]="\nUn CPU está compuesto internamente de los siguientes componentes:";
		infoCPU[8]="\n* Núcleo. Es la unidad base que constituye a un CPU, que interpreta\n  y ejecuta acciones. Originariamente los procesadores\n  solo tenían uno (single core), pero actualmente lo mínimo\n  es dos.";
		infoCPU[9]="\n* Unidad de control. Es un circuito digital que extrae la instru-\n  cción de la memoria, la descifra y la ejecuta.";
		infoCPU[10]="\n* Unidad aritmética lógica. Es un circuito digital que lleva a cabo\n  las operaciones lógicas, matemáticas y aritméticas entre\n  los datos.";
		infoCPU[11]="\n* Unidad de coma flotante. Es un componente especializado en el\n  cálculo de operaciones con coma flotante.";
		infoCPU[12]="\n* Memoria caché. Es la memoria en la que se almacenan los datos que\n  el usuario consulta con frecuencia, esto permite ganar\n  velocidad al procesador.";
		infoCPU[13]="\n* Registros. Es una memoria de alta velocidad que permite controlar\n  y almacenar las instrucciones en ejecución.";
		infoCPU[14]="\n* Controlador de memoria. Es un circuito que puede estar integrado\n  al procesador y que regula el flujo de datos entre el pro-\n  cesador y la memoria.";
		infoCPU[15]="\n* Bus. Es un sistema digital que envía y recibe datos entre los\n  componentes.";
		infoCPU[16]="\n* Tarjeta gráfica. Es el componente que procesa los datos de video\n  e imagen, que puede estar incluido o no en el CPU.";
		
		System.out.println(" _________________");
		System.out.println("|       CPU       | ");
		System.out.println("|_________________| ");
		
		for (int i=0;i<infoCPU.length;i++) {
			System.out.println(infoCPU[i]); //Mostrar información en consola sobre el CPU
		}
	}
	
	public static void archivosDll () {
		
		String info [] = new String [4];
		
		info[0]= "\nLos archivos DLL, siglas por su nombre en \ninglés Dynamic Link Library, conocidos en \nespañol como Bibliotecas de Enlaces Dinámicos,\nconsisten en una serie de archivos que constan \nde código ejecutable y demás partes de una app, \nlos cuales hacen posible la utilización de las \naplicaciones que tenemos instaladas en la PC.";
		info[1]= "\nCuando ordenemos a nuestro equipo a ejecutar \nun programa, sin que nosotros lo notemos, el \nsistema operativo carga automáticamente la \nlibrería DLL correspondientes para que la \naplicación o función incluida de la app se \nejecute.";
		info[2]= "\n¿PARA QUÉ SIRVEN LOS ARCHIVOS DLL";
		info[3]= "\nUna de las más importantes ventajas que nos \nofrecen los archivos DLL o librerías de enlace \ndinámico, es que gracias a su implementación \nse ha logrado reducir notablemente el tamaño \nde los archivos ejecutables de las aplicaciones, \nya que una gran porción de los códigos \nejecutables de los programas pueden ser \nalmacenados en estos archivos DLL, como por \nejemplo gráficos, audio, texto, tipografía y \ntodos los demás elementos que utiliza la app, \npor lo que se obtiene una mayor organización \nde los procesos, que brinda como resultado un \nmejor rendimiento de la app, y por lo tanto \ndel rendimiento general de la computadora.";
		
		System.out.println(" _________________");
		System.out.println("|   ARCHIVOS DLL  | ");
		System.out.println("|_________________| ");
		
		
		for (int i=0; i<info.length; i++) {
			System.out.println(info[i]);
		}
	}
	
	
	
}
