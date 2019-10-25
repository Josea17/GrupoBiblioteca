import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Grupo_estudo implements Identificavel {

	@Id
	private Long id;
	private int horario;
	private String nome_responsavel;
	private String tema_estudo;
	private int dias_reuniao;
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
	public String getNome_responsavel() {
		return nome_responsavel;
	}
	public void setNome_responsavel(String nome_responsavel) {
		this.nome_responsavel = nome_responsavel;
	}
	public String getTema_estudo() {
		return tema_estudo;
	}
	public void setTema_estudo(String tema_estudo) {
		this.tema_estudo = tema_estudo;
	}
	public int getDias_reuniao() {
		return dias_reuniao;
	}
	public void setDias_reuniao(int dias_reuniao) {
		this.dias_reuniao = dias_reuniao;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dias_reuniao;
		result = prime * result + horario;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome_responsavel == null) ? 0 : nome_responsavel.hashCode());
		result = prime * result + ((tema_estudo == null) ? 0 : tema_estudo.hashCode());
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
		Grupo_estudo other = (Grupo_estudo) obj;
		if (dias_reuniao != other.dias_reuniao)
			return false;
		if (horario != other.horario)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome_responsavel == null) {
			if (other.nome_responsavel != null)
				return false;
		} else if (!nome_responsavel.equals(other.nome_responsavel))
			return false;
		if (tema_estudo == null) {
			if (other.tema_estudo != null)
				return false;
		} else if (!tema_estudo.equals(other.tema_estudo))
			return false;
		return true;
	}
	
	
	
	
}
