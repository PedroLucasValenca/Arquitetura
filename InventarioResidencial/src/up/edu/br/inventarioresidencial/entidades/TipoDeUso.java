package up.edu.br.inventarioresidencial.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class TipoDeUso {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nomeTipoDeUso;
	private String descricao;
	private String aplicacao;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomeTipoDeUso() {
		return nomeTipoDeUso;
	}
	public void setNomeTipoDeUso(String nomeTipoDeUso) {
		this.nomeTipoDeUso = nomeTipoDeUso;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getAplicacao() {
		return aplicacao;
	}
	public void setAplicacao(String aplicacao) {
		this.aplicacao = aplicacao;
	}

}
