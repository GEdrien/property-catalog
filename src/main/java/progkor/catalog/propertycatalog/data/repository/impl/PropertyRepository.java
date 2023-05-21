package progkor.catalog.propertycatalog.data.repository.impl;

import progkor.catalog.propertycatalog.data.model.Property;
import progkor.catalog.propertycatalog.data.repository.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *  Implementation of the Repository Interface
 */
@org.springframework.stereotype.Repository
public class PropertyRepository implements Repository<Property, Long> {

    private static final Map<Long, Property> STORAGE = new HashMap<>();

    @Override
    public Property save(Property property) {
        Long id = STORAGE.size() + 1L;
        property.setId(id);
        STORAGE.put(id, property);
        return STORAGE.get(id);
    }

    @Override
    public Property getById(Long id) {
        return STORAGE.get(id);
    }

    @Override
    public List<Property> getAll() {
        return STORAGE.values().stream().toList();
    }

    @Override
    public Property update(Property property) {
        Long id = property.getId();
        STORAGE.put(id, property);
        return STORAGE.get(id);
    }

    @Override
    public void deleteById(Long id) {
        STORAGE.remove(id);
    }
}

