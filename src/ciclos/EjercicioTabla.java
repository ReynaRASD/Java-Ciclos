package ciclos;
import java.util.Scanner;

public class EjercicioTabla {

	    public static void main(String[] args) {
	        Scanner console = new Scanner(System.in);
	        int num;
	        
	        System.out.print("Ingresa cualquier n�mero positivo: ");
	        num = console.nextInt();
	                
	        System.out.println("Tabla de multiplicar del " + num + ":");
	        
	        //Debe imprimir la tabla de multiplicar del n�mero en cuesti�n (solo los primeros 10 n�meros)
	        
	        int tabla = 0;
	        while(tabla <= 10) {
	        	System.out.println(num + " x " + tabla + " = " + num * tabla );
	            tabla++;
				
			}
	    }
	}	


