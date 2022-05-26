package com.example.Hai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Bike1Controller {
	@Autowired
	Bike1Service bs;
	@PostMapping("/save")
	public String saveDetails(@RequestBody Bike1Entity be) {
		return bs.saveDetails(be);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteDetails(@PathVariable int id) {
	return	bs.deleteDetails(id);
	}
	
	@GetMapping("/get/{id}")
	public Bike1Entity getDetails(@PathVariable int id) {
		return bs.getDetails(id);
	}
	@PutMapping(value="/update/{id}")
	public String updateDetails(@RequestBody Bike1Entity id) {
		return bs.updateDetails(id);
	}
	
	
}
