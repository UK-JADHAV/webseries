package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.SeriesModel;
import com.example.demo.repository.SeriesRepository;

@RestController
public class SeriesController {
 
	@Autowired
	SeriesRepository seriesRepo;
	
	
	
	@PostMapping("/addSeries")
	public SeriesModel addSeries(@RequestBody SeriesModel series )
	{
		seriesRepo.save(series);
		return series;
		
	}
	
	@GetMapping("/series")
	public List<SeriesModel> series(){
		return seriesRepo.findAll();
	}
	
	@GetMapping("/series/id/{id}")
	public Optional<SeriesModel> seriesbyId(@PathVariable("id") int id){
		return seriesRepo.findById(id);
	}
	
	@GetMapping("/series/name/{name}")
	public List<SeriesModel> seriesbyName(@PathVariable("name") String name){
		return seriesRepo.findByName(name);
	}
	
	@PostMapping("/update")
	public SeriesModel update(@RequestBody SeriesModel series)
	{
		seriesRepo.save(series);
		return series;
		
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id)
	{
		SeriesModel series=seriesRepo.getOne(id);
		seriesRepo.delete(series);
		return "Series Removed !"+id;
	}

}
