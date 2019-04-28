package net.unibave.criacao.abstracts.chain;

public class ChainClassificacaoMegaPower extends ChainClassificacao {

	@Override
	protected boolean podeClassificar(Cliente cliente) {
		return cliente.getModulos().size() >= 10
				&& cliente
					.getModulos()
					.stream()
					.filter(e -> e instanceof ModuloAvancado)
					.findAny()
					.isPresent();
	}

	@Override
	protected Classificacao getClassificacao() {
		return new ClassificacaoMegaPower();
	}

}
