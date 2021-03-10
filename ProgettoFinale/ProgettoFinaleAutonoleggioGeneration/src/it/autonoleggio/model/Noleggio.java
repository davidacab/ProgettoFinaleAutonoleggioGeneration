package it.autonoleggio.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the noleggio database table.
 * 
 */
@Entity
@NamedQuery(name="Noleggio.findAll", query="SELECT n FROM Noleggio n")
public class Noleggio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idNoleggio;

	private String dataFine;

	private String dataInizio;

	//bi-directional many-to-one association to Auto
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="auto")
	private Auto autoBean;

	//bi-directional many-to-one association to Cliente
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cliente")
	private Cliente clienteBean;

	public Noleggio() {
	}

	public int getIdNoleggio() {
		return this.idNoleggio;
	}

	

	public String getDataFine() {
		return this.dataFine;
	}

	public void setDataFine(String dataFine) {
		this.dataFine = dataFine;
	}

	public String getDataInizio() {
		return this.dataInizio;
	}

	public void setDataInizio(String dataInizio) {
		this.dataInizio = dataInizio;
	}

	public Auto getAutoBean() {
		return this.autoBean;
	}

	public void setAutoBean(Auto autoBean) {
		this.autoBean = autoBean;
	}

	public Cliente getClienteBean() {
		return this.clienteBean;
	}

	public void setClienteBean(Cliente clienteBean) {
		this.clienteBean = clienteBean;
	}

}