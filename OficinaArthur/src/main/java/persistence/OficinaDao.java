package persistence;

import java.util.List;

import model.Oficina;

public interface OficinaDao {
	public List<Oficina> ListarTodos(Oficina carro);
}
