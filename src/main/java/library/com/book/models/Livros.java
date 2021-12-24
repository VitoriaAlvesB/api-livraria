package library.com.book.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Livros")
public class Livros implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Integer id;
	
	private String nome;
	private String autor;
	private String dataAdicionado;
	private String dataConcluido;
	private int nota;
	private String status;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getDataAdicionado() {
		return dataAdicionado;
	}
	public void setDataAdicionado(String dataAdicionado) {
		this.dataAdicionado = dataAdicionado;
	}
	public String getDataConcluido() {
		return dataConcluido;
	}
	public void setDataConcluido(String dataConcluido) {
		this.dataConcluido = dataConcluido;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
