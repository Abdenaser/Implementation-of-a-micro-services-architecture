package ma.enset.customerservice.Services;

import ma.enset.customerservice.DTO.CustomerRequestDto;
import ma.enset.customerservice.DTO.CustomerResponseDto;
import ma.enset.customerservice.Entity.Customer;
import ma.enset.customerservice.Repositories.Customerrepository;
import ma.enset.customerservice.mappers.Customermapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class CustomerserviceImpl implements Customerservice{

    private Customerrepository customerrepository;
    private Customermapper customermapper;

    public CustomerserviceImpl(Customerrepository customerrepository, Customermapper customermapper) {
        this.customerrepository = customerrepository;
        this.customermapper = customermapper;
    }

    @Override
    public CustomerResponseDto getCustomer(String id) {
        Customer customer=customerrepository.findById(id).get();
        return customermapper.customerToCustomerResponseDto(customer);
    }

    @Override
    public CustomerResponseDto saveCustomer(CustomerRequestDto customerRequestDto) {
        Customer customer = customermapper.customerRequesteDtoToCustomer(customerRequestDto);
        Customer savedCustomer= customerrepository.save(customer);
        return customermapper.customerToCustomerResponseDto(savedCustomer);
    }

    @Override
    public CustomerResponseDto updateCustomer(CustomerRequestDto customerRequestDto) {
        Customer customer=customermapper.customerRequesteDtoToCustomer(customerRequestDto);
        Customer updatedCustomer=customerrepository.save(customer);
        return customermapper.customerToCustomerResponseDto(updatedCustomer);
    }

    @Override
    public List<CustomerResponseDto> listcustomers() {
        List<Customer> customers=customerrepository.findAll();
        List<CustomerResponseDto> customerResponseDtos=customers.stream()
                .map(customer -> customermapper.customerToCustomerResponseDto(customer))
                .collect(Collectors.toList());
        return customerResponseDtos;
    }
    @Override
    public void deleteCustomer(String id) {
        customerrepository.deleteById(id);
    }
}
