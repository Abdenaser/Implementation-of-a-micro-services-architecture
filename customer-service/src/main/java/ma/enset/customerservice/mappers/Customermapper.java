package ma.enset.customerservice.mappers;

import ma.enset.customerservice.DTO.CustomerRequestDto;
import ma.enset.customerservice.DTO.CustomerResponseDto;
import ma.enset.customerservice.Entity.Customer;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface Customermapper {
    CustomerResponseDto customerToCustomerResponseDto(Customer customer);
    Customer customerRequesteDtoToCustomer(CustomerRequestDto customerRequestDto);
}
