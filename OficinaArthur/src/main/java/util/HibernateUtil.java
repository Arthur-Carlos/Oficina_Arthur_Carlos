package util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import model.Carro;
import model.Cliente;
import model.Oficina;

public class HibernateUtil {
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
// loads configuration and mappings
			Configuration configuration = new Configuration().configure();
			configuration.addPackage("br.com.prog3.aula9.model");
			configuration.addAnnotatedClass(Carro.class);
			configuration.addAnnotatedClass(Cliente.class);
			configuration.addAnnotatedClass(Oficina.class);
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties()).build();
// builds a session factory from the service registry
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		}
		return sessionFactory;
	}
}