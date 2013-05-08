
class NodosListaCircular{
	//datos amigables para que la clase lista tenga un acceso directo
	Object datos;
	NodosListaCircular siguiente;
	//Constructor crea un nodo de tipo Object
	NodosListaCircular(Object valor){
		datos=valor;
		siguiente=null;
	}
	//Constructor Crea un nodo de tipo Object y al siguiente nodo de la lista
	NodosListaCircular (Object valor,NodosListaCircular signodo){
		datos=valor;
		siguiente=signodo; //siguiente se refiere al siguiente nodo
	}
	//Retorna el dato que se encuentra en ese nodo
	Object getObject(){
		return datos;
	}
	//Retorna el siguiente nodo
	NodosListaCircular getnext(){
		return siguiente;
	}
}

//Definicion de la clase ListaCircular
class ListaCircular{
	NodosListaCircular PrimerNodo;
	String Nombre;
	
	//Constructor construye una lista vacia con un nombre s
	public boolean VaciaLista(){
		return PrimerNodo==null;
	}
	
	//Imprime el contenido de la lista
	public void Imprimir(){
		if (VaciaLista()){
			System.out.println("Vacia" + Nombre);
		}
		else{
			System.out.print("La "+Nombre + " es: ");
			NodosListaCircular Actual=PrimerNodo.siguiente;
			System.out.print(PrimerNodo.datos.toString()+" ");
			while(Actual != PrimerNodo){
				System.out.print(Actual.datos.toString()+" ");
				Actual=Actual.siguiente;
			}
			System.out.println();
			System.out.println();
		}
	}
	
	//Constructor
	public ListaCircular(String s){
		Nombre=s;
		PrimerNodo=null;
	}
	
	//Constructor
	public ListaCircular(){
		this ("Lista");
	}
	
	//Inserta un elemento al frente de la lista
	void InsertaInicio(Object ElemInser){
		if(VaciaLista()){
			PrimerNodo=new NodosListaCircular(ElemInser);
			PrimerNodo.siguiente=PrimerNodo;
		}
		else{
			NodosListaCircular aux=PrimerNodo;
			while(aux.siguiente != PrimerNodo)
				aux=aux.siguiente;
			NodosListaCircular tempo=new NodosListaCircular (ElemInser);
			aux.siguiente=tempo;
			tempo.siguiente=PrimerNodo;
			PrimerNodo=tempo;
		}
	}
	
	//Inserta al final de la lista
	public void InsertaFinal(Object ElemInser){
		if(VaciaLista()){
			PrimerNodo=new NodosListaCircular (ElemInser);
			PrimerNodo.siguiente=PrimerNodo;
	    }
		else{
			NodosListaCircular aux=PrimerNodo;
			while(aux.siguiente != PrimerNodo)
				aux=aux.siguiente;
			NodosListaCircular tempo=new NodosListaCircular(ElemInser);
			aux.siguiente=tempo;
			tempo.siguiente=PrimerNodo;
	    }
	}
	
	//Inserta elemento en posicion dada
	public void InsertaMedio(Object ElemInser,int Posicion){
		if(VaciaLista()){
			PrimerNodo=new NodosListaCircular (ElemInser);
			PrimerNodo.siguiente=PrimerNodo;
		}
		else{
			if(Posicion<=1){
				NodosListaCircular Nuevo=new NodosListaCircular(ElemInser);
				Nuevo.siguiente=PrimerNodo;
				PrimerNodo=Nuevo;
			}
			else{
				NodosListaCircular Aux=PrimerNodo;
				int i=2;
				while((i != Posicion) & (Aux.siguiente != PrimerNodo)){
					i++;
					Aux=Aux.siguiente;
				}
				NodosListaCircular Nuevo=new NodosListaCircular(ElemInser);
				Nuevo.siguiente=Aux.siguiente;
				Aux.siguiente=Nuevo;
			}
		}
	}
	
	//Elimina al Inicio
	public void EliminaInicio(){
		if(VaciaLista())
			System.out.println("No hay elementos");
		else{
			NodosListaCircular aux=PrimerNodo;
			while(aux.siguiente != PrimerNodo)
				aux=aux.siguiente;
			PrimerNodo=PrimerNodo.siguiente;
			aux.siguiente=PrimerNodo;
		}
	}
	
	//Elimina al Final
	public void EliminaFinal(){
		if(VaciaLista())
			System.out.println("No hay elementos");
		else{
			NodosListaCircular aux=PrimerNodo;
			NodosListaCircular ac=null;
			if(PrimerNodo==PrimerNodo.siguiente){
				PrimerNodo=null;
			}
			else{
				while(aux.siguiente != PrimerNodo){
					ac=aux;
					aux=aux.siguiente;
				}
				ac.siguiente=PrimerNodo;
			}
		}
	}
	
	//Retorna si un elemento es miembro
	public boolean Miembro(Object ele){
		boolean enc=false;
		if(!VaciaLista()){
			NodosListaCircular aux=PrimerNodo.siguiente;
			if(ele.equals(PrimerNodo.datos))
				enc=true;
			else{
				while((aux != PrimerNodo) && (enc==false)){
					if(ele.equals(aux.datos)){
						enc=true;
					}
					else{
						aux=aux.siguiente;
					}
				}
			}
		}
		return enc;
	}
}

class ListaCircularA{
	public static void main (String [] args){
		ListaCircular l=new ListaCircular();
		//Crea la lista
                l.InsertaFinal("14");
                l.InsertaFinal("21");
		l.InsertaInicio("7");
		l.InsertaInicio("3");
		l.InsertaInicio("16");
		l.InsertaInicio("2");
		l.InsertaInicio("5");
		l.InsertaInicio("8");
		l.InsertaInicio("10");
		l.InsertaInicio("15");
		l.InsertaInicio("1");
                l.InsertaMedio("43", 3);
                l.InsertaMedio("44", 4);
                l.InsertaMedio("45", 5);
                l.Miembro("43");
		l.EliminaFinal();
		l.Imprimir();
	}
}


			
			