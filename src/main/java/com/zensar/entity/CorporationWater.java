package com.zensar.entity;

public class CorporationWater {
    private static final double RATE = 1;
    
    private long waterConsumed;
    
    
    public CorporationWater() {
		super();
		// TODO Auto-generated constructor stub
	}




    
    
    
    public CorporationWater(long waterConsumed) {
		super();
		this.waterConsumed = waterConsumed;
	}







	public long getWaterConsumed() {
		return waterConsumed;
	}



	public void setWaterConsumed(long waterConsumed) {
		this.waterConsumed = waterConsumed;
	}



	public long getBill(){
        return Math.round(waterConsumed * RATE);
    }
}
