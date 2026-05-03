package interfaces;

import java.util.List;

public interface Crud<T> {
    void create(T obj);

    List<T> findAll();

    T findByCode(String code);

    void update(String code, T obj);

    void delete(String code);

}
