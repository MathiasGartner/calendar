package at.gartner.calendar.data.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import at.gartner.calendar.data.entity.Appointment;

public interface AppointmentRepository extends CrudRepository<Appointment, Long> {

    List<Appointment> findBySubject(String subject);
}