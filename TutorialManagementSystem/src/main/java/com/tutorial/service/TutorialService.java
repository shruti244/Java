package com.tutorial.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial.Expection.RecordNotFoundException;
import com.tutorial.entity.Tutorial;
import com.tutorial.repository.tutorialrepository;

@Service
//act as business logic it will handle interface and model
public class TutorialService {


	@Autowired
	private tutorialrepository repo;
	
	public Tutorial createTutorial(Tutorial t) {
		return repo.save(t);
	}
	
	public List<Tutorial>getAlltutorials(){
		List<Tutorial>tutorialList=repo.findAll();
		return tutorialList;
		
	}
	
	public Tutorial getTutorialById(Long id) {
		Optional<Tutorial>tutorial=repo.findById(id);
		if(tutorial.isPresent()) {
			return tutorial.get();
		}
		else {
			throw new RecordNotFoundException("No tutorial record exist");
			
			
		}
		
	}
	public Tutorial updateTutorial(Tutorial t) {
		Optional<Tutorial>tutorial=repo.findById(t.getId());
		if(tutorial.isPresent()) {
			Tutorial updatetutorial=tutorial.get();
			updatetutorial.setTitle(t.getTitle());
			updatetutorial.setDescription(t.getDescription());
			updatetutorial.setPublished(t.isPublished());
			repo.save(updatetutorial);
			return updatetutorial;
		}
		else{
			throw new RecordNotFoundException("tutorial details not available");
		}
	}
	
	public void deleteTutorialById(Long id) {
		Optional<Tutorial>tutorial=repo.findById(id);
		if(tutorial.isPresent()) {
			repo.deleteById(id);
		}
		else {
			throw new RecordNotFoundException("Given Record id not avaialabble");
			
			
		}
	}
	
}



