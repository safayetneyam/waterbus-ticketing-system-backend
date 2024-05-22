package com.swe.ticketing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.swe.ticketing.model.AddSchedule;

@Repository
public interface ScheduleRepository extends JpaRepository<AddSchedule, Integer> {
	
}