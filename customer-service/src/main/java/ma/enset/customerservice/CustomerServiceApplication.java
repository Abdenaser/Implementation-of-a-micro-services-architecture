package ma.enset.customerservice;


import ma.enset.customerservice.DTO.CustomerRequestDto;
import ma.enset.customerservice.Services.Customerservice;
import ma.enset.customerservice.mappers.Customermapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class CustomerServiceApplication {



    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }


    @Bean
    CommandLineRunner start(Customerservice customerservice, Customermapper customermapper){
        return args -> {
            customerservice.saveCustomer(new CustomerRequestDto("1","mohamed","abdenaseraroukhsiss@gamil.com"));
            customerservice.saveCustomer(new CustomerRequestDto("2","abdelhadi","abdelhadi@gmail.com")) ;
        };
    }



}
