import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Escena extends JFrame implements ActionListener {
	JButton boton1;
	JButton boton2;
	JButton boton3;
	public Escena() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,300);
		this.setVisible(true);
		
		boton1=new JButton("Amarillo");
        boton1.setBounds(60,100,90,30);
        this.add(boton1);
        boton1.addActionListener(this);
        boton2=new JButton("Azul");
        boton2.setBounds(160,100,90,30);
        this.add(boton2);
        boton2.addActionListener(this);
        boton3=new JButton("Rojo");
        boton3.setBounds(260,100,90,30);
        this.add(boton3);
        boton3.addActionListener(this);  
		
        boton1.setBackground(Color.yellow);
        boton2.setBackground(Color.blue);
        boton3.setBackground(Color.red);
        
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(boton1)) {
			System.out.println("boton1 ");
			this.setBackground(Color.yellow);
			getContentPane().setBackground(Color.yellow);
		}
		if(e.getSource().equals(boton2)) {
			System.out.println("boton2 ");
			this.setBackground(Color.blue);
			getContentPane().setBackground(Color.blue);
		}
		if(e.getSource().equals(boton3)) {
			System.out.println("boton3 ");
			this.setBackground(Color.red);
			getContentPane().setBackground(Color.red);
		}
	}

}
