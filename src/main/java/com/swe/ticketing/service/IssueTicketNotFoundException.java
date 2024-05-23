package com.swe.ticketing.service;

public class IssueTicketNotFoundException extends RuntimeException {
    public IssueTicketNotFoundException(String message) {
        super(message);
    }
}