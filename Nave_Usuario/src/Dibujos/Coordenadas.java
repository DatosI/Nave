package Dibujos;

public class Coordenadas {
	
	private float x;
	private float y;
	
	public Coordenadas(){										//Constructor dando coordenadas
		this.x=0;
		this.y=0;
	}
	public Coordenadas(float x,float y){
		this.x=x;
		this.y=y;
	}
	public Coordenadas(Coordenadas nueva){
		this.x=nueva.x;
		this.y=nueva.y;		
	}
	public float getX(){										//Metodos para poder manipular variables
		return this.x;
	}
	public float getY(){
		return this.y;
	}
	public void setX(float x){
		this.x=x;
	}
	public void setY(float y){
		this.y=y;
	}
	public Coordenadas Sumas(Coordenadas S){					//permite hacer la sumatoria de coordenadas para dpintar y despintar
		float Sumx=this.x+ S.getX();
		float Sumy=this.y+ S.getY();
		
		Coordenadas Cor=new Coordenadas(Sumx,Sumy);
		
		return Cor;
		
	}
}

