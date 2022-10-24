package com.hillel.store.domain;

import lombok.*;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String productName;
    private String category;
    private Double price;
    private Boolean isAvailable = Boolean.TRUE;

    @ManyToMany(fetch = FetchType.EAGER,mappedBy = "productsList")
    private List<Cart> cartList = new ArrayList<>();

}
