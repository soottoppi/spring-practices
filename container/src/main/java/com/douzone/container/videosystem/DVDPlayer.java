package com.douzone.container.videosystem;

import org.springframework.stereotype.Component;

@Component
public class DVDPlayer {
	private DigitalVideoDisc dvd;

	public DVDPlayer() {

	}

	public DVDPlayer(DigitalVideoDisc dvd) {
		this.dvd = dvd;
	}

	public void setDvd(DigitalVideoDisc dvd) {
		this.dvd = dvd;
	}

	public void play() {
		dvd.play();
	}
}
