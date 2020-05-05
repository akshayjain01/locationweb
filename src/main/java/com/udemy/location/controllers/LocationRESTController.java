package com.udemy.location.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.location.entities.Location;
import com.udemy.location.repos.LocationRepository;

@RestController
@RequestMapping("/locations")
public class LocationRESTController {

	@Autowired
	LocationRepository locationRepository;

	@GetMapping
	public List<Location> getAllLocations() {
		return locationRepository.findAll();
	}

	@PostMapping
	public void createLocation(@RequestBody Location location) {
		locationRepository.save(location);
	}

	@PutMapping
	public void updateLocation(@RequestBody Location location) {
		locationRepository.save(location);
	}

	@DeleteMapping("/{id}")
	public void deleteLocation(@PathVariable("id") int id) {
		locationRepository.deleteById(id);
	}

	@GetMapping("/{id}")
	public Location getLocation(@PathVariable("id") int id) {
		Optional<Location> optionalLocation = locationRepository.findById(id);
		if (optionalLocation.isPresent()) {
			Location location = optionalLocation.get();
			return location;
		}
		return null;
	}
}
