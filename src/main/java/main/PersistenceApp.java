package main;

import javax.persistence.*;

import entidades.Alquiler;
import entidades.Categoria;
import entidades.Cliente;
import entidades.Pelicula;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class PersistenceApp {
   public static void main(String[] args) {
	   EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistenceAppPU");
	   EntityManager em = emf.createEntityManager();
	   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	   
	   try {
		   em.getTransaction().begin();
		   LocalDate fechaInicio1 = LocalDate.parse("04-04-2024", formatter);
           LocalDate fechaFin1 = LocalDate.parse("14-04-2024", formatter);
		   
		   Pelicula pelicula1 = new Pelicula();
		   pelicula1.setNombre("Avengers");
		   pelicula1.setAño("2012");
		   pelicula1.setDirector("Josh Whedon");
		   pelicula1.setDuracion(142);
		   
		   

		   
		   Cliente cliente1 = new Cliente("Emanuel Zamora", "Usuario", "emanuel@gmail.com", "123654");
		   Alquiler alquiler1 = new Alquiler();
		   alquiler1.setFechaInicio(fechaInicio1);
		   alquiler1.setFechaFinal(fechaFin1);
		   alquiler1.setEstado("activo");
		   
		   alquiler1.setCliente(cliente1);
           alquiler1.setPelicula(pelicula1);
           
           Categoria categoria1 = new Categoria("Ciencia ficcion", "La ciencia ficción es un género narrativo que sitúa la acción en unas coordenadas espacio-temporales imaginarias y diferentes a las nuestras");
		   Categoria categoria2 = new Categoria("Drama", "Peliculas que te dejaran los pelos de punta y te dejaran pensando con sus atrapantes tramas");
		   
		   pelicula1.getCategorias().add(categoria1);
		   
		   em.persist(pelicula1);
		   em.persist(alquiler1);
		   em.persist(cliente1);
		   
		   em.flush();
		   
		   em.getTransaction().commit();
		   
	   }catch (Exception e) {
		   em.getTransaction().rollback();
		   
	   }
	   em.close();
	   emf.close();
   }
}
