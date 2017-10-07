package br.com.viagemFundoMar.data;

/**
 * Class that encapsulates the movements of submarine
 * @author carlos
 *
 */
public enum Comando {
	DIREITA("R"),
	ESQUERDA("L"),
	SUBIR("U"),
	DESCER("D"),
	MOVER("M");
	
	private String comando;
	
	Comando(String comando) {
		this.comando = comando;
	}
	
	public String getComando() {
		return this.comando;
	}
	
}
