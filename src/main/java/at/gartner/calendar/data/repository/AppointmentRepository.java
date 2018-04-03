package at.gartner.calendar.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import at.gartner.calendar.data.entity.Appointment;

public interface AppointmentRepository extends CrudRepository<Appointment, Long> {

	@Query("select a from Appointment a where a.user.id = ?1")
    List<Appointment> findByUserId(Long id);
	
    List<Appointment> findBySubject(String subject);
}