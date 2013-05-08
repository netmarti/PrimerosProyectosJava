package dic;

public class NodoLista {
	
    
        public int id;
        public String ingles,espanol;
	public NodoLista sig;
        
        
	public NodoLista(int x, String espanol1, String ingles1)	{
	    
            id=x;
	    espanol=espanol1;
            ingles=ingles1;
                    
	}

	public NodoLista(int x, String espanol1, String ingles1 , NodoLista n) {
	   id=x;
	    espanol=espanol1;
            ingles=ingles1;
	}
}

