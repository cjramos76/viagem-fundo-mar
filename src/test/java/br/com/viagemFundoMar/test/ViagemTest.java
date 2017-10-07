package br.com.viagemFundoMar.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.viagemFundoMar.data.Direcao;
import br.com.viagemFundoMar.data.Submarino;
import br.com.viagemFundoMar.service.MovimentoSubmarino;

public class ViagemTest {

	private static final Submarino submarino = new Submarino(0, 0, 0, Direcao.NORTE);
	
	/*
	 * Testando um movimento a direita e avançar
	 */
	@Test
	public void testAvancarDireita() {
		MovimentoSubmarino movimentoSub = new MovimentoSubmarino();
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
		String movimento = "DM";
		String posicaoFinal = movimentoSub.executarComando(submarino, movimento);
		String posicaoEsperada = "0 1 -1 NORTE";
		assertEquals(posicaoEsperada, posicaoFinal);
	}
	
	/*
	 * Testando movimento exemplo da prova
	 */
	@Test
	public void testMovimentoExemplo() {
		MovimentoSubmarino movimentoSub = new MovimentoSubmarino();
		String movimento = "LMRDDMMUU";
		String posicaoFinal = movimentoSub.executarComando(submarino, movimento);
		String posicaoEsperada = "-1 2 0 NORTE";
		assertEquals(posicaoEsperada, posicaoFinal);
	}
	
	@Test
	public void testMovimentoExemploExecucao() {
		MovimentoSubmarino movimentoSub = new MovimentoSubmarino();
		String movimento = "RMMLMMMDDLL";
		String posicaoFinal = movimentoSub.executarComando(submarino, movimento);
		String posicaoEsperada = "2 3 -2 SUL";
		assertEquals(posicaoEsperada, posicaoFinal);
	}
}