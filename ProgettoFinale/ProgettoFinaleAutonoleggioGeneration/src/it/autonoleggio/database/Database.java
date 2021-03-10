package it.autonoleggio.database;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.RollbackException;

import it.autonoleggio.model.Auto;
import it.autonoleggio.model.Cliente;
import it.autonoleggio.model.Marca;
import it.autonoleggio.model.Noleggio;
import it.autonoleggio.model.Tipologia;
import it.autonoleggio.utility.MyException;


@SuppressWarnings("unused")
public class Database {

	//
	private static Database instance;
	
	public Database(){
		
	} 
	
	public static Database getInstance() {
		if(instance==null) {
			instance=new Database();
		}
		return instance;
	}
	
  private EntityManager getManager() {
	  try {
		  Class.forName("com.mysql.jdbc.Driver");
	  }catch(ClassNotFoundException e) {
		 e.printStackTrace();
		 System.out.println(" "+e.getMessage());
	  }
	  EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProgettoFinaleAutonoleggioGeneration");
	  EntityManager em=emf.createEntityManager();
	  
	  return em;
  }
  
  public List<Auto> getAutoAll(){
	  EntityManager em=getInstance().getManager();
	  Query q=em.createNamedQuery("Auto.findAll");
	  @SuppressWarnings("unchecked")
	List<Auto> lista=q.getResultList();
	  return lista;
  }
  
  public List<Cliente> getClienteAll(){
	  EntityManager em=getInstance().getManager();
	  Query q=em.createNamedQuery("Cliente.findAll");
	  @SuppressWarnings("unchecked")
	List<Cliente> lista=q.getResultList();
	  return lista;
  }
  
  public List<Cliente> getClientiNonAttivi(){
	  EntityManager em=getInstance().getManager();
	  Query q=em.createQuery("Select c from Cliente c where c.attivo=0");
	  @SuppressWarnings("unchecked")
	  List<Cliente> lista=q.getResultList();
	  return lista;
  }
  
  public List<Cliente> getClientiAttivi(){
	  EntityManager em=getInstance().getManager();
	  Query q=em.createQuery("Select c from Cliente c where c.attivo=1");
	  @SuppressWarnings("unchecked")
	  List<Cliente> lista=q.getResultList();
	  return lista;
  }
  
  public List<Marca> getMarcaAll(){
	  EntityManager em=getInstance().getManager();
	  Query q=em.createNamedQuery("Marca.findAll");
	  @SuppressWarnings("unchecked")
	  List<Marca> lista=q.getResultList();
	  return lista;
  }
  
  public List<Noleggio> getNoleggioAll(){
	  EntityManager em=getInstance().getManager();
	  Query q=em.createNamedQuery("Noleggio.findAll");
	  @SuppressWarnings("unchecked")
	  List<Noleggio> lista=q.getResultList();
	  return lista;
  }
  
  public List<Tipologia> getTipologiaAll(){
	  EntityManager em=getInstance().getManager();
	  Query q=em.createNamedQuery("Tipologia.findAll");
	  @SuppressWarnings("unchecked")
	  List<Tipologia> lista=q.getResultList();
	  return lista;
  }
  
  public boolean insertAuto(Auto a) {
	  EntityManager em=getInstance().getManager();
	  EntityTransaction et=em.getTransaction();
	  try {
	  et.begin();
	  em.persist(a);
	  et.commit();
	  }catch(EntityExistsException e) {
		  return false;
	  }catch(RollbackException e) {
		  return false;
	  }
	  return true;  
  }
  
  public boolean deleteAuto(Auto a) {
	  EntityManager em=getInstance().getManager();
	  EntityTransaction et=em.getTransaction();
	  try {
	  et.begin();
	  em.remove(a);
	  et.commit();
	  }catch(RollbackException e ) {
		  return false;
	  }
	  
	  return true;
  }
  
  public boolean editAuto(Auto a) {
	EntityManager em=getInstance().getManager();
	EntityTransaction et=em.getTransaction();
	try {
	et.begin();
	em.merge(a);
	et.commit();
	}catch(RollbackException e) {
		e.printStackTrace();
		return false;
	}
    return true;
  }
  
  public boolean insertCliente(Cliente c)throws MyException {
	  EntityManager em=getInstance().getManager();
	  EntityTransaction et=em.getTransaction();
	  boolean ris;
	  try {
		  et.begin();
		  em.persist(c);
		  et.commit();
	  }catch(EntityExistsException e) {
		  ris=false;
		  throw new MyException(e.getMessage());
	  }catch(RollbackException e) {
		  ris=false;
		  throw new MyException(e.getMessage());
	  }
	  ris=true;
	  return ris;
  }
  
  
  public boolean deleteCliente(Cliente c) {
	  EntityManager em=getInstance().getManager();
	  EntityTransaction et=em.getTransaction();
	  try {
		  et.begin();
		  em.remove(c);
		  et.commit();
	  }catch(RollbackException e) {
		  e.printStackTrace();
		  return false;
	  }
	  return true;
  }
  
  public boolean editCliente(Cliente c) {
	  EntityManager em=getInstance().getManager();
	  EntityTransaction et=em.getTransaction();
	  try {
		  et.begin();
		  em.merge(c);
		  et.commit();
	  }catch(RollbackException e) {
		  e.printStackTrace();
		  return false;
	  }
	  return true;
  }
  
  public boolean insertMarca(Marca c) {

		EntityManager em= getInstance().getManager();
		EntityTransaction et= em.getTransaction();

		try {
			et.begin();
			em.persist(c);
			et.commit();
		}catch(RollbackException e) {
			return false;
		}

		return true;

	}
	
	public boolean deleteMarca(Marca c) {

		EntityManager em= getInstance().getManager();
		EntityTransaction et= em.getTransaction();

		try {
			et.begin();
			em.remove(c);
			et.commit();
		}catch(RollbackException e) {
			return false;
		}

		return true;

	}
	
	public boolean editMarca(Marca c) {

		EntityManager em= getInstance().getManager();
		EntityTransaction et= em.getTransaction();

		try {
			et.begin();
			em.merge(c);
			et.commit();
		}catch(RollbackException e) {
			return false;
		}

		return true;

	}
	
	public boolean insertNoleggio(Noleggio c) {

		EntityManager em= getInstance().getManager();
		EntityTransaction et= em.getTransaction();

		try {
			et.begin();
			em.persist(c);
			et.commit();
		}catch(RollbackException e) {
			return false;
		}

		return true;

	}
	
	public boolean deleteNoleggio(Noleggio c) {

		EntityManager em= getInstance().getManager();
		EntityTransaction et= em.getTransaction();

		try {
			et.begin();
			em.remove(c);
			et.commit();
		}catch(RollbackException e) {
			return false;
		}

		return true;

	}
	
	public boolean editNoleggio(Noleggio c) {

		EntityManager em= getInstance().getManager();
		EntityTransaction et= em.getTransaction();

		try {
			et.begin();
			em.merge(c);
			et.commit();
		}catch(RollbackException e) {
			return false;
		}

		return true;

	}
	
	public boolean insertTipologia(Tipologia c) {

		EntityManager em= getInstance().getManager();
		EntityTransaction et= em.getTransaction();

		try {
			et.begin();
			em.persist(c);
			et.commit();
		}catch(RollbackException e) {
			return false;
		}

		return true;

	}
	
	public boolean deleteTipologia(Tipologia c) {

		EntityManager em= getInstance().getManager();
		EntityTransaction et= em.getTransaction();

		try {
			et.begin();
			em.remove(c);
			et.commit();
		}catch(RollbackException e) {
			return false;
		}

		return true;

	}
	
	public boolean editTipologia(Tipologia c) {

		EntityManager em= getInstance().getManager();
		EntityTransaction et= em.getTransaction();

		try {
			et.begin();
			em.merge(c);
			et.commit();
		}catch(RollbackException e) {
			return false;
		}

		return true;

	}
	
	public Auto getAuto(int id) {
	  EntityManager em=getManager();
	  Query q=em.createQuery("Select a from Auto a where a.idAuto=:id");
	  q.setParameter("id", id);
	  Auto a=(Auto)q.getSingleResult();
	  return a;
	}
	
	public Cliente getCliente(int id) {
		EntityManager em=getManager();
		Query q=em.createQuery("Select c from Cliente c where c.idCliente=:id");
		q.setParameter("id", id);
		Cliente c=(Cliente)q.getSingleResult();
		return c;
	}
	
	public Tipologia getTipologia(int id) {
		EntityManager em=getManager();
		Query q=em.createQuery("Select t from Tipologia t where t.idTipologia=:id");
		q.setParameter("id", id);
		return (Tipologia)q.getSingleResult();
	}
	
	public Marca getMarca (int id)
	{
		EntityManager em = getManager();
		Query q= em.createQuery("select m from Marca m where m.idMarca=:id"); //dopo i due punti ci sarà il valore 
		q.setParameter("id", id);
		
		return (Marca) q.getSingleResult(); //cast perchè ritorna un oggetto generico
	}
	
	public void setAttivo(int id) {
		EntityManager em=getManager();
		Query q=em.createQuery("update Cliente c set c.attivo=1 where c.idCliente=:id");
		q.setParameter("id", id);
	}
	
}
