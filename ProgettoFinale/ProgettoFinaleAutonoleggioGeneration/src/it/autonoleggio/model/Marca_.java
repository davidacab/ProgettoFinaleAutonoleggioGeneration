package it.autonoleggio.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2021-02-11T21:26:31.615+0100")
@StaticMetamodel(Marca.class)
public class Marca_ {
	public static volatile SingularAttribute<Marca, Integer> idMarca;
	public static volatile SingularAttribute<Marca, String> descrizione;
	public static volatile ListAttribute<Marca, Auto> autos;
}
