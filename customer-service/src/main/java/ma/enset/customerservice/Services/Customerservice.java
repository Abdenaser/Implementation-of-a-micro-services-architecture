package ma.enset.customerservice.Services;

import ma.enset.customerservice.DTO.CustomerRequestDto;
import ma.enset.customerservice.DTO.CustomerResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface Customerservice {
    CustomerResponseDto getCustomer(String id);
    CustomerResponseDto saveCustomer(CustomerRequestDto customerRequestDto);
    CustomerResponseDto updateCustomer(CustomerRequestDto customerRequestDto);
    List<CustomerResponseDto> listcustomers();

    void deleteCustomer(String id);
}
