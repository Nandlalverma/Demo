package com.TrainingCenterApi.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.TrainingCenterApi.entity.TrainingCenter;

@Repository
public interface TrainingRepository extends CrudRepository<TrainingCenter, String>{

	public TrainingCenter findByCenterName(String center);
	
	
}
