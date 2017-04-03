package Dibujos;

public class Bala extends Coordenadas{
	
	private float radio;
														//Coordenadas de la bala
	public Bala(){
		super();								
		this.radio=0;
	}
	public Bala(Coordenadas nueva,float r){				//Constructores de bala
		super(nueva);
		this.radio=r;
	}
	public Bala(Bala ba){
		super(ba);
		this.radio=ba.radio;
	}
	public float getRadio(){							//Metodos para manipular la variable
		return this.radio;
	}
	public void setRadio(float r){						//Cambiar radio de la bala
		this.radio=r;
	}
	public Coordenadas getCentro(){						//Coordenadas de la bala
		Coordenadas nueva=new Coordenadas(this.getX(),this.getY());
		return nueva;
	}
}

