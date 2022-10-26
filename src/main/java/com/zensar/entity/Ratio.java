package com.zensar.entity;

public class Ratio {
    private double corporationWaterRatio;
    private double borewellWaterRatio;
    private double totalWaterRatio;
    
    Ratio(String ratio){
    	super();
        String[] values = ratio.split(":");
        corporationWaterRatio = Integer.valueOf(values[0].trim());
        borewellWaterRatio = Integer.valueOf(values[1].trim());
        totalWaterRatio = corporationWaterRatio + borewellWaterRatio;
    }
    

	public Ratio() {
		super();
		// TODO Auto-generated constructor stub
	}


	public double getCorporationWaterRatio() {
		return corporationWaterRatio;
	}

	public void setCorporationWaterRatio(double corporationWaterRatio) {
		this.corporationWaterRatio = corporationWaterRatio;
	}

	public double getBorewellWaterRatio() {
		return borewellWaterRatio;
	}

	public void setBorewellWaterRatio(double borewellWaterRatio) {
		this.borewellWaterRatio = borewellWaterRatio;
	}

	public double getTotalWaterRatio() {
		return totalWaterRatio;
	}

	public void setTotalWaterRatio(double totalWaterRatio) {
		this.totalWaterRatio = totalWaterRatio;
	}
    
   
}
