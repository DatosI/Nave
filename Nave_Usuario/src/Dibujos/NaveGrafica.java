package Dibujos;

import java.awt.*;

public class NaveGrafica extends Nave implements Dibujable {
	Color color;
	
	public NaveGrafica(Coordenadas a,Coordenadas b, Coordenadas c, Color uncolor){						//Coordenadas del triangulo
		super(a,b,c);
		this.color=uncolor;
	}
	@Override																							//Porque ya esta en la interfaz
	public void dibujar(Graphics darreglo){																//Entrada dibujar el arreglo con las coordenadas 
		
		darreglo.setColor(color);
		int x[]={(int)this.getX(),(int)this.cor1.getX(),(int)this.cor2.getX()};											
		int y[]={(int)this.getY(),(int)this.cor1.getY(),(int)this.cor2.getY()};
		
		Polygon p= new Polygon(x,y,3);
		
		darreglo.fillPolygon(p);
		
	}
	public void pintar(Graphics darreglo, Color uncolor){													//Entrada para pintar el arreglo en las coordenadas
			
			darreglo.setColor(uncolor);
			int x[]={(int)this.getX(),(int)this.cor1.getX(),(int)this.cor2.getX()};
			int y[]={(int)this.getY(),(int)this.cor1.getY(),(int)this.cor2.getY()};
			
			Polygon p= new Polygon(x,y,3);																	//Pinta el triangulo
			darreglo.fillPolygon(p);																		
		}

	public BalaGrafica Bala(){
		Coordenadas salida=new Coordenadas(this.getX(),this.getY());										//Coordenadas de la punta de la nave
		BalaGrafica bala=new BalaGrafica(salida,10,Color.GREEN);											//Creacion de la bala
		return bala;
	}
	public void Ciclo(){
		for(int i=0; i<this.Bala.size();i++){																//Que se mueve mientras sea menor a la cantidad de elementos a observar
			BalaGrafica y=(BalaGrafica)this.Bala.get(i);													//Traemos del arreglo el cual este en la pos i
			float x=y.getY();
			y.setY(x-=5);																					//Velocidad de la Bala
		}
	}
}
