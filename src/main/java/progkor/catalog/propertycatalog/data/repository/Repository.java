package progkor.catalog.propertycatalog.data.repository;

import java.util.List;

/**
 * Defines the basic CRUD methods for Property.
 *
 * @param <T> Describes a Property data type.
 * @param <ID> Identification field of the T data.
 */
public interface Repository<T, ID> {

    T save(T item);

    T getById(ID id);

    List<T> getAll();

    T update(T item);

    void deleteById(ID id);
}
