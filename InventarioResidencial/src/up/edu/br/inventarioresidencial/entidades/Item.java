package up.edu.br.inventarioresidencial.entidades;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Item {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nomeItem;
	private int quantidade;
	private Date dataArmazenamento;
	private Local local;
	private TipoDeUso tipoDeUso;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomeItem() {
		return nomeItem;
	}
	public void setNomeItem(String nomeItem) {
		this.nomeItem = nomeItem;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;	
	}
	public Date getDataArmazenamento() {
		return dataArmazenamento;
	}
	public void setDataArmazenamento(Date dataArmazenamento) {
		this.dataArmazenamento = dataArmazenamento;
	}
	public Local getLocal() {
		return local;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
	public TipoDeUso getTipoDeUso() {
		return tipoDeUso;
	}
	public void setTipoDeUso(TipoDeUso tipoDeUso) {
		this.tipoDeUso = tipoDeUso;
	}
	
	

}
