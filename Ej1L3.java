class Balde{
	private int capacidad;
	private int contenido;
	public Balde(int c){
		this.contenido = 0;
		this.capacidad = c;
	}
	public void llenar(int x){
		if(contenido + x < capacidad && x >=0){
			contenido = contenido + x; 
		} 
		else if(contenido + x >= capacidad && x >= 0){
			contenido = capacidad;
		}
		else if(x < 0){

		}
	}
	public int verificar(){
		return contenido;
	}
	public int vaciar(int v){
		int r = 0;
		if(v < contenido && v >= 0){
			//r = v;
			contenido = contenido - v;
			return v;
		}
		else if(v >= contenido && v >= 0){
			r = contenido;
			contenido = 0;	
			return contenido;
		}
		return r;
	}
}

public class Ej1L3{
	public static void main(String[] args){
        Balde b = new Balde(5);              //creas una instancia con 5 litros de capacidad maxima
        b.llenar(3);                       //le echas 3 listros de liquido al balde
        int s = b.vaciar(2);               //le tratas de sacar 2 litros, y si hay lo deja en 'int s'
        System.out.println(s);             //haces visible por pantalla el numero de litros realmente obtenidos
        System.out.println(b.verificar()); //llamas al metodo que retorna la cantidad de liquido que hay en el balde
    }
}