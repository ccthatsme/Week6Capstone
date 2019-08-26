package co.grandcircus.Week6CapstoneRevisited.Controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.Week6CapstoneRevisited.Entity.Task;
import co.grandcircus.Week6CapstoneRevisited.Entity.User;
import co.grandcircus.Week6CapstoneRevisited.dao.UserDao;
import co.grandcircus.Week6CapstoneRevisited.repo.TaskRepo;
import co.grandcircus.Week6CapstoneRevisited.repo.UserRepo;

@Controller
public class MainController {
	
	@Autowired
	TaskRepo t;
	
	@Autowired
	UserDao user;
	
	@Autowired
	UserRepo u;
	
	@PersistenceContext
	EntityManager eman;
	
	
	
	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("index");
	}
		
		
		@RequestMapping("register")
		public ModelAndView registerPage() {
		return new ModelAndView("registration");
		}
		
		
		@RequestMapping("user")
		public ModelAndView add(User me) {
			user.addOrUpdate(me);
		return new ModelAndView("TaskPage");
		}
		
		@RequestMapping("add")
		public ModelAndView addPage() {
			return new ModelAndView("addpage");
		}
		
		@RequestMapping("addit")
		public ModelAndView addTask(Task task) {
			javax.persistence.Query q = eman.createNativeQuery("insert into tasks task);
			return null;
			
		}
		
		
		
		@RequestMapping("login")
		public ModelAndView login(@RequestParam("email") String email, @RequestParam("password") String password) {
			ModelAndView mv = null;
			User usercheck = new User(email, password);
			List<User> userList = eman.createQuery("FROM person", User.class).getResultList();
			
			
				javax.persistence.Query q = eman.createNativeQuery("select id where email=:email && password=:password", User.class);
				//javax.persistence.Query q = eman.createNativeQuery("select id where email=:email && password=:password", User.class);
				q.setParameter("email", email);
				q.setParameter("password", password);
				int result = q.executeUpdate();
				String hql = "FROM User";
				javax.persistence.Query query = eman.createQuery(hql);
				List<User> results = query.getResultList();
				
				List<User> list = q.getResultList();
				User u = list.get(1);
				User y = list.get(0);
				results.contains(usercheck);
				
				
				if(results.contains(usercheck)) {
				 mv = new ModelAndView("success", "test", q.getResultList());
				}
				else {
					 mv = new ModelAndView("error");
				}
			
				
				
			

			return mv;
			
		}
		
		
		
		
		
	}
	


