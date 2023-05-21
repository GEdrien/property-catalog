package progkor.catalog.propertycatalog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import progkor.catalog.propertycatalog.data.model.Property;
import progkor.catalog.propertycatalog.data.repository.Repository;
import progkor.catalog.propertycatalog.service.PropertyService;

import java.util.List;

/**
 * Service class that overwrite the methods of the Repository class
 */
@Service
public class DefaultPropertyService implements PropertyService {

    private final Repository<Property, Long> propertyRepository;

    @Autowired
    public DefaultPropertyService(Repository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    @Override
    public Property createProperty(Property property) {
        return propertyRepository.save(property);
    }

    @Override
    public Property retrievePropertyById(Long id) {
        return propertyRepository.getById(id);
    }

    @Override
    public List<Property> retrieveAllProperty() {
        return propertyRepository.getAll();
    }

    @Override
    public Property updateProperty(Property property) {
        return propertyRepository.update(property);
    }

    @Override
    public void deletePropertyById(Long id) {
        propertyRepository.deleteById(id);
    }
}
