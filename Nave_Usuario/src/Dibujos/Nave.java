package Dibujos;

import java.util.ArrayList;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Nave extends Coordenadas {
	public Coordenadas cor1= new Coordenadas();							//Coordenada de la izquierda													
	public Coordenadas cor2=new Coordenadas();							//Coordenada de la derecha
	private String Imagen_Usuario="Usuario.png";
	private Image imagen;
	
	ArrayList Bala= new ArrayList();
	
	public Nave(){														//Constructores de la Nave
		super();
		this.cor1.setX(0);												//Entrada Coordenadas de la izquierda y derecha
		this.cor1.setY(0);
		
		this.cor2.setX(0);
		this.cor2.setY(0);
	ImageIcon img=new ImageIcon(this.getClass().getResource(Imagen_Usuario));
	imagen=img.getImage();
	}
	public Nave(Coordenadas a, Coordenadas b, Coordenadas c){			//Entrada de Coordenadas de nave
		super(a.getX(),a.getY());
		
		this.cor1.setX(b.getX());
		this.cor1.setY(b.getY());
		
		this.cor2.setX(b.getY());
		this.cor2.setY(b.getY());
	}
	
	public Nave(Nave c){												//Entrada nuevas coordenadas
		super(c.getX(),c.getY());
		
		this.cor1.setX(c.getX());
		this.cor1.setY(c.getY());
		
		this.cor2.setX(c.getX());
		this.cor2.setY(c.getY());
		
	}
	
	
	public void SetVertice(Coordenadas nuevVertice,int lado){ 		//Constructor del triangulo
		if (lado==1){
			this.setX(nuevVertice.getX());
			this.setY(nuevVertice.getY());
		}
		if (lado==2){
			this.cor1.setX(nuevVertice.getX());
			this.cor1.setY(nuevVertice.getY());
		}
		if (lado==3){
			this.cor2.setX(nuevVertice.getX());
			this.cor2.setY(nuevVertice.getY());
		}
	}
	public void mover(Coordenadas nuevacor){ 						//Funcion para mover el triangulo
		SetVertice(this.Sumas(nuevacor),1);
		SetVertice(this.cor1.Sumas(nuevacor),2);
		SetVertice(this.cor2.Sumas(nuevacor),3);
	}
	
	public Image obtener_imagen(){
		return imagen;
	}
}
