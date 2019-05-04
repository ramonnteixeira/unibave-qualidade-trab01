package net.unibave.chain;

public class ChainClassificacaoPremiumPlus extends ChainClassificacao {

	@Override
	protected boolean podeClassificar(Cliente cliente) {
		return cliente.getModulos().size() >= 5
				&& cliente
					.getModulos()
					.stream()
					.filter(e -> e instanceof ModuloAvancado)
					.findAny()
					.isPresent();
	}

	@Override
	protected Classificacao getClassificacao() {
		return new ClassificacaoPremiumPlus();
	}

}
