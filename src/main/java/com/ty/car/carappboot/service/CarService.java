package com.ty.car.carappboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.car.carappboot.dao.CarDao;
import com.ty.car.carappboot.dto.Car;
import com.ty.car.carappboot.exception.NoIdFoundException;

@Service
public class CarService {
	
	@Autowired
	private CarDao carDao;
	
	public Car saveCar(Car car) {
		return carDao.saveCar(car);
		
	}
	public Car getCarById(int id) {
		Car car = carDao.getById(id);
		
		if(car == null) {
			throw new NoIdFoundException("Given ID : "+id+" does not exist");
		}
		return car;
	}

}
