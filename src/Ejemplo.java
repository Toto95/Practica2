import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Ejemplo extends JFrame {
      Runnable r;
	Thread t=new Thread(r);
	   
	  /*   public Ejemplo() throws InterruptedException{
	    	 JPanel ventana=(JPanel)this.getContentPane();
	 		setSize(1350,710); setTitle("Como jugar"); setVisible(true);
	 		this.setLocationRelativeTo(null);
	 		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 		ventana.setBackground(Color.ORANGE);
	 		ventana.setLayout(null);
	 		
	 		
	 		
	 		//Figuras
	 		JButton botonn1= new JButton("Torre 1");
	 		botonn1.setBounds(100, 625, 400, 50);
	 		JButton botonn5=new JButton("empezar");
	 		botonn5.setBounds(0,100,150,25);
	 		JButton botonn2= new JButton("Torre 2");
	 		botonn2.setBounds(510,625,400,50);
	 		JButton botonn3= new JButton("Torre 3");
	 		botonn3.setBounds(920,625,400,50);
	 		JButton botonn4= new JButton("Regresar");
	 		botonn4.setBounds(0, 0, 150, 25);
	 		ventana.add(botonn4);
	 		ventana.add(botonn1);
	 		ventana.add(botonn2);
	 		ventana.add(botonn3);
	 		ventana.add(botonn5);
	 		Icon image1=new ImageIcon("cuadro1.jpg");
	 		Icon image2=new ImageIcon("cuadro2.jpg");
	 		Icon image3=new ImageIcon("cuadro3.jpg");
	 		Icon image4=new ImageIcon("cuadro4.jpg");
	 		Icon image5=new ImageIcon("cuadro5.jpg");
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
	 		ventana.add(eti1);
	 		ventana.add(eti2);
	 		ventana.add(eti3);
	 		ventana.add(eti4);
	 		ventana.add(eti5);
	 		//Movement 1
	     }
	     */
			public void  correr(){  
				JPanel ventana=(JPanel)this.getContentPane();
		 		setSize(1350,710); setTitle("Como jugar"); setVisible(true);
		 		this.setLocationRelativeTo(null);
		 		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 		ventana.setBackground(Color.ORANGE);
		 		ventana.setLayout(null);
		 		
		 		
		 		
		 		//Figuras
		 		JButton botonn1= new JButton("Torre 1");
		 		botonn1.setBounds(100, 625, 400, 50);
		 		JButton botonn5=new JButton("empezar");
		 		botonn5.setBounds(0,100,150,25);
		 		JButton botonn2= new JButton("Torre 2");
		 		botonn2.setBounds(510,625,400,50);
		 		JButton botonn3= new JButton("Torre 3");
		 		botonn3.setBounds(920,625,400,50);
		 		JButton botonn4= new JButton("Regresar");
		 		botonn4.setBounds(0, 0, 150, 25);
		 		ventana.add(botonn4);
		 		ventana.add(botonn1);
		 		ventana.add(botonn2);
		 		ventana.add(botonn3);
		 		ventana.add(botonn5);
		 		Icon image1=new ImageIcon("cuadro1.jpg");
		 		Icon image2=new ImageIcon("cuadro2.jpg");
		 		Icon image3=new ImageIcon("cuadro3.jpg");
		 		Icon image4=new ImageIcon("cuadro4.jpg");
		 		Icon image5=new ImageIcon("cuadro5.jpg");
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
		 		ventana.add(eti1);
		 		ventana.add(eti2);
		 		ventana.add(eti3);
		 		ventana.add(eti4);
		 		ventana.add(eti5);
				r=new Runnable(){
                     int x=1000;
					@Override
					public void run() {
						 try {
								t.sleep(x);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						eti5.setLocation(512,475);
						repaint();
						   try {
							t.sleep(x);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						//movimiento2
						
						eti4.setLocation(922,475);
						repaint();
						  try {
							t.sleep(x);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						//movimiento3
						
						eti5.setLocation(924,400);
						repaint();
						//movimiento 4
						try {
							t.sleep(x);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						eti3.setLocation(512,475);
						repaint();
						 try {
								t.sleep(x);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						//movimiento 5
					
						eti5.setLocation(106,325);
						repaint();
						//movimiento 6
						 try {
								t.sleep(x);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						eti4.setLocation(514,400);
						repaint();
						//movimiento7
						 try {
								t.sleep(x);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						eti5.setLocation(516,325);
						repaint();
						//movimiento 8
						 try {
								t.sleep(x);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						eti2.setLocation(922,475);
						repaint();
						//movimiento9
						 try {
								t.sleep(x);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						eti5.setLocation(924,400);
						repaint();
						//movimiento 10
						try {
							t.sleep(x);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						eti4.setLocation(104,400);
						repaint();
						//movimiento 11
						 try {
								t.sleep(x);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						eti5.setLocation(106,325);
						//movimiento 12
						 try {
								t.sleep(x);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						eti3.setLocation(924,400);
						repaint();
						//movimiento 13
						 try {
								t.sleep(x);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						eti5.setLocation(512,475);
						repaint();
						//movimiento 14
						 try {
								t.sleep(x);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						eti4.setLocation(926,325);
						repaint();
						//movimiento 15
						 try {
								t.sleep(x);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						eti5.setLocation(928,250);
						repaint();
						//movimiento 16
						 try {
								t.sleep(x);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						eti1.setLocation(512,475);
						repaint();
						//movimiento 17
						 try {
								t.sleep(x);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						eti5.setLocation(102,475);
						repaint();
						//movimiento 18
						 try {
								t.sleep(x);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						eti4.setLocation(514,400);
						repaint();
						//movimiento 19
						 try {
								t.sleep(x);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						eti5.setLocation(516,325);
						repaint();
						//movimiento 20
						 try {
								t.sleep(x);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						eti3.setLocation(102,475);
						repaint();
						//movimiento21
						 try {
								t.sleep(x);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						eti5.setLocation(924,400);
						repaint();
						//movimiento 22
						 try {
								t.sleep(x);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						eti4.setLocation(104,400);
						repaint();
						//movimiento 23
						 try {
								t.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						eti5.setLocation(106,325);
						repaint();
						//movimiento 24
						 try {
								t.sleep(x);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						eti2.setLocation(514,400);
						repaint();
						//movimiento 25
						 try {
								t.sleep(x);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						eti5.setLocation(516,325);
						repaint();
						//movimiento 26
						 try {
								t.sleep(x);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						eti4.setLocation(922,475);
						repaint();
						//movimiento 27
						 try {
								t.sleep(x);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						eti5.setLocation(924,400);
						repaint();
						//movimiento 28
						 try {
								t.sleep(x);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						eti3.setLocation(516,325);
						repaint();
						//movimiento 29
						 try {
								t.sleep(x);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						eti5.setLocation(102,475);
						repaint();
						//movimiento 30
						 try {
								t.sleep(x);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						eti4.setLocation(518,250);
						repaint();
						//movimiento 31
						 try {
								t.sleep(x);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						eti5.setLocation(520,175);
						repaint();

				 		repaint();
						
					}
					
				};
				
			
	 	
	 	
	 	
	 	botonn4.addActionListener(new ActionListener(){
	         @SuppressWarnings("unused")
	 		public void actionPerformed(ActionEvent e){
	         	
	         	
	         setVisible(false);
	 			
	 		
	         }
	 	}
	     );

	 	botonn5.addActionListener(new ActionListener(){
	         @SuppressWarnings("unused")
	 		public void actionPerformed(ActionEvent e){
	         	
	         	
	         t=new Thread(r);
	         t.start();
	 			
	 		
	         }
	 	}
	     );
	 	
	 	
	 	}

}  

	
	
	
	
 	
 
      



