package com.example.casa_connect.Controller;

import com.example.casa_connect.Entity.Property;
import com.example.casa_connect.Service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/properties")
public class PropertyController {
    @Autowired
    private PropertyService propertyService;

    //create a post mapping
    @PostMapping
    public Property createProperty (@RequestBody Property property,
                                    @RequestParam Long UserId){
        return propertyService.createProperty(property,UserId);

    }

    @GetMapping("/{id}")
    public ResponseEntity<Property> getPropertyById(@PathVariable Long id){
        Property property = propertyService.getPropertyById(id);
        return ResponseEntity.ok(property);
    }

    @GetMapping
    public List<Property> getAllProperties(){
        return propertyService.getAllProperties();
    }
    
}
