package entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="pelicula")
public class Pelicula implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nombre")
	private String nombre;
	@Column(name="año")
	private String año;
	@Column(name="director")
	private String director;
	@Column(name="duracion")
	private int duracion;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="pelicula_categoria", 
	           joinColumns = @JoinColumn(name= "pelicula_id"),
	           inverseJoinColumns= @JoinColumn(name="categoria_id"))
	
	private List<Categoria> categorias = new ArrayList<Categoria>();
	
	
	

	
	
	
	
	public Pelicula(String nombre, String año, String director, int duracion,
			List<Categoria> categorias) {
		super();
		this.nombre = nombre;
		this.año = año;
		this.director = director;
		this.duracion = duracion;
		this.categorias = categorias;
	}



	public Pelicula() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public List<Categoria> getCategorias() {
		return categorias;
	}



	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}



	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAño() {
		return año;
	}
	public void setAño(String año) {
		this.año = año;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	

}
