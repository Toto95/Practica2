import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.FlowLayout;

import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Botones extends JFrame implements ActionListener{
	
	public FlowLayout esquema;
	private Container contenedor;

	public Botones(){
		Icon imagen= new ImageIcon("cuadro1");
		JButton boton1=new JButton("Torre 1",imagen);
		JButton boton2=new JButton("Torre 2");
		JButton boton3=new JButton("Torre 3");
	esquema= new FlowLayout();
	contenedor=getContentPane();
	setLayout(esquema);
	add(boton1);
	add(boton2);
	add(boton3);
	esquema.setAlignment(FlowLayout.CENTER);
	
	}
	public static void main(String [] args){
		Botones prueba= new Botones();
		prueba.setDefaultCloseOperation(EXIT_ON_CLOSE);
		prueba.setSize(300, 400);
		prueba.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		
		}
	}

	
	