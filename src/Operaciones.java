import javax.swing.JLabel;


public class Operaciones  {
	
	int tamaño=0;
	int to1=0;
	int to2=0;
	int to3=0;
	boolean tor1=false;
	boolean tor2=false;
	boolean tor3=false;
	int n1=0;
	int n2=0;
	int n3=0;
	PilaTorres tore1= new PilaTorres();
	PilaTorres tore2= new PilaTorres();
	PilaTorres tore3= new PilaTorres();
	JLabel cam=new JLabel();
	
	//arrays
	
	
	// metodos que comprueban que torre se preciono primero
	public void presendenciaPara1(boolean tor2,boolean tor3){
		if(tor2==true || tor3==true){
			  n1=2;
		}else{
			 n1=1;
		}
			
	}
	public void presedenciaPara2(boolean tor1,boolean tor3){
		if(tor1==true || tor3==true){
			  n2=2;
		}else{
			  n2=1;
		}
	}
	public int presedenciaPara3(boolean tor1,boolean tor2){
		if(tor2==true || tor1== true){
			return n3=2;
		}else{
			return n3=1;
		}
	}
	// metodos que verifican si el boton a sido precionado
	boolean pulso1(){
		return tor1=true;
	}
	boolean pulso2(){
		return tor2=true;
	}
	boolean pulso3(){
		return tor3=true;
	}
	// contadores
	int contadorTorre2=0;
	int contadorTorre3=0;
	
	
	
	
	public int[] niveles={-50,25,100,175,250,325,400,475};
	public int posY(int i){
		return niveles[i];
	}
	public void moviendo(int n1, int n2, int n3,PilaTorres a,PilaTorres e,PilaTorres i){
		if(n1==1 && n2==2 || n1==2 && n2==1 || n1==0 && n2==0){
		  JLabel cu=a.peek();
		  a.push(e.pop());
		  cu.setLocation(510, -50);
		}
		
	}
	public void mostrar(boolean to,boolean t){
		if(to==true && t==false)
			System.out.println("Si funciona para boton 1");
		else if(to==false && t==true)
			System.out.println("Si funciona para 2");
		else{
			System.out.println("no funcionan");
		}
	}
       
    
}
