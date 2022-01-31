package ciclos;

public class While {
	public static void main(String[] args) {
		
		int control = 0;
		
		//while
		/*
		while(control < 10) {
			System.out.println("Iteracion: " + control);
			control++;
		}
		*/
		
		//do while
		do {
			// codigo a ejecutar
			System.out.println("Iteracion: " + control);
			
			//Modificador de la variable control
			control++;
		} while (control < 3);
		
		
	}
}
