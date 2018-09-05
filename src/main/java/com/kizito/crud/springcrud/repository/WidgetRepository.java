package com.kizito.crud.springcrud.repository;
import com.kizito.crud.springcrud.model.Widget;
import org.springframework.data.repository.CrudRepository;
public interface WidgetRepository extends CrudRepository<Widget, Long> {
}
