package estructurasdecontrol;

public class condicionales {

	public static void main(String[] args) {

		//Condicional if (simple)

		byte edad=38;
		String nombre = "Juan";
		boolean gameOver =true;

		if((edad >0 &&edad >100) || (nombre=="Alvaro" && gameOver )) {
			//Se ejecuta esto si la condicion es verdadera

			System.out.println(nombre +" tiene "+ edad +" Anios de edad");
		}


		//Condicional if else (doble)
		gameOver=false;
		String avenger= "Ironman";
		if (nombre == avenger) {
			System.out.println("Fin del Juego");
		}else {
			System.out.println("Pasa a la Condicionla anidada");

		}
		
		//Condicional if lse if(Anidada)
		char semafaro ='v';
		if(semafaro=='r') {
			System.out.println("ALTO");
			
		}else if(semafaro=='a'){
			System.out.println("PASE CON PRECAUCION");
		}else if(semafaro=='v') {
			System.out.println("SIGA");
		}else if(semafaro == 'o') {
			System.out.println("No hay Energia, Tenga Cuidado");
		}
		
	}
}
