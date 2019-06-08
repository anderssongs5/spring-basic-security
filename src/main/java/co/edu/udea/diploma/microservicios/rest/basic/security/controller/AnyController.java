package co.edu.udea.diploma.microservicios.rest.basic.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class AnyController {

	@GetMapping(value = "/any")
	public long getAny() {
		return System.currentTimeMillis();
	}
}
