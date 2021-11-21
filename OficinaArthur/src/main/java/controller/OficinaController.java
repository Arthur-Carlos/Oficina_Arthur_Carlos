package controller;

import java.util.List;

import model.Oficina;
import persistence.OficinaDaoImp;

public class OficinaController {
	public List<Oficina> ListarTodos(Oficina carro) {
		OficinaDaoImp of = new OficinaDaoImp();
		return of.ListarTodos(carro);

	}
}
