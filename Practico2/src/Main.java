import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		Persona p = new Persona("Robador", "Agustin", new GregorianCalendar(1993, 2, 27), new Documento(1, "DNI", 323));
		Persona p1 = new Persona("Oporto", "Pablo", new GregorianCalendar(1993, 2, 27), new Documento(1, "DNI", 313));
		Cliente c = new Cliente(1, "Oport", 12345, "Colombia 342", 
				new Localidad(1, "Chilecito", new Provincia(1, "La Rioja")), 123123);
		Mascota m = new Mascota(1, new Raza(1, "Siames", 
				new Especie(1, "Gato")), "Marron", new GregorianCalendar(2001, 3, 23), (float) 10.2, "Paco");
		c.addFamilia(p);
		c.addFamilia(p1);
		c.addMascota(m);
		c.getCollectionFamily();
		c.getCollectionPet();
	}

}
