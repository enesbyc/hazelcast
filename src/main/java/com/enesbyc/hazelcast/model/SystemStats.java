package com.enesbyc.hazelcast.model;

import java.io.Serializable;

public class SystemStats implements Serializable{
	
	private int cpu;
	private int memory;
	
	public SystemStats(int cpu, int memory) {
		super();
		this.cpu = cpu;
		this.memory = memory;
	}

	public int getCpu() {
		return cpu;
	}
	
	public void setCpu(int cpu) {
		this.cpu = cpu;
	}
	
	public int getMemory() {
		return memory;
	}
	
	public void setMemory(int memory) {
		this.memory = memory;
	}

	@Override
	public String toString() {
		return "SystemStats [cpu=" + cpu + ", memory=" + memory + "]";
	}
	
}
