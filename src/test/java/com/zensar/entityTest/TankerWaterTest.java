package com.zensar.entityTest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import com.zensar.entity.CorporationWater;
import com.zensar.entity.TankerWater;

public class TankerWaterTest {
	private static final long RATE_FROM_0_TILL_500 = 0;
    private static final long RATE_FROM_501_TILL_1500 = 0;
    private static final long RATE_FROM_1501_TILL_3000 = 0;
    private static final long RATE_FROM_3001 = 0;
    
	 @Autowired
	    MockMvc mockMvc;
	    
	    @Test
	    public void testWaterConsumed() throws Exception{
	    	TankerWater tankerWater = new TankerWater();
	    	tankerWater.setWaterConsumed(40l);
	    	assertEquals(tankerWater.getWaterConsumed(),40l);
	    }
	   
	    @Test
	    public void testBill0to500() throws Exception{
	    	TankerWater tankerWater = new TankerWater();
	    	tankerWater.setBill(0);
	    	assertEquals(tankerWater.getBill(),0*RATE_FROM_0_TILL_500);
	    }
	    @Test
	    public void testBill501to1500() throws Exception{
	    	TankerWater tankerWater = new TankerWater();
	    	tankerWater.setBill(504);;
	    	assertEquals(tankerWater.getBill(),(500*RATE_FROM_0_TILL_500)+((504-500)*RATE_FROM_501_TILL_1500));
	    }
	    @Test
	    public void testBill1501to3000() throws Exception{
	    	TankerWater tankerWater = new TankerWater();
	    	tankerWater.setBill(1504);
	    	assertEquals(tankerWater.getBill(),(500 * RATE_FROM_0_TILL_500) + (1000 * RATE_FROM_501_TILL_1500)
                    + ((1504 - 1500) * RATE_FROM_1501_TILL_3000));
	    }
	    @Test
	    public void testBillgreaterthan3001() throws Exception{
	    	TankerWater tankerWater = new TankerWater();
	    	tankerWater.setBill(3003);
	    	assertEquals(tankerWater.getBill(),(500 * RATE_FROM_0_TILL_500) + (1000 * RATE_FROM_501_TILL_1500)
                    + (1500 * RATE_FROM_1501_TILL_3000) + ((3003 - 3000) * RATE_FROM_3001));
	    }



}
