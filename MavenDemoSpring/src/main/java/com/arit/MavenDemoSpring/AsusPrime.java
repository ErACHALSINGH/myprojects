package com.arit.MavenDemoSpring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class AsusPrime implements Processor {
	public void process()
	{
		System.out.println("Asus Prime Inside");
	}

}
