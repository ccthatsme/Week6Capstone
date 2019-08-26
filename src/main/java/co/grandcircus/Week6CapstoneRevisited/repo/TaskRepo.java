package co.grandcircus.Week6CapstoneRevisited.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.Week6CapstoneRevisited.Entity.Task;

public interface TaskRepo extends JpaRepository<Task, Integer>{

}
