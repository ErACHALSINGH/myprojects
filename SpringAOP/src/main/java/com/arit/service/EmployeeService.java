package com.arit.service;

import com.arit.employee.Trainee;
import com.arit.employee.Trainer;

public class EmployeeService {
	private Trainee trainee;
	private Trainer trainer;
	public Trainee getTrainee() {
		return trainee;
	}
	public void setTrainee(Trainee trainee) {
		this.trainee = trainee;
	}
	public Trainer getTrainer() {
		return trainer;
	}
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
}
