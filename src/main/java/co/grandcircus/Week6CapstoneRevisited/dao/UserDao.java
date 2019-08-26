package co.grandcircus.Week6CapstoneRevisited.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



import co.grandcircus.Week6CapstoneRevisited.Entity.User;
import co.grandcircus.Week6CapstoneRevisited.repo.UserRepo;

@Repository
@Transactional
public class UserDao {
	
	@PersistenceContext
	EntityManager eManager;
	
	
	
	User u;
	UserRepo t;
	
	
	
	public User addOrUpdate(User u) {
		return eManager.merge(u);
	
	}
	
	
	
//	Query Two = (Query) eManager.createNativeQuery("select u.password where id=u.id", User.class);
	
//	public User search(User u) {
//		javax.persistence.Query q = eManager.createNativeQuery("select u.id where email=:email && password=:password", User.class);
//		q.setParameter("email", email);
//		return u;
//		
//	}
	
	
	
	
	
//	public int findUser(@RequestParam("email") String email) {
//		int x;
//	String hql = "SELECT u.id where email=email";
//	Query query = (Query) eManager.createQuery(hql);
//	
//	}
	
	
	


}
