package it.autonoleggio.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2021-02-27T04:01:36.884+0100")
@StaticMetamodel(Auto.class)
public class Auto_ {
	public static volatile SingularAttribute<Auto, Integer> idAuto;
	public static volatile SingularAttribute<Auto, String> alimentazione;
	public static volatile SingularAttribute<Auto, Integer> cilindrata;
	public static volatile SingularAttribute<Auto, Byte> disponibile;
	public static volatile SingularAttribute<Auto, String> modello;
	public static volatile SingularAttribute<Auto, String> targa;
	public static volatile SingularAttribute<Auto, Marca> marca;
	public static volatile SingularAttribute<Auto, Tipologia> tipologia;
	public static volatile ListAttribute<Auto, Noleggio> noleggios;
}
