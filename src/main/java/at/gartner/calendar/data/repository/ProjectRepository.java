package at.gartner.calendar.data.repository;


import org.springframework.data.repository.CrudRepository;

import at.gartner.calendar.data.entity.Project;

public interface ProjectRepository extends CrudRepository<Project, Long> {

}