package at.gartner.calendar.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import at.gartner.calendar.data.entity.ActivityType;
import at.gartner.calendar.data.entity.Appointment;
import at.gartner.calendar.data.entity.Project;
import at.gartner.calendar.data.repository.ActivityTypeRepository;
import at.gartner.calendar.data.repository.AppointmentRepository;
import at.gartner.calendar.data.repository.ProjectRepository;

@RestController
@RequestMapping("/data")
public class DataController {
	
	@Autowired
	private ProjectRepository projectRepository;
	@Autowired
	private ActivityTypeRepository activityTypeRepository;
	@Autowired
	private AppointmentRepository appointmentRepository;

	@RequestMapping(value = "/projects")
	public Iterable<Project> ProjectList()
	{
		Iterable<Project> projects = projectRepository.findAll();
		return projects;
	}

	@RequestMapping(value = "/activityTypes")
	public Iterable<ActivityType> ActivityTypeList()
	{
		Iterable<ActivityType> activityTypes = activityTypeRepository.findAll();
		return activityTypes;
	}

	@RequestMapping(value = "/project/{id}")
	public Optional<Project> Project(Long id)
	{
		Optional<Project> project = projectRepository.findById(id);
		return project;
	}

	@RequestMapping(value = "/activityType/{id}")
	public Optional<ActivityType> ActivityType(Long id)
	{
		Optional<ActivityType> activityType = activityTypeRepository.findById(id);
		return activityType;
	}

	@RequestMapping(value = "/appointment/{id}")
	public Optional<Appointment> Appointment(Long id)
	{
		Optional<Appointment> appointment = appointmentRepository.findById(id);
		return appointment;
	}
}
