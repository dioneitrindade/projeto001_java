package br.com.projeto.projeto001.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cliente", schema = "projeto001")
public class Cliente extends BaseEntity {

	private static final long serialVersionUID = 954597763935933794L;

	@Id
	@Column(name = "NumeroCPF")
	private String numeroCpf;
	
	
	@Column(name = "NomeCliente")
	private String nomeCliente;
	
	@Column(name = "SobreNomeCliente")
	private String sobreNomeCliente;
	
	@Column(name = "Observacao")
	private String observacao;

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getSobreNomeCliente() {
		return sobreNomeCliente;
	}

	public void setSobreNomeCliente(String sobreNomeCliente) {
		this.sobreNomeCliente = sobreNomeCliente;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	@Override
	public int hashCode() {
		return this.numeroCpf.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Cliente))
			return false;
		Cliente cliente = (Cliente) obj;
		return this.numeroCpf == cliente.getNumeroCpf();
	}

	@Override
	public String toString() {
		return "Cliente [numeroCpf=" + numeroCpf + ", nomeCliente=" + nomeCliente + ", sobreNomeCliente="
				+ sobreNomeCliente + ", observacao=" + observacao + "]";
	}
}
