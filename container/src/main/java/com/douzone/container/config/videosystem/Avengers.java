package com.douzone.container.config.videosystem;

import com.douzone.container.videosystem.DigitalVideoDisc;

public class Avengers implements DigitalVideoDisc {
	private String title = "Avengers";
	private String studio = "MARVEL";
	
	@Override
	public void play() {
		System.out.println("Playing Movie " + studio + "'s " + title);
	}

}
