package jankenpon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JogadaTest {

	@Test
	void testPedra() {
		Jogada pedra = new Jogada(Escolha.PEDRA);
		Jogada papel = new Jogada(Escolha.PAPEL);
		Jogada tesoura = new Jogada(Escolha.TESOURA);
		assertEquals(Resultado.EMPATOU, pedra.compararCom(pedra));
		assertEquals(Resultado.PERDEU, pedra.compararCom(papel));
		assertEquals(Resultado.GANHOU, pedra.compararCom(tesoura));
	}
	
	@Test
	void testTesoura() {
		Jogada pedra = new Jogada(Escolha.PEDRA);
		Jogada papel = new Jogada(Escolha.PAPEL);
		Jogada tesoura = new Jogada(Escolha.TESOURA);
		assertEquals(Resultado.PERDEU, tesoura.compararCom(pedra));
		assertEquals(Resultado.GANHOU, tesoura.compararCom(papel));
		assertEquals(Resultado.EMPATOU, tesoura.compararCom(tesoura));		
	}

	@Test
	void testPapel() {
		Jogada pedra = new Jogada(Escolha.PEDRA);
		Jogada papel = new Jogada(Escolha.PAPEL);
		Jogada tesoura = new Jogada(Escolha.TESOURA);
		assertEquals(Resultado.GANHOU, papel.compararCom(pedra));
		assertEquals(Resultado.EMPATOU, papel.compararCom(papel));
		assertEquals(Resultado.PERDEU, papel.compararCom(tesoura));		
	}
	
	
}
