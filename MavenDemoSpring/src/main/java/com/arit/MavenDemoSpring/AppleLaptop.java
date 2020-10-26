package com.arit.MavenDemoSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component

public class AppleLaptop {
	
	@Autowired 
	@Qualifier("asusPrime")
	Processor cpu;
	
	public Processor getCpu() {
		return cpu;
	}


	public void setCpu(Processor cpu) {
		this.cpu = cpu;
	}


	public void displayConfig()
	{
		System.out.println("Octa Core,%TB-HDD,16GB-DDR");
		cpu.process();
	}

}
