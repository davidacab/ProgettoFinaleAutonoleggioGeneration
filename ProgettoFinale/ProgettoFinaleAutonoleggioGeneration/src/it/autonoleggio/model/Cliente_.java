package it.autonoleggio.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2021-02-11T10:30:52.280+0100")
@StaticMetamodel(Cliente.class)
public class Cliente_ {
	public static volatile SingularAttribute<Cliente, Integer> idCliente;
	public static volatile SingularAttribute<Cliente, Integer> attivo;
	public static volatile SingularAttribute<Cliente, String> cf;
	public static volatile SingularAttribute<Cliente, String> cognome;
	public static volatile SingularAttribute<Cliente, String> dataNascita;
	public static volatile SingularAttribute<Cliente, String> mail;
	public static volatile SingularAttribute<Cliente, String> nome;
	public static volatile SingularAttribute<Cliente, String> nPatente;
	public static volatile SingularAttribute<Cliente, String> password;
	public static volatile ListAttribute<Cliente, Noleggio> noleggios;
}
