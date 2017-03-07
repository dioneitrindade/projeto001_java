package br.com.projeto.projeto001.dto;

import java.io.Serializable;

public class RetornoDTO implements Serializable {

	private static final long serialVersionUID = 2768816040411021208L;

	private Integer codigoErro;

	private String mensagemErro;

	private Object dados;

	public Integer getCodigoErro() {
		return codigoErro;
	}

	public void setCodigoErro(Integer codigoErro) {
		this.codigoErro = codigoErro;
	}

	public String getMensagemErro() {
		return mensagemErro;
	}

	public void setMensagemErro(String mensagemErro) {
		this.mensagemErro = mensagemErro;
	}

	public Object getDados() {
		return dados;
	}

	public void setDados(Object dados) {
		this.dados = dados;
	}

}
