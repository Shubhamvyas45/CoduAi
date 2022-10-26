package com.zensar.entityTest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import com.zensar.entity.CorporationWater;

public class CorporationWaterTest {
	 @Autowired
	    MockMvc mockMvc;
	    
	    @Test
	    public void testWaterConsumed() throws Exception{
	    	CorporationWater corporationWater = new CorporationWater();
	    	corporationWater.setWaterConsumed(40l);
	    	assertEquals(corporationWater.getWaterConsumed(),40l);
	    }

}
