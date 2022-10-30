package ma.enset.customerservice.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class CustomerRequestDto {
    private String id;
    private String name;
    private String email;
}
