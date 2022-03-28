package com.ty.car.carappboot.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.car.carappboot.dto.Car;
import com.ty.car.carappboot.repository.CarRepository;

@Repository
public class CarDao {

	@Autowired
	private CarRepository carRepository;

	public Car saveCar(Car car) {
		return carRepository.save(car);

	}

	public Car getById(int id) {
		Optional<Car> optional = carRepository.findById(id);
		if (optional.isEmpty()) {
			return null;
		}
		return optional.get();
	}

	public List<Car> getAllCar() {
		return carRepository.findAll();
	}

	public boolean deleteCarById(int id) {
		Car car = getById(id);

		if (car != null) {
			carRepository.deleteById(id);
			return true;
		}
		return false;
		
	}

}
