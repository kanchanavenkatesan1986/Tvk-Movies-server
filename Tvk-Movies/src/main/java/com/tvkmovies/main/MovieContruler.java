package com.tvkmovies.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class MovieContruler {
	
	@Autowired
	MovieService service;
	
	
	//GET
	
	@GetMapping("/getallmovie")
	public List<Movies> getallmovies(){
		return service.fetchallmovie();
		
	}
	
	@GetMapping("/getmovie/{id}")
	public Movies getmovie(@PathVariable Integer id ) {
		return service.getmovie(id);
		
	}
	
	//post 
	
	@PostMapping("/addnewstaff")
	public String addNewData(@RequestBody Movies m) {
		return service.addmovie(m);
	}
	
	
	
	//put
	
	@PutMapping("/updatedata/{id}")
	public Movies updateData(@PathVariable int id, @RequestBody Movies m)
	{
		return service.update(id, m);
	}
	
	
	//delete
	
	@DeleteMapping("/deletebyid/{id}")
	public String delete(@PathVariable int id) {
		return service.deletemovie(id);
	}
}
	


