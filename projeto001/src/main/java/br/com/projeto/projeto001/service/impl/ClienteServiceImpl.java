package br.com.projeto.projeto001.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.projeto.projeto001.dao.ClienteRepository;
import br.com.projeto.projeto001.domain.Cliente;
import br.com.projeto.projeto001.dto.ClienteDTO;
import br.com.projeto.projeto001.dto.RetornoDTO;
import br.com.projeto.projeto001.service.ClienteService;


public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@CrossOrigin
	@RequestMapping(value = "/cadastrarCliente/{numeroCpf}", method = RequestMethod.POST)
	public RetornoDTO cadastrarCliente(@PathVariable String numeroCpf, @RequestBody ClienteDTO dto) {
		System.out.println("Cadastrando cliente: " + numeroCpf);
		RetornoDTO retornoDTO = new RetornoDTO();
		Cliente cliente = clienteRepository.findOne(numeroCpf);
		if (dto.getNumeroCpf() != null && dto.getNomeCliente() != null && dto.getSobreNomeCliente() != null && dto.getObservacao() != null) {
			cliente.setNumeroCpf(dto.getNumeroCpf());
			cliente.setNomeCliente(dto.getNomeCliente());
			cliente.setSobreNomeCliente(dto.getSobreNomeCliente());
			cliente.setObservacao(dto.getObservacao());
			clienteRepository.save(cliente);
			retornoDTO.setCodigoErro(0);
		} else {
			retornoDTO.setCodigoErro(1);
			retornoDTO.setMensagemErro("Parametros não preenchidos.");
		}
		return retornoDTO;
	}
}
