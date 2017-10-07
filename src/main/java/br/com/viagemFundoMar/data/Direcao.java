package br.com.viagemFundoMar.data;

/**
 * Class that encapsulates the four possible directions
 * @author carlos
 *
 */
public enum Direcao {
	NORTE("NORTE"),
	SUL("SUL"),
	LESTE("LESTE"),
	OESTE("OESTE");
	
	private String direcao;
	Direcao(String direcao) {
		this.direcao = direcao;
	}
	
	public String getDirecao() {
		return this.direcao;
	}
}
