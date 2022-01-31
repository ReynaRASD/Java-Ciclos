package ciclos;

public class For {
	public static void main(String[] args) {
		
		
		//for
	
		/*
		for(int i = 0; i < 5; i++){
			System.out.println("Iteracion: " + i);
		}
		*/
		
		//break & continue
		for (int i = 0; i < 10; i++) {
			if(i % 2 == 0) { //Solo se muestran numeros pares
				System.out.println("Iteracion i: " + i);
			break; //Termina el ciclo
			//Solo se ejecuta una vez y lo detiene.
			}
			System.out.println("Iteracion i: " + i);
		}
		
		
		for (int j = 0; j < 16; j++) {
			if(j % 2 == 0) { //Solo se muestran numeros pares
				
			continue; //permite saltarnos una ejecucion del ciclo
			//deja que continue el ciclo
			}
			System.out.println("Iteracion j: " + j);
		}
		
		
		for (int k = 0; k < 3; k++) {
			if(k % 2 == 0) { //Solo se muestran numeros pares
				System.out.println("Iteracion k: " + k);
			continue; 
			}
		}
		
		
		
	}
}
