package org.daw.interfaceService;

import java.util.List;

import org.daw.modelo.Cliente;

public interface IClienteService {
	
	public List<Cliente> Listado();
	public int Grabar(Cliente ObjC);

}
