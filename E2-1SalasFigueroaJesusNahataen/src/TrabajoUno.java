
public class TrabajoUno {





		public static void main(String[] args) {
		
			System.out.println("FOR");
			long startTime = System.nanoTime();
			metodofor();
			long endTime = System.nanoTime() - startTime;
			System.out.println(" TIEMPO DE CARGA="+endTime+" nano segundos");
			
			System.out.println("recursividad");
			long startTime1 = System.nanoTime();
			System.out.println("Factorial de 5 es: " + factorial(5));
			long endTime2 = System.nanoTime() - startTime;
			System.out.println(" TIEMPO DE CARGA="+endTime2+" nano segundos");
			

	}
		
		
		public static void metodofor() {
			
			double factorial = 1;
			
			
		
			for (double numero=6; numero !=0; numero--) {
				  factorial=factorial*numero;
			
			}	 	System.out.println("Factorial de 6 es: " +factorial);
			
		}
		
		
		static int factorial (int numero) {
			if (numero == 0) return 1;
			else return numero * factorial(numero-1);
			}
			

	}




