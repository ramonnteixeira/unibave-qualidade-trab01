package net.unibave.criacao.abstracts.chain;

public class ChainClassificacaoPremium extends ChainClassificacao {

	@Override
	protected boolean podeClassificar(Cliente cliente) {
		return cliente
					.getModulos()
					.stream()
					.filter(e -> e instanceof ModuloAvancado)
					.findAny()
					.isPresent();
	}

	@Override
	protected Classificacao getClassificacao() {
		return new ClassificacaoPremium();
	}

}
