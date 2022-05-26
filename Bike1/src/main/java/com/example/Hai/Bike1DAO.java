package com.example.Hai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Bike1DAO {
	@Autowired
	Bike1Repository br;
	public String saveDetails(Bike1Entity be) {
		 br.save(be);
		 return "SAVED SUCESSFULLY"; 
	}
	
	public String deleteDetails(int id) {
		 br.deleteById(id);
		 return "DELETE SUCESSFULLY";
	}

	public Bike1Entity getDetails(int id) {
		return br.getById(id);
	}

	public String updateDetails(Bike1Entity id) {
		br.save(id);
		return "updated";
	}

}
