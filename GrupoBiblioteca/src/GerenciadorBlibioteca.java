
public interface GerenciadorBlibioteca {

	public Aluno cadastrarALuno( Long id, int data_nascimento, String cpf, String nome) throws IdInvalidoException, CPFInvalidoException, 
	data_nascimentoInvalidoException, NomeInvalidoException;
	
	public GrupoEstudo cadastrarGrupoEstudo(Long id, String nomeResponsavel, String temaEstudo, int diasReuniao ) throws 
	IdInvalidoException, TemaEstudoInvalidoException, DiasReuniaoInvalidoException, NomeInvalidoException; 
	
	public Livro cadastrarLivro(Long id, String titulo, String autor, int isbn, int data_lancamento ) throws IdInvalidoException, 
	TituloInvalidoException, NomeInvalidoException, IsbnInvalidoException, AnoLancamentoInvalidoException;
	
	public Aluno removeALuno(Long id, int data_nascimento, String cpf, String nome) throws IdInvalidoException, CPFInvalidoException, 
	data_nascimentoInvalidoException;
	
	public GrupoEstudo removeGrupoEstudo(Long id, String nomeResponsavel, String temaEstudo, int diasReuniao ) throws 
	IdInvalidoException, TemaEstudoInvalidoException, DiasReuniaoInvalidoException, NomeInvalidoException; 
	
	public Livro removeLivro(Long id, String titulo, String autor, int isbn, int data_lancamento ) throws IdInvalidoException, 
	TituloInvalidoException, NomeInvalidoException, IsbnInvalidoException, AnoLancamentoInvalidoException;
	
	GrupoEstudo cadastrarGrupoEstudo(Long id, String nomeResponsavel, String temaEstudo, int diasReuniao, String tema)
			throws IdInvalidoException, TemaEstudoInvalidoException, DiasReuniaoInvalidoException,
			NomeInvalidoException;

	Livro pesquisarLivro(Long id) throws IdInvalidoException;
	
	
	
	
	
}
