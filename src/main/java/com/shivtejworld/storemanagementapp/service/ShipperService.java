package com.shivtejworld.storemanagementapp.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivtejworld.storemanagementapp.model.Shipper;
import com.shivtejworld.storemanagementapp.repository.ShipperRepository;

@Service
public class ShipperService {

	@Autowired
	private ShipperRepository shipperRepository;

	public List<Shipper> getAllShippers() {
		List<Shipper> shippersList = new ArrayList<Shipper>();

		Iterable<Shipper> iterator = shipperRepository.findAll();
		iterator.forEach(shipper -> shippersList.add(shipper));

		shippersList.sort((Shipper s1, Shipper s2) -> s2.getShipperId().compareTo(s1.getShipperId()));
		return shippersList;
	}

	public String deleteShipperById(Long shipperID) {
		shipperRepository.deleteById(shipperID);
		return "Deleted Shipper with ShipperID " + shipperID + " .";
	}

	public Shipper saveShipper(Shipper shipper) {
		Shipper sp = new Shipper();

		/*System.out.println(shipperRepository.count());*/
		return shipperRepository.save(shipper);
	}

	public String updateShipper(Long shipperID, String shipperName, Long phone) {
		Optional<Shipper> myShipper = shipperRepository.findById(shipperID);
		if (myShipper.isPresent()) {
			myShipper.get().setPhone(phone);
			myShipper.get().setShipperName(shipperName);
			shipperRepository.save(myShipper.get());
			return "Shipper with ShipperID " + shipperID + "Updated";
		} else {
			return "Shipper with ShipperID " + shipperID + " Not Available";
		}

	}

	/*
	 * public int getMaxShipperId() { return shipperRepository.maxShipperId(); }
	 */

}
