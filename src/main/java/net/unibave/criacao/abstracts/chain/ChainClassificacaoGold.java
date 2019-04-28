package net.unibave.criacao.abstracts.chain;

public class ChainClassificacaoGold extends ChainClassificacao {

	@Override
	protected boolean podeClassificar(Cliente cliente) {
		return cliente.getModulos().size() >= 3;
	}

	@Override
	protected Classificacao getClassificacao() {
		return new ClassificacaoGold();
	}

}
