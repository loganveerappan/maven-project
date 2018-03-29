package com.mulesoft.training;

import org.mule.tck.junit4.FunctionalTestCase;

public class HelloMavenTest extends FunctionalTestCase {

	@Override
	protected String getConfigFile() {
		return "maven-project.xml";
	}
}
