package net.unibave.chain;

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
