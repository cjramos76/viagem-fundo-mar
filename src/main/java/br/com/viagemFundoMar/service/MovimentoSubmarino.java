package br.com.viagemFundoMar.service;

import br.com.viagemFundoMar.data.Comando;
import br.com.viagemFundoMar.data.Submarino;

/**
 * Business class for moving the submarine
 * @author carlos
 *
 */
public class MovimentoSubmarino extends ParentService {

	public MovimentoSubmarino() {
		super();
	}
	
	public String executarComando(Submarino submarino, String movimento) {
		String movimentos[] = movimento.split("");
		
		for (String m : movimentos) {
			if (m.equals(Comando.DESCER.getComando())) {
				submarino.descer();
			} else if (m.equals(Comando.SUBIR.getComando())){
				submarino.subir();
			} else if (m.equals(Comando.DIREITA.getComando())) {
				submarino.virarDireita();
			} else if (m.equals(Comando.ESQUERDA.getComando())) {
				submarino.virarEsquerda();
			} else if (m.equals(Comando.MOVER.getComando())) {
				submarino.mover();
			}
		}
		
		return submarino.toString();
	}
	
}
