package com.ty.car.carappboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.car.carappboot.dto.Car;
import com.ty.car.carappboot.service.CarService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class CarController {
	
	@Autowired
	private CarService carService;
	
	
	@ApiOperation(value = "save the car details", produces = "application/json",consumes = "application/json")
	@ApiResponses({
		@ApiResponse(code=200,message="car saved"),
		@ApiResponse(code=405,message="Bad request,not proper car data")
	})
	@PostMapping("/car")
	public Car saveCar(@RequestBody Car car) {
		 return carService.saveCar(car);
	}
	@ApiOperation(value = "get the car details by id", produces = "application/json",consumes = "application/json")
	@ApiResponses({
		@ApiResponse(code=200,message="gets given car data"),
		@ApiResponse(code=404,message="no given id found")
	})
	@GetMapping("/car")
	public Car getCarById(@RequestParam int id) {
		return carService.getCarById(id);
	}
	

}
