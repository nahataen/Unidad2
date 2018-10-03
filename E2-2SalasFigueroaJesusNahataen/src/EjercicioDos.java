import java.util.Scanner;

public class EjercicioDos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner( System.in);
		System.out.println("ingresa a que numero quieres que llegue la serie fibonacci");
		int nv=s.nextInt();
		System.out.println("ingresa el numero donde quieres que comience la serie fibonacci");
		int n=s.nextInt();
  Fibona f1= new Fibona(n, nv);
  
  long startTime = System.currentTimeMillis();
  f1.iterativo();
  long endTime = System.currentTimeMillis() - startTime;
	System.out.println(" TIEMPO DE CARGA="+endTime+" mili segundos");
	
	
	//recursivo 
	  long startTime2 = System.currentTimeMillis();
Recursivo r= new Recursivo();
	int numer;
	System.out.println("dijite la cantidad de veces que se repetira la serie fibonaccide manera recursiva");
	numer=s.nextInt();
	
	for (int i = 0; i <numer; i++) {
		System.out.println(r.recursivo(i));
	}
	  long endTime2 = System.currentTimeMillis() - startTime;
		System.out.println(" TIEMPO DE CARGA="+endTime2+" mili segundos");
		
	
	}
	//recursivo

} 
