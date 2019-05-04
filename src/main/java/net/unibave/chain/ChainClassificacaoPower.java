package net.unibave.chain;

public class ChainClassificacaoPower extends ChainClassificacao {

	@Override
	protected boolean podeClassificar(Cliente cliente) {
		return cliente.getModulos().size() >= 10;
	}

	@Override
	protected Classificacao getClassificacao() {
		return new ClassificacaoPower();
	}

}
