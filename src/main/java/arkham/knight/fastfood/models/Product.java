package arkham.knight.fastfood.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Product implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private int price;

}
