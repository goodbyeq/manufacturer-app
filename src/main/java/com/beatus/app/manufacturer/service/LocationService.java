package com.beatus.app.manufacturer.service;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.beatus.app.manufacturer.model.Location;
import com.beatus.app.manufacturer.repository.LocationRepository;
import com.beatus.app.manufacturer.utils.Constants;

@Service
@Component("locationService")
public class LocationService {

	/*private static final Logger LOGGER = LoggerFactory.getLogger(LocationService.class);
	
	@Resource(name = "locationRepository")
	private LocationRepository locationRepository;
	
	public String addLocation(Location location, String companyId, String uid) throws ClassNotFoundException, SQLException {
		LOGGER.info("In addLocation");
		location.setCompanyId(companyId);
		location.setUid(uid);
		
		String resp = locationRepository.addLocation(location);
		return resp;
	}
	
	public String editLocation(Location location, String companyId, String uid) throws SQLException {
		LOGGER.info("In editLocation");
		location.setCompanyId(companyId);
		location.setUid(uid);

		String resp = locationRepository.editLocation(location);
		return resp;	
	}

	public List<Location> getLocations(String companyId) throws ClassNotFoundException, SQLException {
		LOGGER.info("In getLocations");
		List<Location> locations = locationRepository.getLocations(companyId);
		return locations;
	}
	public Location getLocationById(int locationId, String companyId) throws ClassNotFoundException, SQLException {
		LOGGER.info("In getLocationById");
		Location location = locationRepository.getLocationById(locationId, companyId);
		return location;
	}

	public String deleteLocation(int locationId, String companyId, String uid) throws SQLException {
		LOGGER.info("In deleteLocation");

		boolean isDeleted = locationRepository.deleteLocation(locationId, companyId);
		if(isDeleted){
			return Constants.REDIRECT + "/location/getLocations";
		}else {
			//TO-DO add a message that the row is not deleted
			return Constants.REDIRECT + "/location/getLocations";
		}
	}*/
}