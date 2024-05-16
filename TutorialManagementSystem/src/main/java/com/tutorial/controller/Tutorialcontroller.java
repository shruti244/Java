package com.tutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.Expection.RecordNotFoundException;
import com.tutorial.entity.Tutorial;
import com.tutorial.repository.tutorialrepository;
import com.tutorial.service.TutorialService;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class Tutorialcontroller {

	@Autowired
	TutorialService service;
	
	@Autowired
	tutorialrepository repo;
	@PostMapping("/tutorials")
	public ResponseEntity<Tutorial>createTutorial(@RequestBody Tutorial t){
		Tutorial tt=service.createTutorial(t);
		return new ResponseEntity<Tutorial>(tt,HttpStatus.OK);
	}
	
	@GetMapping("/tutorials")
	
	public ResponseEntity<List<Tutorial>>getAllTutorial(){
		List<Tutorial>list=service.getAlltutorials();
		return new ResponseEntity<List<Tutorial>>(list,HttpStatus.OK);
	}
	
	@GetMapping("/tutorials/{id}")
	
	public ResponseEntity<Tutorial> getPostById(@PathVariable ("id")Long id )
	
	throws RecordNotFoundException{
		Tutorial t=service.getTutorialById(id);
		return new ResponseEntity<Tutorial>(t,HttpStatus.OK);
		
	}
	
	@PutMapping("/tutorials/{id}")
	public ResponseEntity<Tutorial>update(@RequestBody Tutorial t, @PathVariable("id") Long id) {
	   t.setId(id);
		service.updateTutorial(t);
	   return new ResponseEntity<>(service.getTutorialById(id),HttpStatus.OK);
	   
	}  
	
	@DeleteMapping("/tutorials/{id}")
	public ResponseEntity<Tutorial> deletePostById(@PathVariable("id") Long id)
			throws RecordNotFoundException{
		
		service.deleteTutorialById(id);
		 return new ResponseEntity<Tutorial>(HttpStatus.OK);
	}
	

	@GetMapping("/tutorials/published")
	public ResponseEntity<List<Tutorial>> findByPublished() {
		try {
			List<Tutorial> tutorial = repo.findByPublished(true);

			if (tutorial.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(tutorial, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@DeleteMapping("/tutorials")
	public ResponseEntity<HttpStatus> deleteAllTutorial() {
		try {
			repo.deleteAll();
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
}








