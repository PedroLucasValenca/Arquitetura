package up.edu.br.inventarioresidencial.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Local {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nomeLocacao;
	private String descricao;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomeLocacao() {
		return nomeLocacao;
	}
	public void setNomeLocacao(String nomeLocacao) {
		this.nomeLocacao = nomeLocacao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

}
