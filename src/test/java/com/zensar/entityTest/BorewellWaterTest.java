package com.zensar.entityTest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import com.zensar.entity.BorewellWater;

public class BorewellWaterTest {
	 @Autowired
	    MockMvc mockMvc;
	    
	    @Test
	    public void testWaterConsumed() throws Exception{
	    	BorewellWater bw = new BorewellWater();
	    	bw.setWaterConsumed(40l);
	    	assertEquals(bw.getWaterConsumed(),40l);
	    }
}
