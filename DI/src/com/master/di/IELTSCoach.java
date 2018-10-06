package com.master.di;

public class IELTSCoach implements Coach {
    private FortuneService fortuneService;
    
	public IELTSCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		
		return "Spend Atleast Two Hour On Study";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.DailyFortune();
	}

}
