package Dibujos;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Panel extends JPanel implements KeyListener {						//Clase que nos sirve para los dibujos
	
	@SuppressWarnings("rawtypes")
	ArrayList arreglo;															//Arreglo donde llegan todos los objetos a dibujar
	NaveGrafica nave;
	Coordenadas moviendoIzq=new Coordenadas(-25,0);
	Coordenadas moviendoDer=new Coordenadas(25,0);
	Coordenadas moviendoArri=new Coordenadas(0,-25);
	Coordenadas moviendoAbaj=new Coordenadas(0,25);
	Coordenadas moviendoNulo=new Coordenadas(0,0);
	
	@SuppressWarnings("rawtypes")
	public Panel(ArrayList parametro){
		this.arreglo=parametro;													//Lista de varios tipos de objetos
		this.addKeyListener(this);
		setFocusable(true);
	}
	public void paint(Graphics g){
		Dibujable dib;															//Crea objeto tipo dibujable
		Dimension d=getSize();
		Image Imagen=createImage(d.width,d.height);
		Graphics buff= Imagen.getGraphics();									//Se le asignan los graficos de parametros
		
		for(int i=0;i<arreglo.size();i++){										//Mientras se recorre el arreglo vamos dibujando
			dib=(Dibujable)arreglo.get(i);
			dib.dibujar(buff);													//Pasamos por el buff para que no parpadee
		}
		g.drawImage(Imagen,0,0,null);
	}																			
	public void update(Graphics g){
		paint(g);
		 
	}
																				//Metodos de la implementación del KeyListener
	@Override
	public void keyTyped(KeyEvent e) {}
	@Override
	public void keyPressed(KeyEvent e){											//Acción al apretar boton
		int tecla=e.getKeyCode();
		
		if (tecla==KeyEvent.VK_LEFT){
			this.nave.mover(moviendoIzq);										//Se mueve a la izquierda
		}
		if(tecla==KeyEvent.VK_RIGHT){
			this.nave.mover(moviendoDer);										//Se mueve a la derecha
		}
		if(tecla==KeyEvent.VK_UP){
			this.nave.mover(moviendoArri);
		}
		if(tecla==KeyEvent.VK_DOWN){
			this.nave.mover(moviendoAbaj);
		}
		if(tecla==KeyEvent.VK_SPACE){
			BalaGrafica bala=nave.Bala();
			nave.Bala.add(bala);
			arreglo.add(bala);
			
		}
	}
	
	@Override
	public void keyReleased(KeyEvent e){										//Acciones al dejar de apretar el boton
	int tecla=e.getKeyCode();
	
	if (tecla==KeyEvent.VK_LEFT){
		this.nave.mover(moviendoNulo);
	}
	if(tecla==KeyEvent.VK_RIGHT){
		this.nave.mover(moviendoNulo);
	}
	if(tecla==KeyEvent.VK_UP){
		this.nave.mover(moviendoNulo);
	}
	if(tecla==KeyEvent.VK_DOWN){
		this.nave.mover(moviendoNulo);
	}
	if(tecla==KeyEvent.VK_SPACE){}

	}
	public void refNave(NaveGrafica n){ 										//Modifica la referencia de la nave
		this.nave=n;
	}
	/*public void Colision(){
		int i;
		for(i=0;i<nave.Bala.size();i++){
			BalaGrafica bala=(BalaGrafica)nave.Bala.get(i);						//Cada bala creada se va a comparar con el enemigo
			for(j=0;enemigos.size();j++){										//Recorrer lista de enemigos
				Coordenadas coorbala= new Coordenadas(bala.getX(),bala.getY());
				
			}
		}
	}*/
	public void iniciar(){
		while(true){
			{
				try{															//Por si pasa algun error de memoria y no se caiga el juego
					if(!nave.Bala.isEmpty()){									//Si el arreglo de balas no está vacio las mueve
						nave.Ciclo();
					}
					Thread.sleep(50);											//Hilo de Ejecución, cada 50ms								
				}catch(InterruptedException err){System.out.println(err);}		//Una excepción
					
			repaint();
				}
			}
		}
}
