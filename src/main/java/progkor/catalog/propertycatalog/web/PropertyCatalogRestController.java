package progkor.catalog.propertycatalog.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import progkor.catalog.propertycatalog.data.model.Property;
import progkor.catalog.propertycatalog.service.PropertyService;

import java.util.List;

/**
 * RestController that perform basic requested methods
 */
@RestController
@RequestMapping("/properties")
public class PropertyCatalogRestController {

    private final PropertyService propertyService;

    @Autowired
    public PropertyCatalogRestController(PropertyService propertyService) {
        this.propertyService = propertyService;
    }

    @GetMapping("/{id}")
    public Property getPropertyById(@PathVariable Long id) {
        return propertyService.retrievePropertyById(id);
    }

    @GetMapping
    public List<Property> getAllProperty() {
        return propertyService.retrieveAllProperty();
    }

    @PostMapping
    public Property createProperty(@RequestBody Property property) {
        return propertyService.createProperty(property);
    }

    @PutMapping
    public Property updateProperty(@RequestBody Property property) {
        return propertyService.updateProperty(property);
    }

    @DeleteMapping("/{id}")
    public void deleteProperty(@PathVariable Long id) {
        propertyService.deletePropertyById(id);
    }
}

