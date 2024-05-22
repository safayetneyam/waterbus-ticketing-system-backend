package com.swe.ticketing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swe.ticketing.model.IssueTicket;

@Repository
public interface TicketingRepository extends JpaRepository<IssueTicket, Integer> {
	
}
