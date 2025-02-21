/*
* Analisis
* Descripcion del programa:desarrollar una solucion de software que permita calcular el costo y elaborar las facturas de cada paquete de viaje vendido
* Entradas:
* Salidas: 
* Ejemplo:
*/

package ui;

import java.util.Scanner;

public class Atlas {

	private Scanner escaner;
 
    // Declaracion de constantes (completar)
    final double COSTO_TRAYECTO_AVION = 250000;

	private Atlas() {
		escaner = new Scanner(System.in);
	}
	
	
	public void run()
	{   
  
        final int PRECIO_4NOCHES = 150.000;
        final int PRECIO_transporte = 250.000;

        int informacion_personal;
        System.out.println("Hola! Por favor responda las siguientes preguntas para completar la compra");
        
        
        int edad, transporte, noches_estadia, documentode_identidad;
        String nombre, apellido, ciudadOrigen;

     System.out.println("Entendido! sea bienvenid@ al programa de viajes EVENTOS ATLAS realizado por los estudiantes de Algoritmos y programacion I de la Universidad ICESI.");
        System.out.println("Cual es tu nombre completo?");
        nombre = escaner.nextLine();
                System.out.println("Bienvenid@ " + nombre + apellido );
    System.out.println("digame porfavor su edad");
        edad =  escaner.nextLine();
                System.out.println("listo! ahora digite su numero de identidad y ciudad de origen");
        documentode_identidad + ciudadOrigen = escaner.nextLine();
                System.out.println("Okay, cuantas noches planea quedarse?");
        noches_estadia = escaner.nextLine();
                system.out.println("muy bien, todo listo! quisiera informarle que en nuestro paquete de viajes tiene la opcion de llegar una noche antes e irse una noche después del concierto, por lo que los paquetes ofrecen opciones de alojamiento de hasta 4 noches, donde usted debera hospedarse al menos una noche con ATLAS. Cada noche tiene un costo de $150.000 ");


        /* Declaracion de salidas calculadas (completar)
        double totalTransporte;
        // Calculo de salidas mediante metodos (completar)
        totalTransporte = calcularTotalTransporte(); // aqui podrian faltar parametros
	}

	public static void main(String[] args) {
		Atlas mainApp = new Atlas();
		mainApp.run();
	}

    // Completar metodos para calcular salidas

    /**
	 * Descripción: El método ... permite calcular ...
	 * @param 
	 * @return 
	 */
    /* public double calcularTotalTransporte() {
     /*   return 0; // Completar operacion 
    
    
    }

	

	
}