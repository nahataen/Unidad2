
public class Recursivo {
	//recursivo
			static  int recursivo(int nu) {
				if (nu==0 || nu==1) {
					return 1;
				}else {
					return recursivo(nu-1) + recursivo(nu-2);
				}
			}
			
			//recursivo
}
