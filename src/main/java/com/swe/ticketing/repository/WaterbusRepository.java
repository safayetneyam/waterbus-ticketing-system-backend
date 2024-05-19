package com.swe.ticketing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.swe.ticketing.model.AddWaterbus;

@Repository
public interface WaterbusRepository extends JpaRepository<AddWaterbus, Integer> {

}