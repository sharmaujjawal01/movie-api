package com.ujjawal.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ujjawal.demo.dao.PicRepo;
import com.ujjawal.demo.model.pic;

@RestController		//@Controller to access form 
//@Controller
public class PicController 
{
	@Autowired
	PicRepo repo;
	
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	@DeleteMapping("/delete/{pid}")
	public String deletePic(@PathVariable int pid) 
	{
		pic p=repo.getOne(pid);
		repo.delete(p);
		
		return "deleted";
	}
	
	@PostMapping("/addPic")   			//@RequestMapping
	public pic addPic(@RequestBody pic pic)				//pic<--String
	{
		repo.save(pic);
		return pic;							//"home.jsp"-->pic
	}
	
	@GetMapping("/pics")
	//@ResponseBody
	public List<pic> getPics()
	{
		return repo.findAll();     //.toString();
	}
	
	@PutMapping(path="/put/{pid}")		
	public pic updatePic(@RequestBody pic pic)			
	{
		repo.save(pic);
		return pic;				
	}
	
	@RequestMapping("/pic/{pid}")
	//@ResponseBody
	public Optional<pic> getPics(@PathVariable("pid") int pid)
	{
		return repo.findById(pid);      //toString();
	}
	
	
	
}






