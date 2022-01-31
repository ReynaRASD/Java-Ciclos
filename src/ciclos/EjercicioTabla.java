package ciclos;
import java.util.Scanner;

public class EjercicioTabla {

	    public static void main(String[] args) {
	        Scanner console = new Scanner(System.in);
	        int num;
	        
	        System.out.print("Ingresa cualquier número positivo: ");
	        num = console.nextInt();
	                
	        System.out.println("Tabla de multiplicar del " + num + ":");
	        
	        //Debe imprimir la tabla de multiplicar del número en cuestión (solo los primeros 10 números)
	        
	        int tabla = 0;
	        while(tabla <= 10) {
	        	System.out.println(num + " x " + tabla + " = " + num * tabla );
	            tabla++;
				
			}
	    }
	}	


