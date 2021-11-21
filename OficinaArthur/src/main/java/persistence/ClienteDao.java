package persistence;

import java.util.List;

import model.Cliente;

public interface ClienteDao {
	public List<Cliente> ListarTodos(Cliente carro);
}