package ma.enset.customerservice.Repositories;

import ma.enset.customerservice.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Customerrepository extends JpaRepository<Customer,String> {

}
