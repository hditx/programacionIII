package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.*;

public class Main {
	public static void main(String asd[]) {
		Cliente p = new Cliente();
		Telefono d = new Telefono();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ClientesMaven");
		EntityManager persistence =  emf.createEntityManager();
		
		p.setNombre("Pablo");
		p.setApellido("Oporto");
		p.setDni(12345678);
		
		d.setNumeroTelefono(34581234);
		d.setClientes(p);
		try {
			persistence.getTransaction().begin();
			persistence.persist(p);
			persistence.persist(d);
			persistence.getTransaction().commit();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			persistence.close();
		}
		
		emf.close();
	}
}
