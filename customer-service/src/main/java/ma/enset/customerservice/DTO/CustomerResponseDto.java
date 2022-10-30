package ma.enset.customerservice.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class CustomerResponseDto {
    private String id;
    private String name;
    private String email;
}
