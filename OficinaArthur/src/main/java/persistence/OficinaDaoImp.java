package persistence;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.Oficina;
import util.HibernateUtil;

public class OficinaDaoImp implements OficinaDao {
	private Session session;

	public List<Oficina> ListarTodos(Oficina carro) {
		session = null;
		List<Oficina> lista = null;
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
