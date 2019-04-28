package net.unibave.criacao.abstracts.chain;

public class ClassificaCliente {

	private static final ClassificaCliente INSTANCE = new ClassificaCliente();
	private ChainClassificacao chain;
	
	private ClassificaCliente() {
		chain = new ChainClassificacaoMegaPower()
				.next(new ChainClassificacaoPower()
				.next(new ChainClassificacaoPremiumPlus()
				.next(new ChainClassificacaoPremium()
				.next(new ChainClassificacaoGold()
				.next(new ChainClassificacaoBasic()
				)))));
	}
	
	public static ClassificaCliente getInstance() {
		return INSTANCE;
	}

	public Classificacao classificar(Cliente cliente) {
		return chain.classificar(cliente);
	}
}
