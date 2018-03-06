package at.gartner.calendar.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import at.gartner.calendar.entity.Appointment;

@RestController(value = "/")
public class CalendarController {

	@RequestMapping(value = "test/")
	public String test() {
		return "test";
	}

	@RequestMapping(value = "test/{terminId}")
	public String test1(@PathVariable(name = "terminId") String terminId) {
		return "test " + terminId;
	}

	@RequestMapping(value = "test1/", method = RequestMethod.GET)
	public String test2(@RequestParam String test1) {
		return "test " + test1;
	}

	@RequestMapping(value = "test/", method = RequestMethod.POST)
	public String test3(@RequestBody BigDecimal m) {
		return "test";
	}

	@RequestMapping(value = "app/")
	public Appointment app() {
		return new Appointment("test", "aödslfkjöasdkljföaklfj");
	}
}
