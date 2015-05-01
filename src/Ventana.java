import java.awt.*;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
@SuppressWarnings("serial")
public class Ventana extends JFrame{
	// variables para iterar entre torres
	int to1=0;
	int to2=0;
	int to3=0;
	JLabel it=new JLabel();
	boolean tor1=false;
	boolean tor2=false;
	boolean tor3=false;
	int n1=0;
	int n2=0;
	int n3=0;
	// metodos que comprueban que torre se preciono primero
	public void presendenciaPara1(){
		if(tor2==true || tor3==true){
			n1=2;
		}else{
			n1=1;
		}
			
	}
	public void presedenciaPara2(){
		if(tor1==true || tor3==true){
			n2=2;
		}else{
			n2=1;
		}
	}
	public void presedenciaPara3(){
		if(tor2==true || tor1== true){
			n3=2;
		}else{
			n3=1;
		}
	}
	boolean pulso1(){
		return tor1=true;
	}
	boolean pulso2(){
		return tor2=true;
	}
	boolean pulso3(){
		return tor3=true;
	}
	
	String cantidad;
	int opcion=0;
	
	public int[] niveles={475,400,325,250,175,100,25,-50};
	
	public int posY(int i){
		return niveles[i];
	}
	
    
	
	
	public Ventana() throws InterruptedException{
		      
	       
		// panel de pregunta
					cantidad=JOptionPane.showInputDialog("Con cuantos discos desea jugar");
				   opcion=Integer.parseInt(cantidad);
		
				  
		   
		//creando botones
		JButton boton1= new JButton("Torre 1");
		boton1.setBounds(100, 625, 400, 50);
		JButton boton2= new JButton("Torre 2");
		boton2.setBounds(510,625,400,50);
		JButton boton3= new JButton("Torre 3");
		boton3.setBounds(920,625,400,50);
		JButton boton4=new JButton("Instrucciones");
		boton4.setBounds(0,0,150,25);
		JButton boton5=new JButton("Punteos");
		boton5.setBounds(0, 30, 150, 25);
		JButton boton6=new JButton("Ejemplo");
		boton6.setBounds(0, 60, 150, 25);
		JButton mover=new JButton("MOVER");
		mover.setBounds(0,300,100,25);
		
	    
 //ventana principal
	    
	    JPanel panel=(JPanel)this.getContentPane();
	   
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setBackground(Color.ORANGE);
		
		setSize(1350,710); setTitle("Torres de Hanoi"); setVisible(true); 

		Operaciones check=new Operaciones();
		
		
	    //creando los label
		
		Icon image1=new ImageIcon("cuadro1.jpg");
		Icon image2=new ImageIcon("cuadro2.jpg");
		Icon image3=new ImageIcon("cuadro3.jpg");
		Icon image4=new ImageIcon("cuadro4.jpg");
		Icon image5=new ImageIcon("cuadro5.jpg");
		Icon image6=new ImageIcon("cuadro6.jpg");
		Icon image7=new ImageIcon("cuadro7.jpg");
		Icon image8=new ImageIcon("cuadro8.jpg");
		JLabel eti1=new JLabel(image1);
		eti1.setBounds(102, 475, 400, 200);
		JLabel eti2=new JLabel(image2);
		eti2.setBounds(104,400,400,200);
		JLabel eti3=new JLabel(image3);
		eti3.setBounds(106, 325, 400, 200);
		JLabel eti4=new JLabel(image4);
		eti4.setBounds(108,250,400,200);
		JLabel eti5=new JLabel(image5);
		eti5.setBounds(110, 175, 400, 200);
		JLabel eti6=new JLabel(image6);
		eti6.setBounds(112, 100, 400, 200);
		JLabel eti7=new JLabel(image7);
		eti7.setBounds(114, 25, 400, 200);
		JLabel eti8=new JLabel(image8);
		eti8.setBounds(116, -50, 400, 200);
		PilaTorres a=new PilaTorres();
		PilaTorres e1=new PilaTorres();
		PilaTorres i=new PilaTorres();
		
		
		
		
		if(opcion==3){
			panel.add(eti1);
			panel.add(eti2);
			panel.add(eti3);
			repaint();
			/*int[] torre1={1,1,1};
			int[] torre2={0,0,0};
			int[] torre3={0,0,0}; */
			
			a.push(eti1);
			a.push(eti2);
			a.push(eti3);
			
		}else if(opcion==4){
			panel.add(eti1);
			panel.add(eti2);
			panel.add(eti3);
			panel.add(eti4);
			repaint();
			int[] torre1={1,1,1,1};
			int[] torre2={0,0,0,0};
			int[] torre3={0,0,0,0};
			a.push(eti1);
			a.push(eti2);
			a.push(eti3);
			a.push(eti4);
		}else if(opcion==5){
			panel.add(eti1);
			panel.add(eti2);
			panel.add(eti3);
			panel.add(eti4);
			panel.add(eti5);
			repaint();
			int[] torre1={1,1,1,1,1};
			int[] torre2={0,0,0,0,0};
			int[] torre3={0,0,0,0,0};
			a.push(eti1);
			a.push(eti2);
			a.push(eti3);
			a.push(eti4);
			a.push(eti5);
			
			
		}else if(opcion==6){
			panel.add(eti1);
			panel.add(eti2);
			panel.add(eti3);
			panel.add(eti4);
			panel.add(eti5);
			panel.add(eti6);
			repaint();
			int[] torre1={1,1,1,1,1,1};
			int[] torre2={0,0,0,0,0,0};
			int[] torre3={0,0,0,0,0,0};
			a.push(eti1);
			a.push(eti2);
			a.push(eti3);
			a.push(eti4);
			a.push(eti5);
			a.push(eti6);
		}else if(opcion==7){
			panel.add(eti1);
			panel.add(eti2);
			panel.add(eti3);
			panel.add(eti4);
			panel.add(eti5);
			panel.add(eti6);
			panel.add(eti7);
		    repaint();
		    int[] torre1={1,1,1,1,1,1,1};
			int[] torre2={0,0,0,0,0,0,0};
			int[] torre3={0,0,0,0,0,0,0};
			a.push(eti1);
			a.push(eti2);
			a.push(eti3);
			a.push(eti4);
			a.push(eti5);
			a.push(eti6);
			a.push(eti7);
		}else if(opcion==8){
			panel.add(eti1);
			panel.add(eti2);
			panel.add(eti3);
			panel.add(eti4);
			panel.add(eti5);
			panel.add(eti6);
			panel.add(eti7);
			panel.add(eti8);
			repaint();
			int[] torre1={1,1,1,1,1,1,1,1};
			int[] torre2={0,0,0,0,0,0,0,0};
			int[] torre3={0,0,0,0,0,0,0,0};
			a.push(eti1);
			a.push(eti2);
			a.push(eti3);
			a.push(eti4);
			a.push(eti5);
			a.push(eti6);
			a.push(eti7);
			a.push(eti8);
		}
		
		panel.add(boton1);
		panel.add(boton2);
		panel.add(boton3);
		panel.add(boton4);
		panel.add(boton5);
		panel.add(boton6);
		panel.add(mover);
		//panel.add(mover);
		repaint();
		
		//accion del boton ejemplo
		boton6.addActionListener(new ActionListener(){
            @SuppressWarnings("unused")
			@Override
            public void actionPerformed(ActionEvent e){
            	
            	
               Ejemplo nuevo=new Ejemplo();
               nuevo.correr();
               
				
			
            }
		}
        );
		//accion del boton Instrucciones
		boton4.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Instruc instruc=new Instruc();
				
			}
			
		});
		
		// accion del boton torr1
		boton1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent c) {
				// TODO Auto-generated method stub
			check.pulso1();
			check.presendenciaPara1(tor2, tor3);
			
			
				
			}
			
		});
         // accion del boton torre2
		
				boton2.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						check.pulso2();
						check.presedenciaPara2(tor1, tor3);
					    
						
					}
					
				});
				
				
				
				// accion del boton mover
		                   
				
						mover.addActionListener(new ActionListener(){

							@Override
							public void actionPerformed(ActionEvent k) {
								// TODO Auto-generated method stub
								
							          check.moviendo(n1, n2, n3, a, e1, i);
							            repaint();
							            
							}
							
						});
		//cronometro
		int ss = 0,h=0,m=0;
		JLabel tiempo=new JLabel();
		
	     while(true){
			 if(ss==59){
				 ss=0;
				 m++;
			 }if(m==59){
				 m=0;
			 h++;
			 }
			 ss++;
			String h1=Integer.toString(h);
			String m1=Integer.toString(m);
			String s1=Integer.toString(ss);
			tiempo.setText(h1+":"+m1+":"+s1);
			panel.add(tiempo);
			Thread.sleep(1000);
			tiempo.setBounds(1200,0,150,50);
		
		 }
		
		 

		}
	
	

	public static void main(String[] args) throws InterruptedException{
		Ventana ventana=new Ventana();
		
	}



		
	}


