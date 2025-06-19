package com.example.casa_connect.Service;

import com.example.casa_connect.Entity.Property;
import com.example.casa_connect.Entity.User;
import com.example.casa_connect.Repository.PropertyRepository;
import com.example.casa_connect.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyService {
    @Autowired
    private PropertyRepository propertyRepository;

    @Autowired
    private UserRepository userRepository;

    public Property createProperty(Property property, Long userId){
        User owner = userRepository.findById(userId).orElseThrow(()-> new RuntimeException("User not found"));
        property.setOwner(owner);
        return propertyRepository.save(property);
    }

    //getProperty by userId
    public Property getPropertyById(Long id){
        return propertyRepository.findById(id).orElseThrow(()-> new RuntimeException("Property not found"));
    }

    public List<Property> getAllProperties(){
        return propertyRepository.findAll();
    }
}
