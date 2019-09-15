package com.enesbyc.hazelcast.listener;

import com.enesbyc.hazelcast.model.SystemStats;
import com.hazelcast.core.Message;
import com.hazelcast.core.MessageListener;

public class HazelcastListener implements MessageListener<SystemStats>{

	@Override
	public void onMessage(Message<SystemStats> message) {
		SystemStats systemStats = message.getMessageObject();
        System.out.println("Message received from hazelcast. " + systemStats);
	}
	
}
