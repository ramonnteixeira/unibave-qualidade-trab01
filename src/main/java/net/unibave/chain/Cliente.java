package net.unibave.chain;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private final List<Modulo> modulos;
	
	public Cliente() {
		modulos = new ArrayList<Modulo>();
	}
	
	public void adicionar(Modulo modulo) {
		modulos.add(modulo);
	}

	public List<Modulo> getModulos() {
		return modulos;
	}
}
