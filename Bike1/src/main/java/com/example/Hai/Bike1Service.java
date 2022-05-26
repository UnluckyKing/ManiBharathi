package com.example.Hai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Bike1Service {
	@Autowired
	Bike1DAO bd;

	public String saveDetails(Bike1Entity be) {
		return bd.saveDetails(be);
	}

	public String deleteDetails(int id) {
		return bd.deleteDetails(id);
	}

	public Bike1Entity getDetails(int id) {

		return bd.getDetails(id);
	}

	public String updateDetails(Bike1Entity id) {
		
		return bd.updateDetails(id);
	}

}
