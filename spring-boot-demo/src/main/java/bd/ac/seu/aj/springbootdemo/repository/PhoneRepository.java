package bd.ac.seu.aj.springbootdemo.repository;

import bd.ac.seu.aj.springbootdemo.model.Phone;
import org.springframework.data.repository.CrudRepository;

public interface PhoneRepository extends CrudRepository<Phone,Integer> {
}
