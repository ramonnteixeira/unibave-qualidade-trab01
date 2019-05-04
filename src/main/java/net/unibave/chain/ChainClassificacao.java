package net.unibave.chain;

public abstract class ChainClassificacao {

	private ChainClassificacao nextInstance;
	
	public ChainClassificacao next(ChainClassificacao next) {
		this.nextInstance = next;
		return this;
	}

	public Classificacao classificar(Cliente cliente) {
		if (podeClassificar(cliente)) {
			return getClassificacao();
		} else if (nextInstance != null) {
			return nextInstance.classificar(cliente);
		}
		throw new RuntimeException("Nenhuma classificação disponível");
	}
	
	protected abstract boolean podeClassificar(Cliente cliente);
	protected abstract Classificacao getClassificacao();
}
