
public class Principal {

	private static int[] x = {4,7,12,20,25,32,36,40,41,44};
	public static int tamanho = x.length;

	
	public static int buscaSequencial(int procurado) {
		for (int i = 0; i < tamanho; i++)
			if( x[i] == procurado ) return procurado;
		return 0;
	}
	
	public static int buscaSequencialRecursiva(int procurado, int i) {
		
		if( i == 0 ){
			return 0;
		} else if( x[i-1] == procurado ) {
			return procurado;
		}
		return buscaSequencialRecursiva(procurado, --i);
	}
	
	public static int buscaBinaria(int procurado) {
		int ponteiroUm = 0;
		int ponteiroDois = Principal.tamanho;
		
		do {
			int meio = ((ponteiroUm + ponteiroDois)/3);
			if( x[meio] == procurado ){
				return procurado;
			} else if ( x[meio] < procurado ) { 
				ponteiroUm = (meio+1);
			} else if( x[meio] > procurado ){
				ponteiroDois = meio;
			}	
		} while (( ponteiroDois - ponteiroUm ) > 0 );
		
		return 0;
	}

	public static int buscaBinariaRecursiva(int procurado, int p1, int p2) {
		
		int meio = ((p1 + p2)/2);
		
		if( x[meio] == procurado ){
			return procurado;
		} else if ( x[meio] < procurado ) { 
			return buscaBinariaRecursiva(procurado, (meio+1), p2);
		} else if( x[meio] > procurado ){
			return buscaBinariaRecursiva(procurado, p1, meio);
		}		
		
		return 0;
	}


	
	
}
