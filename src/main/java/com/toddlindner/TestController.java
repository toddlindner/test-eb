package com.toddlindner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by todd on 3/4/17.
 */
@RestController
public class TestController {

	@Autowired private CustomerRepository customerRepository;

	@RequestMapping("/hello")
	public String something() {
		return "blah at " + new Date();
	}

	@RequestMapping("/custs")
	public Iterable<Customer> custs() {
		return customerRepository.findAll();
	}

}
