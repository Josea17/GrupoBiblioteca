
public class GerenciadorBibliotecaImpl implements GerenciadorBlibioteca {

	@Override
	public Aluno cadastrarALuno(Long id, int data_nascimento, String cpf, String nome)
			throws IdInvalidoException, CPFInvalidoException, data_nascimentoInvalidoException, NomeInvalidoException {
		
		Aluno aluno = new Aluno();
		aluno.setId(id);
		aluno.setDataNascimento(data_nascimento);
		aluno.setCpf(cpf);
		aluno.setNome(nome);
		return aluno;
	}

	@Override
	public GrupoEstudo cadastrarGrupoEstudo(Long id, String nomeResponsavel, String temaEstudo, int diasReuniao)
			throws IdInvalidoException, TemaEstudoInvalidoException, DiasReuniaoInvalidoException,
			NomeInvalidoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Livro cadastrarLivro(Long id, String titulo, String autor, int isbn, int data_lancamento)
			throws IdInvalidoException, TituloInvalidoException, NomeInvalidoException, IsbnInvalidoException,
			AnoLancamentoInvalidoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Aluno removeALuno(Long id, int data_nascimento, String cpf, String nome)
			throws IdInvalidoException, CPFInvalidoException, data_nascimentoInvalidoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GrupoEstudo removeGrupoEstudo(Long id, String nomeResponsavel, String temaEstudo, int diasReuniao)
			throws IdInvalidoException, TemaEstudoInvalidoException, DiasReuniaoInvalidoException,
			NomeInvalidoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Livro removeLivro(Long id, String titulo, String autor, int isbn, int data_lancamento)
			throws IdInvalidoException, TituloInvalidoException, NomeInvalidoException, IsbnInvalidoException,
			AnoLancamentoInvalidoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Livro pesquisarLivro(Long id, String titulo, String autor, int isbn, int data_lancamento)
			throws IdInvalidoException, TituloInvalidoException, NomeInvalidoException, IsbnInvalidoException,
			AnoLancamentoInvalidoException {
		// TODO Auto-generated method stub
		return null;
	}

}
