package com.swe.ticketing.model;

public interface Obs_Subject {
	void addObserver(Obs_Observer observer);
	void removeObserver(Obs_Observer observer);
	void notifyObserver();
}
