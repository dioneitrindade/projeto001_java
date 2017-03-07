package br.com.projeto.projeto001.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.projeto.projeto001.domain.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, String> {

}
