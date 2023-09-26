package org.daw.services;

import java.util.List;

import org.daw.interfaceService.IClienteService;
import org.daw.interfaces.ICliente;
import org.daw.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServices implements IClienteService{

	@Autowired
	private ICliente data;
	
	
	@Override
	public List<Cliente> Listado() {
		return (List<Cliente>)data.findAll();
	}

	@Override
	public int Grabar(Cliente ObjC) {
		
		int grabar = 0;
		Cliente c = data.save(ObjC);
		
		if(!c.equals(null))
			grabar = 1;
		
		return grabar;
	}

}
