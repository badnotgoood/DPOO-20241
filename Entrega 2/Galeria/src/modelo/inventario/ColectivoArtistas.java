package modelo.inventario;

import java.util.ArrayList;

public class ColectivoArtistas extends Artista {

	/* 
	 * Atributos
	 */

	private ArrayList<Artista> artistas;

	/* 
	 * Constructor
	 */

	public ColectivoArtistas(String nombre, Artista artista) {
		super(nombre);
		this.agregarArtista(artista);
		artista.agregarColectivo(this);
	}

	/* 
	 * Getters + Setters
	 */

	public String getNombre() {
		return nombre;
	}

	public ArrayList<Artista> getArtistas() {
		return artistas;
	}

	public ArrayList<Pieza> getPiezas() {
		return piezas;
	}

	public void setPiezas() {
		for (Artista a : this.artistas) {
			ArrayList<Pieza> piezasArtista = a.getPiezas();
			for (Pieza p : piezasArtista) {
				this.piezas.add(p);
			}
		}

	}
	
	/* 
	 * Métodos
	 */

	public void agregarArtista(Artista artista) {
		this.artistas.add(artista);
		setPiezas();

	}

}