package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	private String emailAddress;

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	private String team;
	public TrackCoach(){
		System.out.println("No arg construct");
	}
	public void setEmailAddress(String emailAddress) {
		System.out.println("Email set.");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("Track coach: Team set.");
		this.team = team;
	}
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}


}










