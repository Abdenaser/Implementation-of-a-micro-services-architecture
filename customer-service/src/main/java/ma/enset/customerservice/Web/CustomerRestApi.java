package ma.enset.customerservice.Web;


import ma.enset.customerservice.DTO.CustomerRequestDto;
import ma.enset.customerservice.DTO.CustomerResponseDto;
import ma.enset.customerservice.Services.Customerservice;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/")
public class CustomerRestApi {
    private Customerservice customerservice;

    public CustomerRestApi(Customerservice customerservice) {
        this.customerservice = customerservice;
    }

    @GetMapping("/customers")
    public List<CustomerResponseDto> getallcustomers(){
        return customerservice.listcustomers();
    }

    @PostMapping("/customer")
    public CustomerResponseDto saveCustomer(@RequestBody CustomerRequestDto customerRequestDto){
        customerRequestDto.setId(UUID.randomUUID().toString());
        return customerservice.saveCustomer(customerRequestDto);
    }

    @GetMapping("/customer/{id}")

    public CustomerResponseDto getCustomer(@PathVariable String id){
        return customerservice.getCustomer(id);
    }

    @PutMapping("/customer/{id}")
    public CustomerResponseDto updateCustomer(@PathVariable String id,CustomerRequestDto customerRequestDto){
        return customerservice.updateCustomer(customerRequestDto);
    }

    @DeleteMapping("/customer/{id}")
    public void deleteCustomer(@PathVariable String id){
        customerservice.deleteCustomer(id);
    }




}
