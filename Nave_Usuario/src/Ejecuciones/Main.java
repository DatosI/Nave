package Ejecuciones;

import Dibujos.*;																				//Poder acceder a las clases dentro de dibujos
import Dibujos.Panel;

import java.awt.*;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		Ventana nueva_ventana=new Ventana("Salón Pruebas");										//Coordenadas necesarias para la bala y el triangulo
		Coordenadas cor1=new Coordenadas(250,250);
		Coordenadas cor2= new Coordenadas(500,300);
		
		Coordenadas cor3= new Coordenadas(475,500);  //PUNTA
		Coordenadas cor4= new Coordenadas(425,575);	 //ESQUINA IZQ
		Coordenadas cor5= new Coordenadas(525,575);	 //ESQUINA DER
		NaveGrafica nave= new NaveGrafica(cor3,cor4,cor5,Color.RED);							//Dibujo de la Nave
			
		ArrayList arreglodeobjetos= new ArrayList();											//Arreglo de los objetos que aparecen en pantalla
		Panel nuevopanel=new Panel(arreglodeobjetos);    										//Panel le damos listo de arreglos 
		
		nuevopanel.refNave(nave);																//Obtenemos la ref de la nave para moverla

																//Añadimos la bala al arreglo
		arreglodeobjetos.add(nave);																//Añadimos la nave al arreglo
		nueva_ventana.add(nuevopanel);															//Creación de la ventana
		nueva_ventana.setSize(800,600);
		nueva_ventana.setVisible(true);
		nueva_ventana.setResizable(false);
		nueva_ventana.setLocationRelativeTo(null);
		nuevopanel.iniciar();
		
	}

}
