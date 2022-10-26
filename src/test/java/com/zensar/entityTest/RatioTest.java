package com.zensar.entityTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import com.zensar.entity.Ratio;

public class RatioTest {
	 @Autowired
	    MockMvc mockMvc;
	    
	    @Test
	    public void testBorewellWaterRatio() throws Exception{
	    	Ratio ratio = new Ratio();
	    	ratio.setBorewellWaterRatio(0);
	    	assertEquals(ratio.getBorewellWaterRatio(),0);
	    }
	    @Test
	    public void testCorporationWaterRatio() throws Exception{
	    	Ratio ratio = new Ratio();
	    	ratio.setCorporationWaterRatio(0);
	    	assertEquals(ratio.getCorporationWaterRatio(),0);
	    }
	    @Test
	    public void testTotalWaterRatio() throws Exception{
	    	Ratio ratio = new Ratio();
	    	ratio.setTotalWaterRatio(0);
	    	assertEquals(ratio.getTotalWaterRatio(),0);
	    }

}
