
public interface GerenciadorBlibioteca {

	public Aluno cadastrarALuno( Long id, int data_nascimento, String cpf, String nome) throws IdInvalidoException, CPFInvalidoException, 
	data_nascimentoInvalidoException, NomeInvalidoException;
	
	public Responsavel cadastrarResponsavel(Long id, String nome) throws IdInvalidoException, NomeInvalidoException;
	
	public Grupo_estudo cadastrarGrupo_estudo(Long id, String nome_responsavel, int quantidade_alunos) throws IdInvalidoException, 
	NomeInvalidoException, Quantidade_alunosInvalidaException;
	
	public Livro cadastrarLivro(Long id, String titulo, String autor, int isbn, int data_lancamento ) throws IdInvalidoException, 
	TituloInvalidoException, NomeInvalidoException, IsbnInvalidoException, Data_lancamentoInvalidoException;
	
	public Responsavel removeResponsavel(Long id, String nome) throws IdInvalidoException, NomeInvalidoException;
	
	public Aluno removeALuno(Long id, int data_nascimento, String cpf, String nome) throws IdInvalidoException, CPFInvalidoException, 
	data_nascimentoInvalidoException;
	
	public Grupo_estudo removeGrupo_estudo(Long id, String nome_responsavel, int quantidade_alunos) throws IdInvalidoException, NomeInvalidoException,
	Quantidade_alunosInvalidaException;
	
	public Livro removeLivro(Long id, String titulo, String autor, int isbn, int data_lancamento ) throws IdInvalidoException, 
	TituloInvalidoException, NomeInvalidoException, IsbnInvalidoException, Data_lancamentoInvalidoException;
}