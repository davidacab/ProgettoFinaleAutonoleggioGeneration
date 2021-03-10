package it.autonoleggio.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the marca database table.
 * 
 */
@Entity
@NamedQuery(name="Marca.findAll", query="SELECT m FROM Marca m")
public class Marca implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idMarca;

	private String descrizione;

	//bi-directional many-to-one association to Auto
	@OneToMany(mappedBy="marca")
	private List<Auto> autos;

	public Marca() {
	}
	

	public Marca(String descr) {
		this.descrizione=descr;
	}
	

	public int getIdMarca() {
		return this.idMarca;
	}

	

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public List<Auto> getAutos() {
		return this.autos;
	}

	public void setAutos(List<Auto> autos) {
		this.autos = autos;
	}

	public Auto addAuto(Auto auto) {
		getAutos().add(auto);
		auto.setMarca(this);

		return auto;
	}

	public Auto removeAuto(Auto auto) {
		getAutos().remove(auto);
		auto.setMarca(null);

		return auto;
	}
	@Override
public String toString() {
	return this.descrizione+" -"+this.autos;
}
	
}