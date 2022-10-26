package com.zensar.entity;

public enum ApartmentType {
    TWO_BEDROOM("2", 900), THREE_BEDROOM("3", 1500);
    
    String type;
    long warterConsumed;
    
    ApartmentType(String type, long waterConsumed){
    	
        this.type = type;
        this.warterConsumed = waterConsumed;
    }

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getWarterConsumed() {
		return warterConsumed;
	}

	public void setWarterConsumed(long warterConsumed) {
		this.warterConsumed = warterConsumed;
	}
}
