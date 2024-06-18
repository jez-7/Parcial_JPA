package entidades;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name= "categoria")
public class Categoria implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name ="nombre")
	private String nombre;
	@Column(name ="descripcion")
	private String descripcion;
	
	
	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Categoria(String nombre, String descripcion) {
		
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
