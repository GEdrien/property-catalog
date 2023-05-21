package progkor.catalog.propertycatalog.service;

import progkor.catalog.propertycatalog.data.model.Property;

import java.util.List;

/**
 *  Defines methods for service other class
 */
public interface PropertyService {

    /**
     * @param property Property data type.
     * @return Property, id of the property
     */

    Property createProperty(Property property);

    Property retrievePropertyById(Long id);

    List<Property> retrieveAllProperty();

    Property updateProperty(Property property);

    void deletePropertyById(Long id);
}

