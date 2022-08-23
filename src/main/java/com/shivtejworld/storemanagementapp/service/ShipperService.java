package com.shivtejworld.storemanagementapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shivtejworld.storemanagementapp.model.Shipper;
import com.shivtejworld.storemanagementapp.repository.ShipperRepository;

@Service
public class ShipperService {

	@Autowired
	private ShipperRepository shipperRepository;

	public List<Shipper> getAllShippers(){
		List<Shipper> shippersList = new ArrayList<Shipper>();

		Iterable<Shipper> iterator = shipperRepository.findAll();
		iterator.forEach(shipper -> shippersList.add(shipper));
	
		return shippersList;
	}
	
	public String deleteShipperById(Long shipperID) {
		shipperRepository.deleteById(shipperID);
		return "Deleted Shipper with ShipperID "+shipperID+" .";
	}
	
	public Shipper saveShipper(Shipper shipper) {
		return shipperRepository.save(shipper);
	}
	
	public String updateShipperPhone(Long shipperID, Integer phone){
		Optional<Shipper> myShipper = shipperRepository.findById(shipperID);
		if(myShipper.isPresent()) {
			myShipper.get().setPhone(phone);
			shipperRepository.save(myShipper.get());
			return "Phone Updated for Shipper with ShipperID " + shipperID;
		}
		else {
			return "Shipper with ShipperID " + shipperID + " Not Available";
		}
	
	}

	public String updateShipperName(Long shipperID, String shipperName) {
		Optional<Shipper> myShipper = shipperRepository.findById(shipperID);
		if(myShipper.isPresent()) {
			myShipper.get().setShipperName(shipperName);
			shipperRepository.save(myShipper.get());
			return "ShipperName Updated for Shipper with ShipperID " + shipperID;
		}
		else {
			return "Shipper with ShipperID " + shipperID + " Not Available";
		}
	}
}
