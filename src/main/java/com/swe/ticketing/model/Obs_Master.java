package com.swe.ticketing.model;

import java.util.ArrayList;

public class Obs_Master implements Obs_Subject {

	ArrayList<Obs_Observer> observers = new ArrayList<Obs_Observer>();
	 private String msg;
	 
	 @Override
	 public void addObserver(Obs_Observer observer) {
	  observers.add(observer);
	 }

	 @Override
	 public void removeObserver(Obs_Observer observer) {
	  observers.remove(observer);
	 }

	 @Override
	 public void notifyObserver() {
	  for (Obs_Observer observer : observers) {
	   observer.update(msg);
	  }
	 }
	 
	 public void setmsg(String newMsg) {
	  this.msg = newMsg;
	//  notifyObserver();
	 }

}
