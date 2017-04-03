package Dibujos;

import java.awt.Color;
import java.awt.Graphics;

public class BalaGrafica extends Bala implements Dibujable{
	
	Color color;
	
	public BalaGrafica(Coordenadas ba, float radio, Color Uncolor){		//Recibe la coordenadas de bala con su radio
		super(ba,radio);
		this.color=Uncolor;
	}
	@Override
	public void dibujar(Graphics darreglo){
		darreglo.setColor(color);
		darreglo.fillOval((int)(this.getX()-this.getRadio()),(int)(this.getY()-this.getRadio()),(int)(2*this.getRadio()),(int)(2*this.getRadio())); //Dibujar el ovalo de la bala 
		
	}

}
