package co.grandcircus.Week6CapstoneRevisited.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tasks")
public class Task {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer taskid;
	
	private String description;
	private String duedate;
	private boolean complete;
	@Column(name="id_fk")
	private Integer userid;
	
	@ManyToOne
	@JoinColumn(name="id_fk", insertable = false, updatable = false)
	private User user;

	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Task(Integer taskid, String description, String duedate, boolean complete, Integer userid, User user) {
		super();
		this.taskid = taskid;
		this.description = description;
		this.duedate = duedate;
		this.complete = complete;
		this.userid = userid;
		this.user = user;
	}
	
	public Task(String description, String duedate, boolean complete, Integer userid, User user) {
		super();
		this.taskid = taskid;
		this.description = description;
		this.duedate = duedate;
		this.complete = complete;
		this.userid = userid;
		this.user = user;
	}

	public Integer getTaskid() {
		return taskid;
	}

	public void setTaskid(Integer taskid) {
		this.taskid = taskid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDuedate() {
		return duedate;
	}

	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}

	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Task [taskid=" + taskid + ", description=" + description + ", duedate=" + duedate + ", complete="
				+ complete + ", userid=" + userid + ", user=" + user + "]";
	}
	
	
	

}
