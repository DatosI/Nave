package Dibujos;

import java.awt.event.*;
import javax.swing.JFrame;

import com.sun.prism.paint.Color;

@SuppressWarnings("serial")
public class Ventana extends JFrame implements WindowListener {
	
	public Ventana(String title){
		super(title);									//Se situa en el constructor actual del padre Jframe
		setSize(500,500);
		addWindowListener(this);       					//Poder reconocer acciones
		setBackground(java.awt.Color.BLACK);
	}
														
	
														//Si queremos implementar interfaz Windows listener debemos declarar todos sus metodos
	@Override
	public void windowActivated(WindowEvent arg0) {}
	@Override
	public void windowClosed(WindowEvent arg0) {}
	@Override
	public void windowClosing(WindowEvent arg0)  {System.exit(0);} 		//Para poder cerrar la ventana
	@Override
	public void windowDeactivated(WindowEvent arg0) {}
	@Override
	public void windowDeiconified(WindowEvent arg0) {}
	@Override
	public void windowIconified(WindowEvent arg0) {}
	@Override
	public void windowOpened(WindowEvent arg0) {}
}
