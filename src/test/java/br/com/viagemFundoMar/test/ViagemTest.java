package br.com.viagemFundoMar.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.viagemFundoMar.data.Direcao;
import br.com.viagemFundoMar.data.Submarino;
import br.com.viagemFundoMar.service.MovimentoSubmarino;

public class ViagemTest {

	/*
	 * Testando um movimento a direita e avançar
	 */
	@Test
	public void testAvancarDireita() {
		MovimentoSubmarino movimentoSub = new MovimentoSubmarino();
		Submarino submarino = new Submarino(0, 0, 0, Direcao.NORTE);
		String movimento = "RM";
		String posicaoFinal = movimentoSub.executarComando(submarino, movimento);
		String posicaoEsperada = "1 0 0 LESTE";
		assertEquals(posicaoEsperada, posicaoFinal);
	}

	/*
	 * Testando um movimento a esquerda e avançar
	 */
	@Test
	public void testAvancarEsquerda() {
		MovimentoSubmarino movimentoSub = new MovimentoSubmarino();
		Submarino submarino = new Submarino(0, 0, 0, Direcao.NORTE);
		String movimento = "LM";
		String posicaoFinal = movimentoSub.executarComando(submarino, movimento);
		String posicaoEsperada = "-1 0 0 OESTE";
		assertEquals(posicaoEsperada, posicaoFinal);
	}

	/*
	 * Testando um movimento subir e avançar
	 */
	@Test
	public void testSubir() {
		MovimentoSubmarino movimentoSub = new MovimentoSubmarino();
		Submarino submarino = new Submarino(0, 0, -2, Direcao.NORTE);
		String movimento = "UM";
		String posicaoFinal = movimentoSub.executarComando(submarino, movimento);
		String posicaoEsperada = "0 1 -1 NORTE";
		assertEquals(posicaoEsperada, posicaoFinal);
	}

	/*
	 * Testando um movimento subir desde a superificie e avançar
	 */
	@Test
	public void testSubirSuperficie() {
		MovimentoSubmarino movimentoSub = new MovimentoSubmarino();
		Submarino submarino = new Submarino(0, 0, 0, Direcao.NORTE);
		String movimento = "UM";
		String posicaoFinal = movimentoSub.executarComando(submarino, movimento);
		String posicaoEsperada = "0 1 0 NORTE";
		assertEquals(posicaoEsperada, posicaoFinal);
	}

	/*
	 * Testando um movimento descer e avançar
	 */
	@Test
	public void testDescer() {
		MovimentoSubmarino movimentoSub = new MovimentoSubmarino();
		Submarino submarino = new Submarino(0, 0, 0, Direcao.NORTE);
		String movimento = "DM";
		String posicaoFinal = movimentoSub.executarComando(submarino, movimento);
		String posicaoEsperada = "0 1 -1 NORTE";
		assertEquals(posicaoEsperada, posicaoFinal);
	}
	
	/*
	 * Testando movimento exemplo da prova
	 */
	@Test
	public void movimentoExercicio() {
		MovimentoSubmarino movimentoSub = new MovimentoSubmarino();
		Submarino submarino = new Submarino(0, 0, 0, Direcao.NORTE);
		String movimento = "LMRDDMMUU";
		String posicaoFinal = movimentoSub.executarComando(submarino, movimento);
		String posicaoEsperada = "-1 2 0 NORTE";
		assertEquals(posicaoEsperada, posicaoFinal);
	}
}