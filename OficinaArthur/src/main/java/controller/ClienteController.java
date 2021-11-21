package controller;

import java.util.List;

import model.Cliente;
import persistence.ClienteDaoImp;

public class ClienteController {
	public List<Cliente> ListarTodos(Cliente carro) {
		ClienteDaoImp cl = new ClienteDaoImp();
		return cl.ListarTodos(carro);

	}

}
