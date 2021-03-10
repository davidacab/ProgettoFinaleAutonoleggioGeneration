package it.autonoleggio.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2021-02-11T10:30:52.354+0100")
@StaticMetamodel(Tipologia.class)
public class Tipologia_ {
	public static volatile SingularAttribute<Tipologia, Integer> idTipologia;
	public static volatile SingularAttribute<Tipologia, String> descrizione;
	public static volatile SingularAttribute<Tipologia, Double> prezzo;
	public static volatile ListAttribute<Tipologia, Auto> autos;
}
