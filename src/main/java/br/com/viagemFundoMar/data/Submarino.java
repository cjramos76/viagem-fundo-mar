package br.com.viagemFundoMar.data;
 
/**
 * Class submarine with x, y, depth and direction
 * Define all the possibles movements of the submarine
 * @author carlos
 *
 */
public class Submarino extends ParentData {
	private int coordenadaX;
	private int coordenadaY;
	private int profundidade;
	private Direcao direcao;

	public Submarino() {
		super();
	}
	
	public Submarino(int coordenadaX, int coordenadaY, int profundidade, Direcao direcao) {
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
		this.profundidade = profundidade;
		this.direcao = direcao;
	}
	
	public String toString() {
		return coordenadaX + " " + coordenadaY + " " + profundidade + " " + direcao;
	}

	public void mover() {
		if (this.getDirecao().equals(Direcao.NORTE)) {
			this.coordenadaY += 1;
		} else if (this.getDirecao().equals(Direcao.LESTE)) {
			this.coordenadaX += 1;
		} else if (this.getDirecao().equals(Direcao.SUL)) {
			this.coordenadaY -= 1;
		} else if (this.getDirecao().equals(Direcao.OESTE)) {
			this.coordenadaX -= 1;
		}
	}
	public void virarDireita() {
		if (this.getDirecao().equals(Direcao.NORTE)) {
			this.direcao = Direcao.LESTE;
		} else if (this.getDirecao().equals(Direcao.LESTE)) {
			this.direcao = Direcao.SUL;
		} else if (this.getDirecao().equals(Direcao.SUL)) {
			this.direcao = Direcao.OESTE;
		} else if (this.getDirecao().equals(Direcao.OESTE)) {
			this.direcao = Direcao.NORTE;
		}
	}

	public void virarEsquerda() {
		if (this.getDirecao().equals(Direcao.NORTE)) {
			this.direcao = Direcao.OESTE;
		} else if (this.getDirecao().equals(Direcao.OESTE)) {
			this.direcao = Direcao.SUL;
		} else if (this.getDirecao().equals(Direcao.SUL)) {
			this.direcao = Direcao.LESTE;
		} else if (this.getDirecao().equals(Direcao.LESTE)) {
			this.direcao = Direcao.NORTE;
		}
	}

	public void subir() {
		if (this.profundidade<0) {
			this.profundidade += 1;
		}
	}

	public void descer() {
		this.profundidade -= 1;
	}

	public int getCoordenadaX() {
		return coordenadaX;
	}

	public void setCoordenadaX(int coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	public int getCoordenadaY() {
		return coordenadaY;
	}

	public void setCoordenadaY(int coordenadaY) {
		this.coordenadaY = coordenadaY;
	}

	public int getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(int profundidade) {
		this.profundidade = profundidade;
	}

	public Direcao getDirecao() {
		return direcao;
	}

	public void setDirecao(Direcao direcao) {
		this.direcao = direcao;
	}

}
