package ecom.icet.ecom.DTO;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Product {

    private String name;
    private String description;
    private Double price;
    private boolean isActive;
}
