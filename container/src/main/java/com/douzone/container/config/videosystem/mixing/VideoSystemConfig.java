package com.douzone.container.config.videosystem.mixing;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.douzone.container.videosystem.DVDPlayer;

/*
 * 
 *  	<-------- JavaConfig1 + JavaConfig2
 * 		  import
 * 
 * 		JavaConfig1 + JavaConfig2
 */
@Configuration
@Import({DVDConfig.class, DVDPlayer.class})
public class VideoSystemConfig {
	
}
