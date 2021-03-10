package it.autonoleggio.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2021-02-11T10:30:52.345+0100")
@StaticMetamodel(Noleggio.class)
public class Noleggio_ {
	public static volatile SingularAttribute<Noleggio, Integer> idNoleggio;
	public static volatile SingularAttribute<Noleggio, String> dataFine;
	public static volatile SingularAttribute<Noleggio, String> dataInizio;
	public static volatile SingularAttribute<Noleggio, Auto> autoBean;
	public static volatile SingularAttribute<Noleggio, Cliente> clienteBean;
}
