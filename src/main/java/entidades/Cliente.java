package entidades;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="cliente")
public class Cliente implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nombre")
	private String nombre;
	@Column(name="rol")
	private String rol;
	@Column(name="correo", unique = true)
	private String correo;
	@Column(name="contraseña", unique = true)
	private String contraseña;
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Cliente(String nombre, String rol, String correo, String contraseña) {
		super();
		
		this.nombre = nombre;
		this.rol = rol;
		this.correo = correo;
		this.contraseña = contraseña;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	
	
	

	
	
	
	
	
	
	

}
