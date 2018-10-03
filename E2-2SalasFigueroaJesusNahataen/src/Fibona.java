
public class Fibona {
	
		int n;
		int nv;
		public Fibona(int N,int NV) {
			this.n=N;
			this.nv=NV;
		}
		
		public void iterativo() {
			int x=n;
			int anterior=x-1;
			int temp;
		
				for (int i = 0; i <nv; i++) {
					System.out.println(x);
					temp=x;
					x=x+anterior;
					anterior=temp;
				}
				
				
			}
			 
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

