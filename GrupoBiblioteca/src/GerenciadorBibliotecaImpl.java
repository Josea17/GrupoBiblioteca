
public class GerenciadorBibliotecaImpl implements GerenciadorBlibioteca {

	@Override
	public Aluno cadastrarALuno(Long id, int data_nascimento, String cpf, String nome)
			throws IdInvalidoException, CPFInvalidoException, data_nascimentoInvalidoException, NomeInvalidoException {

		Aluno aluno = new Aluno();
		aluno.setId(id);
		aluno.setDataNascimento(data_nascimento);
		aluno.setCpf(cpf);
		aluno.setNome(nome);
		DAO<Aluno> dao = new DAO<Aluno>();
		dao.save(aluno);
		return aluno;
	}

	@Override
	public GrupoEstudo cadastrarGrupoEstudo(Long id, String nomeResponsavel, String temaEstudo, int diasReuniao,
			String tema) throws IdInvalidoException, TemaEstudoInvalidoException, DiasReuniaoInvalidoException,
			NomeInvalidoException {
		GrupoEstudo grupo = new GrupoEstudo();
		grupo.setId(id);
		grupo.setDiasReuniao(diasReuniao);
		grupo.setNomeResponsavel(nomeResponsavel);
		DAO<GrupoEstudo> dao = new DAO<GrupoEstudo>();
		dao.save(grupo);
		return grupo;
	}
	@Override
	public Livro cadastrarLivro(Long id, String titulo, String autor, int isbn, int data_lancamento)
			throws IdInvalidoException, TituloInvalidoException, NomeInvalidoException, IsbnInvalidoException,
			AnoLancamentoInvalidoException {
		Livro livro = new Livro();
		livro.setAnoLancamento(data_lancamento);
		livro.setTitulo(titulo);
		livro.setAutor(autor);
		livro.setIsbn(isbn);
		livro.setId(id);
		DAO<Livro> dao = new DAO<Livro>();
		dao.save(livro);
		return livro;
	}

	@Override
	public Aluno removeALuno(Long id, int data_nascimento, String cpf, String nome)
			throws IdInvalidoException, CPFInvalidoException, data_nascimentoInvalidoException {
		Aluno aluno = new Aluno();
		aluno.setId(id);
		aluno.setDataNascimento(data_nascimento);
		aluno.setCpf(cpf);
		aluno.setNome(nome);
		DAO<Aluno> dao = new DAO<Aluno>();
		dao.remove(aluno);
		return aluno;
	}

	@Override
	public GrupoEstudo removeGrupoEstudo(Long id, String nomeResponsavel, String temaEstudo, int diasReuniao)
			throws IdInvalidoException, TemaEstudoInvalidoException, DiasReuniaoInvalidoException,
			NomeInvalidoException {
		GrupoEstudo grupo = new GrupoEstudo();
		grupo.setId(id);
		grupo.setDiasReuniao(diasReuniao);
		grupo.setNomeResponsavel(nomeResponsavel);
		DAO<GrupoEstudo> dao = new DAO<GrupoEstudo>();
		dao.remove(grupo);
		return grupo;
	}

	@Override
	public Livro removeLivro(Long id, String titulo, String autor, int isbn, int data_lancamento)
			throws IdInvalidoException, TituloInvalidoException, NomeInvalidoException, IsbnInvalidoException,
			AnoLancamentoInvalidoException {
		Livro livro = new Livro();
		livro.setAnoLancamento(data_lancamento);
		livro.setTitulo(titulo);
		livro.setAutor(autor);
		livro.setIsbn(isbn);
		livro.setId(id);
		DAO<Livro> dao = new DAO<Livro>();
		dao.remove(livro);
		return livro;
	}

	@Override
	public Livro pesquisarLivro(Long id, String titulo, String autor, int isbn, int data_lancamento)
			throws IdInvalidoException, TituloInvalidoException, NomeInvalidoException, IsbnInvalidoException,
			AnoLancamentoInvalidoException {
		Livro livro = new Livro();
		livro.getAnoLancamento();
		livro.getAutor();
		livro.getId();
		livro.getTitulo();
		livro.getIsbn();
		DAO<Livro> dao = new DAO<Livro>();
		dao.save(livro);
		return livro;
	}

	@Override
	public GrupoEstudo cadastrarGrupoEstudo(Long id, String nomeResponsavel, String temaEstudo, int diasReuniao)
			throws IdInvalidoException, TemaEstudoInvalidoException, DiasReuniaoInvalidoException,
			NomeInvalidoException {
		GrupoEstudo grupo = new GrupoEstudo();
		grupo.setId(id);
		grupo.setDiasReuniao(diasReuniao);
		grupo.setNomeResponsavel(nomeResponsavel);
		DAO<GrupoEstudo> dao = new DAO<GrupoEstudo>();
		dao.save(grupo);
		return grupo;
	}


}
