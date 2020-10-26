package com.arit.MavenDemoSpring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Inteli7 implements Processor {

	public void process()
	{
		System.out.println("Intel-i7 inside");
	}
}
