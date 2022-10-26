package com.zensar.entity;

public class BorewellWater {
    private static final double RATE = 1.5;
    
    private long waterConsumed;
    
    
    public BorewellWater() {
		super();
		// TODO Auto-generated constructor stub
	}




//	public BorewellWater(long waterConsumed) {
//		super();
//        this.waterConsumed = waterConsumed;
//    }
    

    
    
    public BorewellWater(long waterConsumed) {
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






