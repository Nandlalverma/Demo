package com.TrainingCenterApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.TrainingCenterApi.Repository.TrainingRepository;
import com.TrainingCenterApi.entity.TrainingCenter;

@Service
public class TrainingService {

	
	@Autowired
	private TrainingRepository trainingRepository;
	
	// get all trainingCenter
	public List<TrainingCenter> getAllTrainingCenter()
	{
		List<TrainingCenter> findAll = (List<TrainingCenter>)this.trainingRepository.findAll();
		return findAll;
	}
	
	
	//post all training center
	
	
	public TrainingCenter addTrainingCenter(TrainingCenter tcenter)
	{
		TrainingCenter save = this.trainingRepository.save(tcenter);
		return save;
		
	}
}
