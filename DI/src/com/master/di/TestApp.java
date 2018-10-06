package com.master.di;

public class TestApp {

	public static void main(String[] args) {
		FortuneService fortune = new HappyFortune();
		Coach theCoach = new IELTSCoach(fortune);
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getDailyFortune());

	}

}
