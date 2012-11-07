package ar.iariel.siscom.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Date : 07/10/2012
 * @author Ariel Duarte
 *
 */
@Entity
@Table(name="grupo")
public class Grupo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="gru_codigo")
	private Integer codigo;
	
	@Column(name="gru_nombre")
	private String nombre;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Transient
	public boolean isValido() {
		if (nombre == null || nombre.equals(""))
			return false;
		
		return true;
	}
	
	
}
