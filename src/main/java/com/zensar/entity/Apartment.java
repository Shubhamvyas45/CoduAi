package com.zensar.entity;

public class Apartment {
    private ApartmentType apartmentType;
    private int guests;
    private Water water;
    private Ratio ratio;
    
//    Apartment(){
//    }
    
    
    public Apartment(ApartmentType apartmentType, int guests, Water water, Ratio ratio) {
		super();
		this.apartmentType = apartmentType;
		this.guests = guests;
		this.water = water;
		this.ratio = ratio;
	}

	public Apartment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ApartmentType getApartmentType() {
        return apartmentType;
    }
    
    public Water getWater() {
        return water;
    }
    
    public void addGuest(int numberOfGuests){
        this.guests += numberOfGuests;
    }
    
    public void allotWater(ApartmentType apartmentType, String ratio){
   
        this.apartmentType = apartmentType;
        this.ratio = new Ratio(ratio);
        this.addWaterConsumed(this.apartmentType.warterConsumed, this.ratio);
    }
    
    private void addWaterConsumed(long totalWaterAlloted, Ratio ratio){
        Water water = new Water(totalWaterAlloted, ratio);
        this.water = water;
    }
    
    public long bill(){
        water.addExtraWaterForGuest(guests);
        return water.getBill();
    }
}
