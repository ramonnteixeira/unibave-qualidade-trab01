package net.unibave.criacao.abstracts.chain;

public class ChainClassificacaoBasic extends ChainClassificacao {

	@Override
	protected boolean podeClassificar(Cliente cliente) {
		return true;
	}

	@Override
	protected Classificacao getClassificacao() {
		return new ClassificacaoBasic();
	}

}
