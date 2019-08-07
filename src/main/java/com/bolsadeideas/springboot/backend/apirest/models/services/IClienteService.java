package com.bolsadeideas.springboot.backend.apirest.models.services;

import java.util.List;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public Cliente save(Cliente cliente);
	
	public Cliente findById(Long id);
	
	public void delete(Cliente cliente);

}
