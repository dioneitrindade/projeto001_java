package br.com.projeto.projeto001.dto;

import java.io.Serializable;

public class ClienteDTO implements Serializable {

	private static final long serialVersionUID = -9078767995076031932L;

	private String numeroCpf;
	
	private String nomeCliente;
	
	private String sobreNomeCliente;
	
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
}
