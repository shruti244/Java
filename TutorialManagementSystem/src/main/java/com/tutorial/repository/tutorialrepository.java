package com.tutorial.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorial.entity.Tutorial;

public interface tutorialrepository extends JpaRepository<Tutorial, Long> {
	  List<Tutorial> findByPublished(boolean published);

	  List<Tutorial> findByTitleContainingIgnoreCase(String title);
	}

