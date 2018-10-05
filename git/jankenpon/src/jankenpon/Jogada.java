package jankenpon;

public class Jogada {

	private Escolha escolha;

	public Jogada(Escolha escolha) {
		this.escolha = escolha;
	}

	public Escolha getEscolha() {
		return this.escolha;
	}

	public Resultado compararCom(Jogada jogada) {
		switch (this.escolha) {
		case PEDRA:
			return jogada.compararComPedra(escolha);
		case PAPEL:
			return jogada.compararComPapel(escolha);
		case TESOURA:
			return;
		default:
			break;
		}
		return null;
	}

	protected Resultado compararComPedra(Escolha adversario) {
		if (adversario == Escolha.PAPEL) {
			return Resultado.PERDEU;
		} else if (adversario == Escolha.PEDRA) {
			return Resultado.EMPATOU;
		} else {
			return Resultado.GANHOU;
		}
	}
	protected Resultado compararComPapel(Escolha adversario) {
		if (adversario == Escolha.PAPEL) {
			return Resultado.EMPATOU;
		} else if (adversario == Escolha.PEDRA) {
			return Resultado.GANHOU;
		} else {
			return Resultado.PERDEU;
		}
	}

}
