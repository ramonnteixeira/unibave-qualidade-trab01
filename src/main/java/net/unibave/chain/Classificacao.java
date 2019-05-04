package net.unibave.chain;

public abstract class Classificacao {

	public final void direcionarLigacao() {
		System.out.println(String.format("Direcionando a ligação para o %s", getResponsavel()));
	}

	protected abstract String getResponsavel();
	
}
