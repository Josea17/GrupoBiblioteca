import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aluno implements Identificavel {

	@Id
	private Long id;
	private String nome;
	private int data_nascimento;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(int data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + data_nascimento;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (data_nascimento != other.data_nascimento)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", data_nascimento=" + data_nascimento + "]";
	}
	
	
}
