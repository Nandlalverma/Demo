package com.TrainingCenterApi.controller;


import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.TrainingCenterApi.entity.TrainingCenter;
import com.TrainingCenterApi.service.TrainingService;

@RestController
public class TrainingController {

	@Autowired
	private TrainingService trainingService;
	
	
	// get all TrainingCenter
	@GetMapping("/center")
	public ResponseEntity<List<TrainingCenter>> getAllCenter()
	{

      List<TrainingCenter> Center = this.trainingService.getAllTrainingCenter();
      if(Center.size()<=0)
       { 

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    	  
      }
      
      return ResponseEntity.of(Optional.of(Center));
		
      
	}
	
	
	// add new TrainingCenter
	@PostMapping("/center")
	public ResponseEntity<TrainingCenter> addTrainingCenter(@Valid @RequestBody  TrainingCenter trainingCenter)
	
	{
		TrainingCenter tCenter=null;
		try {
			this.trainingService.addTrainingCenter(trainingCenter);
			System.out.println(trainingCenter);
			return ResponseEntity.ok().body(trainingCenter);
		}catch(Exception e)
		{
			
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			
		}
	}
}
