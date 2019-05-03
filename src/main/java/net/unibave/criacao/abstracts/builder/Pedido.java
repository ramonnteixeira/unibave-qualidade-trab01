package net.unibave.criacao.abstracts.builder;

public class Pedido {

	private boolean sanduiche;
	private boolean batata;
	private boolean brinquedo;
	private boolean refrigerante;
	
	public Pedido(Builder builder) {
		super();
		this.sanduiche = builder.sanduiche;
		this.batata = builder.batata;
		this.brinquedo = builder.brinquedo;
		this.refrigerante = builder.refrigerante;
	}

	public static class Builder {
		
		private boolean sanduiche;
		private boolean batata;
		private boolean brinquedo;
		private boolean refrigerante;
		
		public static Builder newInstance() {
			return new Builder();
		}
		
		public Builder sanduiche() {
			sanduiche = true;
			return this;
		}

		public Builder batata() {
			batata = true;
			return this;
		}

		public Builder brinquedo() {
			brinquedo = true;
			return this;
		}

		public Builder refrigerante() {
			refrigerante = true;
			return this;
		}
		
		public Pedido build() {
			return new Pedido(this);
		}
	}
	
	@Override
	public String toString() {
		return "Sanduiche: " + sanduiche + " - Batata: " + batata + " - Brinquedo: " + brinquedo + " - Refrigerante: " +  refrigerante;
	}
}
