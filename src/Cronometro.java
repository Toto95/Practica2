import java.awt.Component;

import javax.swing.*;
public class Cronometro extends JFrame {
	
	int h,m,s;
	
		public void suTiempo() throws InterruptedException{
	
		
		JLabel tiempo=new JLabel();
		
     while(true){
		 if(s==59){
			 s=0;
			 m++;
		 }if(m==59){
			 m=0;
			 h++;
		 }
		 s++;
		String h1=Integer.toString(h);
		String m1=Integer.toString(m);
		String s1=Integer.toString(s);
		tiempo.setText(h1+":"+m1+":"+s1);
		
		Thread.sleep(1000);
		tiempo.setBounds(1320,0,150,50);
		
	 }
	}
		}

		

	
	


