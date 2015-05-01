import java.util.ArrayList;


public class filo {
private ArrayList<Object> filo= new ArrayList();
	
	public void push(Object o){
		//AGREGAR VALORES A LA PILA
	filo.add(o);
	
	}

	
	public Object pop(){
		//MOSTRAR EL ULTIMO VALOR Y LO ELIMINA

	       if(!(filo.isEmpty())){
               Object o = filo.get(filo.size()-1);
               filo.remove(filo.size()-1);
               return o;
       }else{
               return null;
       }
	       
	}

	public Object peek(){
		//MOSTRAR EL ULTIMO VALOR
		
		 if(!(filo.isEmpty())){
             return filo.get(filo.size()-1);
     }else{
             return null;
     }
		 
	}

	public boolean empty(){
		//PILA LLENA O VACIA
		 return filo.isEmpty();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       filo pila=new filo();
		

		pila.push("uno");
		pila.push("dos");
		pila.push("tres");
		pila.push("cuatro");
		pila.push("cinco");
		pila.push("EJEMPLO");

		
		System.out.println("ultimo valor Pila"); 
		System.out.println(pila.peek()); 

		System.out.println(" "); 
		System.out.println(" "); 

		System.out.println("Datos Pila"); 

		while(pila.empty()==false){ 
		System.out.println(pila.pop()); 
		}


		
	}

}

