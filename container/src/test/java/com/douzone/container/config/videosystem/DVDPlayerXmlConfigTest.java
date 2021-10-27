package com.douzone.container.config.videosystem;

import static org.junit.Assert.assertNotNull;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.douzone.container.videosystem.DVDPack;
import com.douzone.container.videosystem.DigitalVideoDisc;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:com/douzone/container/config/videosystem/DVDPlayerConfig.xml"})
public class DVDPlayerXmlConfigTest {
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

	//@Autowired
	// 예외 발생
	// XML Bean 설정(Avengers)에서는 id를 자동으로 부여하지 않는다.
	// @Qualifier 사용없음
	private DigitalVideoDisc dvd1;
	
	@Autowired
	@Qualifier("ironMan")
	private DigitalVideoDisc dvd2;
	
	@Autowired
	@Qualifier("avengersInfinityWar")
	private DigitalVideoDisc dvd3;
	
	@Autowired
	@Qualifier("avengersEndgame")
	private DigitalVideoDisc dvd4;
	
	@Autowired
	@Qualifier("avengersAgeOfUltron")
	private DigitalVideoDisc dvd5;
	
	@Autowired
	@Qualifier("avengersCaptainAmerica")
	private DigitalVideoDisc dvd6;
	
	@Autowired
	@Qualifier("avengersDirectorEdition")
	private DigitalVideoDisc dvd7;
	
	@Autowired
	private DVDPack dvdPack;

	@Autowired
	@Qualifier("avengersExpansionEdition1")
	private DigitalVideoDisc dvd8;
	
	@Autowired
	@Qualifier("avengersExpansionEdition2")
	private DigitalVideoDisc dvd9;
	
	@Autowired
	@Qualifier("avengersExpansionEdition3")
	private DigitalVideoDisc dvd10;
	
	@Ignore
	@Test
	public void testDvd1() {
		assertNotNull(dvd1);
	}
	
	@Test
	public void testDvd2() {
		assertNotNull(dvd2);
	}
	
	@Test
	public void testDvd3() {
		assertNotNull(dvd3);
	}
	
	@Test
	public void testDvd4() {
		assertNotNull(dvd4);
	}
	
	@Test
	public void testDvd5() {
		assertNotNull(dvd5);
	}
	
	@Test
	public void testDvd6() {
		assertNotNull(dvd6);
	}
	
	@Test
	public void testDvd7() {
		assertNotNull(dvd7);
	}
	
	@Test
	public void testDVDPack() {
		assertNotNull(dvdPack);
	}
	
	@Test
	public void testDvd8() {
		assertNotNull(dvd8);
	}
	
	@Test
	public void testDvd9() {
		assertNotNull(dvd9);
	}
	
	@Test
	public void testDvd10() {
		assertNotNull(dvd10);
		System.out.println(dvd10);
	}
}
