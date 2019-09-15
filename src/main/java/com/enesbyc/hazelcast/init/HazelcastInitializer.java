package com.enesbyc.hazelcast.init;

import org.springframework.context.annotation.Configuration;

import com.enesbyc.hazelcast.listener.HazelcastListener;
import com.enesbyc.hazelcast.model.SystemStats;
import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.ITopic;

/**
 * This class initialize once when project initializing
 * @author enesbyc
 *
 */
@Configuration
public class HazelcastInitializer {
	
	public HazelcastInitializer() {
			HazelcastListener hzListener=new HazelcastListener();
	        Config cfg = new Config();
	        HazelcastInstance hz = Hazelcast.newHazelcastInstance(cfg);
	        //Get dashboard topic
	        ITopic topic = hz.getTopic ("dashboard");
	        //Initiliaze listener to dashboard topic
	        topic.addMessageListener(hzListener);
	        System.out.println("Hazelcast initialized successfully.");
	}
}
