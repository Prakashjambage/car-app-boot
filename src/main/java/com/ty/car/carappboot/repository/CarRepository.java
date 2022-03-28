package com.ty.car.carappboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.car.carappboot.dto.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {

}
