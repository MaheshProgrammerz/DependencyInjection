package com.master.di;

public class FootballCoach implements Coach {
    private FortuneService fortuneService;
    
    public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
    
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
