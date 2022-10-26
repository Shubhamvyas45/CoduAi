package com.zensar;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;



import com.zensar.entity.Apartment;
import com.zensar.entity.ApartmentType;
@Generated

public class WaterManagementApplication {

	 private static final Map<String, ApartmentType> stringToApartmentType= new HashMap<>();
	    static{
	        ApartmentType[] apartmentTypes = ApartmentType.values();
	        for(ApartmentType apartmentType: apartmentTypes){
	            stringToApartmentType.putIfAbsent(apartmentType.getType(), apartmentType);
	        }
	    }
	    
	    public static void main(String[] args) throws IOException {
//	        File file = new File(args[0]);
//	        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
	        FileReader file = new FileReader("sample_input/input3.txt");



	        // Creates a BufferedReader
	         BufferedReader bufferedReader = new BufferedReader(file);
	        
	        Apartment apartment = new Apartment();
	        String line = bufferedReader.readLine();
	        while(line != null){
	            if(line.contains("ALLOT_WATER")){
	                String[] inputs = line.split(" ");
	                ApartmentType apartmentType = stringToApartmentType.get(inputs[1]);
	                apartment.allotWater(apartmentType, inputs[2]);
	                
	            }
	            else if(line.contains("ADD_GUEST")){
	                String[] inputs = line.split(" ");
	                apartment.addGuest(Integer.parseInt(inputs[1]));
	            }
	            else if(line.contains("BILL")){
	                long billAmount = apartment.bill();
	                System.out.print(apartment.getWater().getTotalWaterConsumed(apartment.getApartmentType()) + " " + billAmount);
	            }
	            line = bufferedReader.readLine();
	        }
	        
	        
		}
}
