import java.util.Set; 
import javax.persistence.JoinColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class GrupoEstudo implements Identificavel {

	@Id
	private Long id;
	private int horario;
	private String nomeResponsavel;
	private String temaEstudo;

	private int diasReuniao;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getHorario() {
		return horario;
	}
	public void setHorario(int horario) {
		this.horario = horario;
	}
	public String getNomeResponsavel() {
		return nomeResponsavel;
	}
	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}
	public String getTemaEstudo() {
		return temaEstudo;
	}
	public void setTemaEstudo(String temaEstudo) {
		this.temaEstudo = temaEstudo;
	}
	public int getDiasReuniao() {
		return diasReuniao;
	}
	public void setDiasReuniao(int diasReuniao) {
		this.diasReuniao = diasReuniao;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + diasReuniao;
		result = prime * result + horario;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nomeResponsavel == null) ? 0 : nomeResponsavel.hashCode());
		result = prime * result + ((temaEstudo == null) ? 0 : temaEstudo.hashCode());
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
		GrupoEstudo other = (GrupoEstudo) obj;
		if (diasReuniao != other.diasReuniao)
			return false;
		if (horario != other.horario)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nomeResponsavel == null) {
			if (other.nomeResponsavel != null)
				return false;
		} else if (!nomeResponsavel.equals(other.nomeResponsavel))
			return false;
		if (temaEstudo == null) {
			if (other.temaEstudo != null)
				return false;
		} else if (!temaEstudo.equals(other.temaEstudo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "GrupoEstudo [id=" + id + ", horario=" + horario + ", nomeResponsavel=" + nomeResponsavel
				+ ", temaEstudo=" + temaEstudo + ", diasReuniao=" + diasReuniao + "]";
	}
	
	
	 @ManyToMany
	  @JoinTable(
			  name = "Grupoestudo_Livro", 
			  joinColumns = @JoinColumn(name = "Grupoestudo_id"),
			  inverseJoinColumns = @JoinColumn(name = "Livro_id"))
			  private Set<Livro> livros;
	
	 @ManyToMany
	  @JoinTable(
			  name = "Grupoestudo_Aluno", 
			  joinColumns = @JoinColumn(name = "Grupoestudo_id"),
			  inverseJoinColumns = @JoinColumn(name = "Aluno_id"))
			  private Set<Aluno> alunos;
	
}
