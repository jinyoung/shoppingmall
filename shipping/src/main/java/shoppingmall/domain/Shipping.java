package shoppingmall.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import shoppingmall.ShippingApplication;

@Entity
@Table(name = "Shipping_table")
@Data
public class Shipping {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String address;

    public static ShippingRepository repository() {
        ShippingRepository shippingRepository = ShippingApplication.applicationContext.getBean(
            ShippingRepository.class
        );
        return shippingRepository;
    }
}
