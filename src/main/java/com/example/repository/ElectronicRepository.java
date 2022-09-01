package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.electronic.Electronics;

public interface ElectronicRepository extends JpaRepository<Electronics, Integer> {

}
