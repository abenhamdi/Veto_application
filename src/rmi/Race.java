package rmi;

import java.io.Serializable;

public class Race implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String race;
	private String lifeTime;
	
	public Race(String race, String lifeTime){
		this.race = race;
		this.lifeTime = lifeTime;
	}

	public void getrace() {
		System.out.println(race);
	}

	public void getLifeTime() {
		System.out.println(lifeTime);
	}
}
