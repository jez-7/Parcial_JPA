package entidades;

import java.io.Serializable;
import java.time.LocalDate;	
import javax.persistence.*;

@Entity
@Table(name="alquiler")
public class Alquiler implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="fk_cliente")
	private Cliente cliente;
	
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="fk_pelicula")
	private Pelicula pelicula;
	
	
	
	
    @Column(name="fechaInicio")
	private LocalDate  fechaInicio;
	@Column(name="fechaFinal")
	private LocalDate  fechaFinal;
	@Column(name="estado")
	private String estado;
	
	

	public Alquiler() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Alquiler(LocalDate  fechaInicio, LocalDate  fechaFinal, String estado) {

		this.fechaInicio = fechaInicio;
		this.fechaFinal = fechaFinal;
		this.estado = estado;
	}
	
	

	public Alquiler(Cliente cliente, Pelicula pelicula, LocalDate  fechaInicio, LocalDate  fechaFinal, String estado) {
		super();
		this.cliente = cliente;
		this.pelicula = pelicula;
		this.fechaInicio = fechaInicio;
		this.fechaFinal = fechaFinal;
		this.estado = estado;
	}
	
	
	
	

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public LocalDate  getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate  fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate  getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(LocalDate  fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	
	

}
