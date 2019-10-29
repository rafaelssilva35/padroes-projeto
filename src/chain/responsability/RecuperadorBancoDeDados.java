package chain.responsability;

public class RecuperadorBancoDeDados extends RecuperadorArquivo {

	public RecuperadorBancoDeDados(RecuperadorArquivo proximo) {
		super(proximo);
	}

	protected Arquivo recuperaArquivo(String nome) {
		if (nome.length() % 2 == 0)
			return new Arquivo(nome);

		verificarProximoValido();

		return getProximoRecuperador().recuperar(nome);
	}
}
