package it.autonoleggio.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tipologia database table.
 * 
 */
@Entity
@NamedQuery(name="Tipologia.findAll", query="SELECT t FROM Tipologia t")
public class Tipologia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idTipologia;

	private String descrizione;

	private double prezzo;

	//bi-directional many-to-one association to Auto
	@OneToMany(mappedBy="tipologia")
	private List<Auto> autos;

	public Tipologia() {
	}

	public int getIdTipologia() {
		return this.idTipologia;
	}

	

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getPrezzo() {
		return this.prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public List<Auto> getAutos() {
		return this.autos;
	}

	public void setAutos(List<Auto> autos) {
		this.autos = autos;
	}

	public Auto addAuto(Auto auto) {
		getAutos().add(auto);
		auto.setTipologia(this);

		return auto;
	}

	public Auto removeAuto(Auto auto) {
		getAutos().remove(auto);
		auto.setTipologia(null);

		return auto;
	}

}