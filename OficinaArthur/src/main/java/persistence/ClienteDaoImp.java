package persistence;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.Cliente;
import util.HibernateUtil;

public class ClienteDaoImp implements ClienteDao {
	private Session session;

	public List<Cliente> ListarTodos(Cliente carro) {
		session = null;
		List<Cliente> lista = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.getTransaction().commit();
		} catch (Exception e) {
			if (session != null) {
				session.getTransaction().rollback();
			}
			return lista;
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return lista;
	}

}
