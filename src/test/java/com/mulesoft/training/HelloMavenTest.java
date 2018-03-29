package com.mulesoft.training;

import org.junit.Assert;
import org.junit.Test;
import org.mule.api.MuleEvent;
import org.mule.tck.junit4.FunctionalTestCase;

public class HelloMavenTest extends FunctionalTestCase {

	@Override
	protected String getConfigFile() {
		return "maven-project.xml";
	}

	@Test
	public void retrieveFlightsAddsAppropriateHeader() throws Exception {
		MuleEvent event = runFlow("mavenFlow");
		String contentType = event.getMessage().getOutboundProperty("Content-Type");
		Assert.assertEquals("application/json", contentType);
	}
}
