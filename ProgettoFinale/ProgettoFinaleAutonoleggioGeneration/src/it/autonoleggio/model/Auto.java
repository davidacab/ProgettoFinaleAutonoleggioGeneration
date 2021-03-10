package it.autonoleggio.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the auto database table.
 * 
 */
@Entity
@NamedQuery(name="Auto.findAll", query="SELECT a FROM Auto a")
public class Auto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAuto;

	private String alimentazione;

	private int cilindrata;

	private byte disponibile;

	private String modello;

	private String targa;

	//bi-directional many-to-one association to Marca
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idMarca")
	private Marca marca;

	//bi-directional many-to-one association to Tipologia
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idTipologia")
	private Tipologia tipologia;

	//bi-directional many-to-one association to Noleggio
	@OneToMany(mappedBy="autoBean")
	private List<Noleggio> noleggios;

	public Auto() {
	}

	public int getIdAuto() {
		return this.idAuto;
	}


	public String getAlimentazione() {
		return this.alimentazione;
	}

	public void setAlimentazione(String alimentazione) {
		this.alimentazione = alimentazione;
	}

	public int getCilindrata() {
		return this.cilindrata;
	}

	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}

	public byte getDisponibile() {
		return this.disponibile;
	}

	public void setDisponibile(byte disponibile) {
		this.disponibile = disponibile;
	}

	public String getModello() {
		return this.modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getTarga() {
		return this.targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public Marca getMarca() {
		return this.marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Tipologia getTipologia() {
		return this.tipologia;
	}

	public void setTipologia(Tipologia tipologia) {
		this.tipologia = tipologia;
	}

	public List<Noleggio> getNoleggios() {
		return this.noleggios;
	}

	public void setNoleggios(List<Noleggio> noleggios) {
		this.noleggios = noleggios;
	}

	public Noleggio addNoleggio(Noleggio noleggio) {
		getNoleggios().add(noleggio);
		noleggio.setAutoBean(this);
		return noleggio;
	}

	public Noleggio removeNoleggio(Noleggio noleggio) {
		getNoleggios().remove(noleggio);
		noleggio.setAutoBean(null);

		return noleggio;
	}

}